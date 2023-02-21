package tareacolas;

public class Main {

    public static void main(String[] args) {

        Cola cola = new Cola();
        System.out.println("COLA");

        cola.encola(new NodoCola(new Persona(901320952, "Gian", false)));
        cola.encola(new NodoCola(new Persona(209390242, "Javier", true)));
        cola.encola(new NodoCola(new Persona(102340543, "Steven", false)));
        cola.encola(new NodoCola(new Persona(304850485, "Maria", false)));

        System.out.print(cola.imprimir());
        
        System.out.print("\n");
        
        System.out.println(cola.encuentra(901320952)); //deberia de ser true
        System.out.println(cola.encuentra(209390242)); //deberia de ser true
        System.out.println(cola.encuentra(387367892)); //deberia de ser false

        Pila pila = new Pila();
        
        System.out.print("\n");
        
        System.out.println("PILA");

        pila.push(5);
        pila.push(5);
        pila.push(0);

        pila.listar();

    }

}
