/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fam.ForresterCalvo
 */
public class cajasBanco {
    private String Nombre;
    private int cedula;
    private boolean clasificacion;

    public cajasBanco(String Nombre, int cedula, boolean clasificacion) {
        this.Nombre = Nombre;
        this.cedula = cedula;
        this.clasificacion = clasificacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public boolean isClasificacion() {
        return clasificacion;
    }
    
    
}
