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

public Lista clonar()

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
