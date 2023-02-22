package tareacolas;

public class Cola {
    private NodoCola frente;
    private NodoCola ultimo;
    private int largo;
    
    public Cola(){
        this.frente = null;
        this.ultimo = null;
        this.largo = 0;
    }
    public void imprimirTercero(){
        System.out.print("La tercera orden es: "
                +frente.getAtras().getAtras().getDato().getNombreCliente());
    }
    
    public void encola(NodoCola nuevoNodo){
        if(frente==null){
            frente = nuevoNodo;
            ultimo = nuevoNodo;
        }else if(nuevoNodo.getDato().isDiscapacidad()){
            nuevoNodo.setAtras(frente);
            frente=nuevoNodo;
        }
        else{
            ultimo.setAtras(nuevoNodo);
            ultimo=nuevoNodo;
        }
        largo++;
    }
    public NodoCola atiende(){
        NodoCola aux = frente;
        if(frente!=null){
            frente=frente.getAtras();
            aux.setAtras(null);
            largo--;
        }
        return aux;
    }
    public boolean encuentra(int cedula){
        if(frente!=null){
            if(ultimo.getDato().getCedCliente()== cedula){
                return true;
            }else{
                NodoCola aux=frente;
                while(aux!=null){
                    if(aux.getDato().getCedCliente()==cedula){
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
        NodoCola aux=frente;
        while(aux!=null){
            s+=aux.getDato().getNombreCliente()+"\n";
            aux=aux.getAtras();
        }
        return s;
    }
}
