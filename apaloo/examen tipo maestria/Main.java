package ExamenesDeMaestria;
import javax.swing.*;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    static Objeto x;
    public static void main(String[] args) {
        /*
        Coordenada c1 = new Coordenada(1,1,1);
        Coordenada c2 = new Coordenada(2,2,2);
        */

        List<Objeto> l = new LinkedList();
        l.add(new Objeto("perro"));
        l.add(new Objeto("gato"));
        l.add(new Objeto("loro"));
        l.add(new Objeto("diabolo"));
        l.add(new Objeto("angel"));
        l.sort(c);

        for(Objeto o:l){
            System.out.println(o);
   
   
        }

        //System.out.println(BusquedaBinaria(l,"perro"));
        String s = JOptionPane.showInputDialog("Dame el nombre del objeto ");
        
        x = BusquedaBinaria(l,s);
        l.sort(c2);
        System.out.println("Ordenados con respecto a la distancia de " + "perro");
        for(Objeto o : l){
            System.out.println(o);
        }

        /*
        Objeto c1 = new Objeto("perro");
        Objeto c2 = new Objeto("gato");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1.distanciaAUnObjeto(c2));
        System.out.println(c2.distanciaAUnObjeto(c1));
        */

    }
    static Comparator<Objeto> c = (Objeto a, Objeto b) -> a.nombre.compareTo(b.nombre);

    static int distancia(Objeto a , Objeto b){
        double d1, d2;
        d1 = a.distanciaAUnObjeto(x);
        d2 = b.distanciaAUnObjeto(x);
        if(d1 > d2){
            return  1;
        }
        if(d1 < d2){
            return -1;
        }
        return 0;
    }

    static Comparator<Objeto> c2 = (Objeto a, Objeto b) -> distancia(a,b);


    public static Objeto BusquedaBinaria(List <Objeto> l, String nombre){
        int min, max, medio;
        min = 0;
        max = l.size()-1;

        while(min <= max){
            medio = (max + min) /2;
            Objeto mo = l.get(medio);
            if(mo.nombre.compareTo(nombre) == 0){
                return mo;
            }
            if(mo.nombre.compareTo(nombre) > 0){
                max = medio-1;
            }else{
                min = medio + 1;
            }
        }
        return null;
    }
}