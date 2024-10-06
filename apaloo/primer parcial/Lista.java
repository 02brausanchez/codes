package EjercicioSeis;
public class Lista {
    private NodoLista frente;

    public Lista(){
        frente = null;
    }

    public boolean vacia(){
        return frente == null;
    }

    public void encolarLista(String cadena){
        if(frente == null){
            frente = new NodoLista(cadena);
        }else{
            NodoLista ultimo;
            for(ultimo = frente; ultimo.sig != null; ultimo = ultimo.sig){

            }
            ultimo.sig = new NodoLista(cadena);
        }
    }

    public String desencolarLista(){
        if(frente == null){
            return "-1";
        }
        String aux = frente.elemento;
        frente = frente.sig;
        return aux;
    }

    public String toString(){
        String valores = "";
        NodoLista aux;
        for(aux = frente; aux != null; aux = aux.sig){
            valores += aux.elemento;
            if(aux.sig != null){
                valores += ",";
            }
        }
        return valores;
    }

    public Lista clonar(){
        Lista listaClonada = new Lista();
        NodoLista aux = frente; //Nodo para recorrer la lista original

        //Se recorre la lista original
        while(aux != null){
            listaClonada.encolarLista(aux.elemento); //Clonar cada elemento
            aux = aux.sig;
        }
        return listaClonada;
    }
}
