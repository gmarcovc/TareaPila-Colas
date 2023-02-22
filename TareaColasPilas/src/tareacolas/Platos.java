package tareacolas;

public class Platos {
    
    private String numPlato;
    private int cubiertos;

    public Platos(String numPlato, int cubiertos) {
        this.numPlato = numPlato;
        this.cubiertos = cubiertos;
    }

    public String getNumPlato() {
        return numPlato;
    }

    public int getCubiertos() {
        return cubiertos;
    }
    
}
