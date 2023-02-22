/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fam.ForresterCalvo
 */
public class Cola {
    
    private nodoCola frente;
    private nodoCola ultimo;
    private int largo;

    public Cola(){
        this.frente = null;
        this.ultimo = null;
        this.largo = 0;
    }
    
    public void encola(nodoCola nuevoNodo){
        if(frente == null){//significa que la cola esta vacia
            frente = nuevoNodo;
            ultimo = nuevoNodo;
        }else{
            ultimo.setAtras(nuevoNodo);
            ultimo=nuevoNodo;
        }
        largo++;
    }
    
    public nodoCola atiende(){
        nodoCola aux = frente;
        if(frente!=null){
            frente=frente.getAtras();
            aux.setAtras(null);
            largo--;
        }
        return aux;
    }
    
    public boolean encuentra(cajasBanco referencia){
        if(frente != null){
            if(ultimo.getDato().getNombre().equals(referencia.getNombre())){
                return true;
            }else{
                nodoCola aux = frente;
                while(aux!=null){
                    if(aux.getDato().getNombre().equals(referencia.getNombre())){
                        return true;
                    }
                    aux=aux.getAtras();
                }
            }
        }
        return false;
    }
    
    public String imprimir(){
        String s="";
        nodoCola aux=frente;
        while(aux!=null){
            s+=aux.getDato().getNombre()+"\n";
            aux=aux.getAtras();
        }
        return s;
    }
}
