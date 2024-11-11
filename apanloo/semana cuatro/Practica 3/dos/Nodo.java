/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listaamano;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrador
 * @param <T>
 */
public class Nodo <T extends Comparable<T> & Cloneable & Copiable> implements Cloneable, Copiable{
    T info;
    Nodo sig;
    
    public int compareTo(T d){
        return info.compareTo(d);
    }
    
    /**
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public Nodo clone() throws CloneNotSupportedException{
        Nodo aux = new Nodo();
        
        aux.sig = null;
        
        Method mclone=null;
        try {
            mclone = (this.info.getClass()).getMethod("clone");
        } catch (NoSuchMethodException | SecurityException ex) {
            Logger.getLogger(Nodo.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            aux.info = (T)mclone.invoke(this.info);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(Nodo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return aux;
    }
    
    /**
     *
     * @return
     */
    @Override
    public Object copiar() {
        Nodo aux = new Nodo();
        
        aux.sig = null;
        
        aux.info = (T)this.info.copiar();
        
        return aux;
    }
}
