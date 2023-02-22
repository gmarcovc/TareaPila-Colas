package tareacolas;

public class Main {

    public static void main(String[] args) {

        
        Cola cola = new Cola();
        
        cola.encola(new NodoCola(new Persona("Edwin", 118780469,false)));
        cola.encola(new NodoCola(new Persona("Isaac", 116605948,false)));
        cola.encola(new NodoCola(new Persona("Ignacio", 110491240,true)));
        cola.encola(new NodoCola(new Persona("Jose Carloss", 110346902,false)));
        
        System.out.println(cola.imprimir());
        System.out.println(cola.encuentra(110491232));
        
        Pila pila = new Pila();
        pila.push(new Platos("001",2));
        pila.push(new Platos("002",2));
        pila.push(new Platos("003",5));
        
        pila.listar();
    }

}
