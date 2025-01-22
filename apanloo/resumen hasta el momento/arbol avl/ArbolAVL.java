/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolavl;

/**
 *
 * @author Administrador
 */
public class ArbolAVL {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Arbol a;
        a = new Arbol();
        a.inserta(6);
        
        a.inserta(4);
        
        a.inserta(7);
        
        a.inserta(9);
        
        a.inserta(10);
        a.inserta(5);

        a.inserta(2);

        a.inserta(1);

        
        a.inserta(0);

        a.inserta(20);
        a.inserta(25);
        a.inserta(12);
        a.inserta(13);
        a.inserta(14);
        a.recorre();
        a.recorrePar();
        
    }
}
