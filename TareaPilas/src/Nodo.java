/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fam.ForresterCalvo
 */
public class Nodo {
    
    private trasteSucio valor;
    private Nodo siguiente;
    
    //constructor para inicializar

    public Nodo() {
        this.valor = null;
        this.siguiente = null;
    }

    public trasteSucio getValor() {
        return valor;
    }

    public void setValor(trasteSucio valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
}
