package listaamano;

import java.util.Comparator;
import java.util.Iterator;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 * @param <T>
 */
public class Lista <T extends Comparable<T> & Copiable> implements Cloneable, Iterable, Copiable {
 
    private Nodo l;
    T info;
    
    
    
    private Nodo insertaOrdRec(Nodo l, T info){
        
        //Lista vacía
        if (l == null){
            Nodo aux = new Nodo();    
            aux.info = info;
            return aux;   
        }
        
        //primer elemento de la lista
        
        if (l.info.compareTo(info)> 0){
            Nodo aux = new Nodo();    
            aux.info = info;
            aux.sig = l;
            return aux;               
       }
        
       // Está en la sublista 
       l.sig = insertaOrdRec(l.sig, info); 
       return l;
    }
    
     private Nodo insertaOrdRec(Nodo l, T info, Comparator c){
        
        //Lista vacía
        if (l == null){
            Nodo aux = new Nodo();    
            aux.info = info;
            return aux;   
        }
        
        //primer elemento de la lista
        
        if (c.compare(l.info, info)> 0){
            Nodo aux = new Nodo();    
            aux.info = info;
            aux.sig = l;
            return aux;               
       }
        
       // Está en la sublista 
       l.sig = insertaOrdRec(l.sig, info, c); 
       return l;
    }
    
    public void inserta(T info){
        this.l = insertaOrdRec(l, info);
    }
    
    public void inserta(T info, Comparator c){
        this.l = insertaOrdRec(l, info, c);
    }
    
    public void recorre(){
        for (Nodo aux = l;aux != null; aux=aux.sig){
          System.out.println(aux.info);  
        }
            
    }
    private int NumElementosRec(Nodo l){
        if (l == null) {return 0;}
        return 1 + NumElementosRec(l.sig);
    }
    public int NumElementos(){
        return NumElementosRec(this.l);
    }
    
    private Nodo invierteRec(Nodo l){
        Nodo aux;
        if (l==null){return null;}
        if (l.sig == null) {return l;}
        aux = invierteRec(l.sig);
        l.sig.sig = l;
        l.sig = null;
        return aux;
    }
            
    public void invierte(){
        this.l = invierteRec(this.l);
    }
    
    public void invierteIterativo(){
        Nodo ant, act, sig;
        if (l==null){
            return;
        }
        ant = null;
        act = l;
        while (act.sig!=null){
            sig = act.sig;
            act.sig = ant;
            ant = act;
            act =  sig;
        }
        act.sig = ant;
        l = act;
    }
    
    
    public Nodo getPrimero(){
        if (this.l==null){
            return null;
        }
        return this.l;
        
    }
    
    private Nodo cloneRec(Nodo l) throws CloneNotSupportedException{
        if (l == null){
            return null;
        }
        Nodo aux;
        aux = l.clone();
        aux.sig = cloneRec(l.sig);
        return aux;
    }
    
    @Override
    public Lista clone() throws CloneNotSupportedException{
        Lista newLista = null;
        Nodo auxUlt = null;
        
        for (Nodo aux = this.l; aux != null; aux=aux.sig){
            Nodo aux2 = aux.clone();
            if (newLista == null){
                newLista = new Lista();
                newLista.l = aux2;
            }
            aux2.sig = null;
            if (auxUlt !=null){
                auxUlt.sig= aux2;
            }
            auxUlt = aux2;
                
            
        }
        return newLista;
    }
    
    @Override
     public Object copiar() {
         
        Lista newLista = null;
        Nodo auxUlt = null;
        
        for (Nodo aux = this.l; aux != null; aux=aux.sig){
            Nodo aux2 = (Nodo)aux.copiar();
            if (newLista == null){
                newLista = new Lista();
                newLista.l = aux2;
            }
            aux2.sig = null;
            if (auxUlt !=null){
                auxUlt.sig= aux2;
            }
            auxUlt = aux2;
                
            
        }
        return newLista;
    }
    
     //Implementación de la interfaz Iterable
    @Override
    public Iterator<T> iterator() {    
        Iterator it = new MiIterator<T>();
        return it;         
    }
    
    protected class MiIterator<T> implements Iterator<T>  {

        Nodo posActual;

        //Apunta al primer elemento de la lista
        public MiIterator()   { posActual = l; }

        @Override
        public boolean hasNext() {
            return posActual != null;
        }

        @Override
        public T next() {

            if (posActual == null){return null;}
            T aux;
            
            aux = (T) posActual.info;
            posActual = posActual.sig;
            
            return aux; 

        }

        @Override
        public void remove(){

            throw new UnsupportedOperationException("No soportado.");

        }

    }
}


 