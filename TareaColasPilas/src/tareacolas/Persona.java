package tareacolas;

public class Persona {
    
    
    private String nombreCliente;
    private int cedCliente;
    private boolean discapacidad;

    public Persona(String nombreCliente, int cedCliente, boolean discapacidad) {
        this.nombreCliente = nombreCliente;
        this.cedCliente = cedCliente;
        this.discapacidad = discapacidad;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public int getCedCliente() {
        return cedCliente;
    }

    public boolean isDiscapacidad() {
        return discapacidad;
    }
    
    
 
}
