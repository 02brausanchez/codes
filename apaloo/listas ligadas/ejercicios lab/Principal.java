package apaloo;

public class Principal {
    public static void main(String[] args) {
        Circulo oCirculo; 
        oCirculo = new Circulo(); 
        
        oCirculo.setRadio(10.0);
        oCirculo.calcularArea();
        oCirculo.calcularPerimetro();
        System.out.println(oCirculo.getArea());
        System.out.println(oCirculo.getPerimetro());

        Figura oFigura = new Figura(); 
        oFigura.calcularArea();
        oFigura.calcularPerimetro();

        Paralelogramo oParalelogramo; 
        oParalelogramo = new Paralelogramo(10.0,5.0); 
        oParalelogramo.calcularArea();
        oParalelogramo.calcularPerimetro();
        System.out.println(oParalelogramo.getArea());
        System.out.println(oParalelogramo.getPerimetro());

    }
}


Tengo una duda con respecto a la descripcion de este problema no se si lo estoy resolviendo de acuerdo a lo que se me pide
directamente al usar una pila o una cola o simplemente usar un metodo especifico como es el caso de un Linked list<Intefer> ..
Descripcion de l problema:
Modificar la lista ligada para que en lugar de enteros almacene cadenas. Agregue el metodo clonar que tambien clone las cadenas almacenadas.
Una lista clonada debera de tener los mismos elementos de la original, pero debera ser totalmente idenpendiente. El metodo clonar regresara
una lista INDEPENDIENTE.
public Lista clonar()
El codigo que he hecho hasta el momento

package ProblemSix;

public class Lista{
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

    }

}

package ProblemSix;

public class NodoLista {
    String elemento;
    NodoLista sig;

    public NodoLista(String elemento){
        this.elemento = elemento;
        this.sig = null;
    }

}

package ProblemSix;

public class MainLista {
    public static void main(String[] args) {
        Lista c = new Lista();
        c.encolarLista("eduardo");
        c.encolarLista("tadeo");
        c.encolarLista("carlos");
        c.encolarLista("pedro");

        System.out.println(c.toString());



    }
}
