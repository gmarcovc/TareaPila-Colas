package tareacolas;

public class NodoPila {
    private Platos valor;
    private NodoPila siguiente;
    private Platos dato;
    
    //constructor para inicializar

    public NodoPila() {
        this.valor = null;
        this.siguiente = null;
        this.dato = dato;
    }

    public Platos getDato() {
        return dato;
    }

    public void setDato(Platos dato) {
        this.dato = dato;
    }
    
    public Platos getValor() {
        return valor;
    }

    public void setValor(Platos valor) {
        this.valor = valor;
    }

    public NodoPila getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPila siguiente) {
        this.siguiente = siguiente;
    }

    
}
