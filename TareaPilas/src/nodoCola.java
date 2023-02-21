/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fam.ForresterCalvo
 */
public class nodoCola {
    
    private cajasBanco dato;
    private nodoCola atras;

    public nodoCola(cajasBanco dato) {
        this.dato = dato;
        this.atras = null;
    }

    public cajasBanco getDato() {
        return dato;
    }

    public void setDato(cajasBanco dato) {
        this.dato = dato;
    }

    public nodoCola getAtras() {
        return atras;
    }

    public void setAtras(nodoCola atras) {
        this.atras = atras;
    }
    
}
