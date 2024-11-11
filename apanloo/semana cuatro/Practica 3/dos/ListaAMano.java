/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listaamano;

import java.util.Comparator;
import java.util.Iterator;

/**
 *
 * @author Administrador
 */
public class ListaAMano {

    /**
     * @param args the command line arguments
     * @throws java.lang.CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        // TODO code application logic here
        Lista<Series> l;
        Lista<Series> l2;
        l = new Lista<>();
        
                
        /*l.inserta(new Alumno(4, "eduardo"),porNombre);
        l.inserta(new Alumno(3, "jimena"),porNombre);
        l.inserta(new Alumno(2, "luis"),porNombre);
        l.inserta(new Alumno(1, "miguel"),porNombre);*/
        
        l.inserta(new Series("breaking bad ", " drama ",2015));
        l.inserta(new Series("better call saul ", " drama ",2015));
        l.inserta(new Series("mr.robot ", " tecno thriller ",2016));
        l.inserta(new Series("games of thrones ", " mitologia ",2012));

        System.out.println(l.NumElementos() + "\n");
        l.recorre();
        l.invierte();
        l.recorre();
        
        //l2 = l.clone();
        l2 = (Lista)l.copiar();
        System.out.println("Copiado");
        l2.recorre();
        l2.invierteIterativo();
        System.out.println("Copiado invertido");
        l2.recorre();
        System.out.println("Original del Copiado");
        l.recorre();
        
        
        System.out.println("de nuevo");
        
        Nodo d = l.getPrimero(); 
        Series a = (Series)d.info;
        //a.setMatricula(25);
        l.recorre();
        l2.recorre();
        
        
        //Prueba de recorrido utilizando un Iterator
        System.out.println("Con iterador");
        Iterator i = l2.iterator();
        while (i.hasNext()){
            System.out.println((Series)i.next());
        }
        
        //Prueba con foreach
         System.out.println("Con foreach");
        for (Object unAlumno:l2)
        {
            System.out.println(((Series)unAlumno));
        }
        
        // Using forEach with a lambda expression
        l2.forEach(unAlumno -> System.out.println(unAlumno));

        // Using forEach with a method reference
        l2.forEach(System.out::println);
        
    }
    
    public static Comparator<Series>  porNombre = new Comparator<Series>() {
            @Override
            public int compare(Series a, Series b) {
                
                return a.getNombreSerie().compareTo(b.getNombreSerie());
            }
        };
        /* public static Comparator<Series>  ponYear = new Comparator<Series>() {
            @Override
            public int compare(Series a, Series b) {
                
                return (int)(a.getYearSerie()- b.getYearSerie());
            }
        };*/ 
}
