package tareacolas;

public class Persona {
    
    private int cedula;
    private String nombre;
    private boolean discapacidad;

    public Persona(int cedula, String nombre, boolean discapacidad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.discapacidad = discapacidad;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(boolean discapacidad) {
        this.discapacidad = discapacidad;
    }
 
}
