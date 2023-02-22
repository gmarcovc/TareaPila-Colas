/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fam.ForresterCalvo
 */
public class Pilas {
    
    private Nodo cima;
    private int largo;
    private int totalcubiertos;

    public Pilas() {
        this.cima = null;
        this.largo = 0;
    }
    
    public boolean Vacia(){ return cima == null;}
    
    public int tamanio(){ return this.largo;}
    
    public void push(trasteSucio valor){
        Nodo newNode = new Nodo();
        newNode.setValor(valor);
        
        if (this.Vacia()){
            this.cima = newNode;
        }
        else{
            totalcubiertos = totalcubiertos + valor.getCubiertos();
            newNode.setSiguiente(this.cima);
            this.cima = newNode;
        }
        this.largo++;
    }
    
    public void pop(){
        if (!Vacia()) {
            // Asigna como primer node al siguiente de la pila.
            this.cima = this.cima.getSiguiente();
            // Decrementa el contador del tamaño de la pila
            this.largo--;
        }
    }
    
    public boolean search(trasteSucio reference) {
        // Crea una copia de la pila.
        Nodo aux = cima;
        // Bandera para verificar si exist el elemento a search.
        boolean exist = false;
        // Recorre la pila hasta llegar encontrar el node o llegar al final
        // de la pila.
        while (exist != true && aux != null) {
            // Compara si el value del node es igual que al de reference.
            if (reference.getNumerotrasteSucio().equals(aux.getValor().
                    getNumerotrasteSucio())) {
                // Cambia el value de la bandera.
                exist = true;
            } else {
                // Avanza al siguiente node.
                aux = aux.getSiguiente();
            }
        }
        // Retorna el value de la bandera.
        return exist;
    }
    
        public void popModificado(trasteSucio reference){
        // Consulta si el value exist en la pila.
        if (search(reference)) {
            // Crea una pila auxiliar para guardar los valuees que se 
            // vayan desapilando de la pila original.
            Nodo cimapPilaAux = null;
            // Recoore la pila hasta llegar al node que tenga el value
            // igual que el de reference.
            while(reference.getNumerotrasteSucio().equals(cima.getValor().
                    getNumerotrasteSucio())){
                // Crea un node temporal para agregarlos a la pila auxiliar.
                Nodo temp = new Nodo();
                // Ingresa el value al node temporal.
                temp.setValor(cima.getValor());
                // Consulta si la pila auxiliar no a sido inicializada.
                if(cimapPilaAux == null){
                    // Inicializa la pila auxiliar.
                    cimapPilaAux = temp;
                }
                // Caso contrario si la pila auxiliar ya contiene elementos
                // los agrega al start.
                else{
                    temp.setSiguiente(cimapPilaAux);
                    cimapPilaAux = temp;
                }
                // Elimina el node del tope de la pila hasta llegar al node
                // que se desea eliminar.
                pop();
            }
            // Elimina el node que coincide con el de reference.
            pop();
            // Regresa los valuees de la pila auxiliar a la pila original
            // mientras la pila auxiliar tenga elementos.
            while(cimapPilaAux != null){
                // Utiliza el metodo push para regresar los elementos a 
                // la pila original.
                push(cimapPilaAux.getValor());
                // Avansa al siguiente node de la pila auxiliar.
                cimapPilaAux = cimapPilaAux.getSiguiente();
            }
            // Libera la memoria utilizada por la pila auxiliar.
            cimapPilaAux = null;
        }
        else{
            System.out.println("El nodo indicado no existe");
        }
    } 
        public void listar(){
        // Crea una copia de la pila.
        Nodo aux = cima;
        // Recorre la pila hasta el ultimo node.
        while(aux != null){
            System.out.println("Metodo de Pilas"+"\n\n");
            System.out.println("|\t" + aux.getValor().getNumerotrasteSucio()+ 
                     "\t|"+"|\t"+ aux.getValor().getVasos()+"\t|"+ "|\t"
            + aux.getValor().getCubiertos()+"\t|");
            System.out.println("-----------------");
            aux = aux.getSiguiente();
        }
        System.out.println("\n|\t Total de cubiertos "+totalcubiertos+"\t|");
    }
    
}
