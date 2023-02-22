package tareacolas;

public class NodoCola {
private Persona dato;
private NodoCola atras;
    
public NodoCola(Persona dato) {
this.dato = dato;
this.atras = null;
}

    public Persona getDato() {
        return dato;
    }

    public void setDato(Persona dato) {
        this.dato = dato;
    }

    public NodoCola getAtras() {
        return atras;
    }

    public void setAtras(NodoCola atras) {
        this.atras = atras;
    }


}
