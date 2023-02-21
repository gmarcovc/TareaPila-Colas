/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author fam.ForresterCalvo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Se inician los metodos
        Cola cola = new Cola();
        Pilas pila = new Pilas();
        // Se establece impresion de pilas
        pila.push(new trasteSucio("001",5,3));
        pila.push(new trasteSucio("002",3,7));
        pila.push(new trasteSucio("003",8,2));
        pila.push(new trasteSucio("004",4,11));
        
        pila.listar();
        
        // Se establece impresion de colas
        cola.encola(new nodoCola(new cajasBanco("Jose",6,false)));
        cola.encola(new nodoCola(new cajasBanco("Daniel",8,true)));
        cola.encola(new nodoCola(new cajasBanco("Angel",9,true)));
        cola.encola(new nodoCola(new cajasBanco("Bryan",7,false)));
        
        System.out.println("\n\n"+"|\tMetodo de Colas \t|"+"\n");
        System.out.println("\n"+cola.imprimir());
        
        cola.atiende();
        System.out.println(cola.imprimir());
        
    }
    
}
