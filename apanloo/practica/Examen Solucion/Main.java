package MetodosExamen;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

class EdadException extends Exception{
    public EdadException (String mensaje){
        super(mensaje);
    }
}

class FechaException extends Exception{
    public FechaException(String mensaje){
        super(mensaje);
    }
}

class GeneroException extends Exception{
    public GeneroException(String mensaje){
        super(mensaje);
    }
}

class Persona {
    GregorianCalendar fechaNacimiento;
    char genero;

    public void ponFechaNacimiento (GregorianCalendar fecha) throws FechaException{
        GregorianCalendar hoy = new GregorianCalendar();
        if(fecha.after(hoy)){
            throw new FechaException("La fecha no puede estar adelantada");
        }
        if(fecha.get(Calendar.YEAR) < hoy.get(Calendar.YEAR) - 130){
            throw new FechaException("La fecha de nacimiento excede los 130 años");
        }
        this.fechaNacimiento = fecha;
    }

    public void ponGenero(char genero) throws GeneroException{
        if(genero != 'H' && genero != 'M'){
            throw new GeneroException("Caracter no valido, solo se acepta 'H' y 'M' ");
        }
        this.genero = genero;
    }

    public int edad(GregorianCalendar fechaNacimiento){
        Calendar now = new GregorianCalendar();
        int res = now.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
        if ((fechaNacimiento.get(Calendar.MONTH) > now.get(Calendar.MONTH))
                || (fechaNacimiento.get(Calendar.MONTH) == now.get(Calendar.MONTH) &&
                fechaNacimiento.get(Calendar.DAY_OF_MONTH) > now
                        .get(Calendar.DAY_OF_MONTH))) {
            res--;
        }
        return res;
    }

    @Override
    public String toString(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = fechaNacimiento != null ? sdf.format(fechaNacimiento.getTime()): "No definida";
        assert fechaNacimiento != null;
        return "[ fecha " + fecha + ", Edad " + edad(fechaNacimiento) + ", Genero " + genero + " ]";
    }
}

class Cuerda {

}

class Electrico {

}

class Instrumento {

}

class Percusion {

}

class Viento {

}

class Nodo{
    Nodo hizq, hder;
    //char info;
    char info;

    public Nodo(char info){
        this.info = info;
        hder = hizq = null;
    }

    @Override
    public String toString(){
        return ""+info;
    }
}

class Arbol{
    Nodo raiz;

    public Arbol(){
        raiz = null;
    }

    /*
    public Arbol datos(){
        Arbol aux = new Arbol();
        aux.raiz = new Nodo(1);
        aux.raiz.hizq = new Nodo(4);
        aux.raiz.hder = new Nodo(6);
        aux.raiz.hizq.hizq = new Nodo(2);
        aux.raiz.hizq.hder = new Nodo(3);
        aux.raiz.hder.hizq = new Nodo(7);
        aux.raiz.hder.hder = new Nodo(9);
        return aux;
    }*/

    //Primer metodo que se tengo que saber que como se implemento
    public int [] sumaxNiveles(int nivel){
        int [] valores = new int[nivel];
        if(raiz == null){
            return valores;
        }
        List<Nodo> l = new LinkedList<>();
        l.add(raiz);
        int suma = 0;
        for(int i = 1; i <=nivel && ((l.size())!=0); i++){
            int limite = l.size();
            for(int j = 0; j < limite; j++){
                Nodo a = l.remove(0);
                suma += a.info;
                if(a.hizq != null){
                    l.add(a.hizq);
                }
                if(a.hder != null){
                    l.add(a.hder);
                }
                valores[i-1] = suma;
            }
        }
        return valores;
    }

    //Metodo de clonar de tipo Arbo
    private Arbol clonar(Nodo a){
        Arbol clonado = new Arbol();
        if(a == null){
            return clonado;
        }
        clonado.raiz = new Nodo (a.info);

        if(a.hizq != null){
            clonado.raiz.hizq = clonar(a.hizq).raiz;
        }
        if(a.hder != null){
            clonado.raiz.hder = clonar(a.hder).raiz;
        }
        return clonado;
    }

    public Arbol clonar(){
        return clonar(raiz);
    }
    public String visitaxNivel(){
        String aux = "";
        List<Nodo> l = new LinkedList<>();
        //Agregamos la raiz
        l.add(raiz);
        int tam;
        while((tam = l.size())!= 0){
            for(int i = 0; i < tam; i++){
                Nodo a = l.remove(0);
                if("".equals(aux)){
                    aux = ""+a;
                }else{
                    aux += ","+a;
                }
                if(a.hizq != null){
                    l.add(a.hizq);
                }
                if(a.hder != null){
                    l.add(a.hder);
                }
            }
        }
        return aux;
    }

    public int visitaxNivel2(Nodo raiz){
        if(raiz == null){
            return -1;
        }
        List<Nodo> l = new LinkedList<>();
        l.add(raiz);
        int tam;
        int nivel = 0;
        boolean hoja = false;

        while((tam = l.size())!= 0){
            nivel++;
            for(int i = 0; i < tam; i++){
                Nodo a = l.remove(0);
                if(a.hizq == null && a.hder == null){
                    hoja = true;
                }else{
                    if(hoja){
                        return -1;
                    }
                }
                if(a.hizq != null){
                    l.add(a.hizq);
                }
                if(a.hder != null){
                    l.add(a.hder);
                }
            }
        }
        return nivel;
    }

    public boolean visitaxNivel2(){
        return visitaxNivel2(raiz)>=0;
    }
    public String toString(Nodo a) {
        if (a == null) return "";
        String aux = "" + a;
        if (a.hizq != null || a.hder != null) {
            aux += "(" + toString(a.hizq);
            if (a.hder != null){
                aux += "," + toString(a.hder);
            }
            aux += ")";
        }
        return aux;
    }

    public int [] recorridoxNivel(){
        int [] datos = new int[4];
        if(raiz == null){
            return datos;
        }
        List<Nodo> l = new LinkedList<>();
        l.add(raiz);
        int tope;
        while((tope = l.size())!= 0){
            Nodo a = l.remove(0);
            datos[0]++;
            Nodo hijoIzquierdo = a.hizq;
            Nodo hijoDerecho = a.hder;

            if(hijoIzquierdo == null && hijoDerecho == null){
                datos[1]++;
            } else if (hijoIzquierdo != null && hijoDerecho != null) {
                datos[3]++;
            }else{
                datos[2]++;
            }
            if(a.hizq != null){
                l.add(a.hizq);
            }
            if(a.hder != null){
                l.add(a.hder);
            }
        }
        return datos;
    }
    @Override
    public String toString() {
        if(raiz == null){
            return "null";
        }
        return toString(raiz);
    }

    private Nodo strToArbol(char[]s, int [] i){
        Nodo aux = new Nodo(s[i[0]]); //elemento 0 del arreglo
        i[0]++;
        if(s[i[0]] == '('){
            i[0]++; //salta
            if(s[i[0]] == ','){
                i[0]++; //salta
                aux.hder = strToArbol(s,i);
                i[0]++; //salta
                return aux;
            }
            aux.hizq = strToArbol(s,i);
            if(s[i[0]] == ','){
                i[0]++; //salta ,
                aux.hder = strToArbol(s,i);
                i[0]++;//salta )
                return aux;
            }
            i[0]++; //salta )
            return aux;
        }
        return aux;
    }

    public Arbol(String a){
        if(a == null ||a.length() == 0 ){
            raiz = null;
            return;
        }
        char [] s = (a + "#").toCharArray();
        int [] i = new int [1];
        i[0] = 0;
        raiz = strToArbol(s,i);
    }
}


public class Main {
    /*
    public static void main2(String[] args) {
        Arbol a = new Arbol();
        a = a.datos();
        System.out.println(Arrays.toString(a.sumaxNiveles(3)));
        Arbol b = new Arbol();
        b = b.datos();
        Arbol clonado = b.clonar();
        System.out.println("El arbol original: "+ b.visitaxNivel2());
        System.out.println("El arbol clonado: "+ clonado.visitaxNivel2());
    }*/

    public static void main(String[] args) {
        Arbol c = new Arbol("a(b(c,d),e(f,g))");
        Arbol clon = c.clonar();
        System.out.println("Arbol C original: " + c);
        System.out.println("Arbol de C clonado: " + clon);

        Persona alguien = new Persona();
        try {
            alguien.ponFechaNacimiento(new GregorianCalendar(2002, 1, 19));
            System.out.println(alguien);
        }catch (FechaException e){
            System.out.println("(Fecha) Se ha producido un error: ");
            System.out.println(e.getMessage());
        }
        try {
            alguien.ponGenero('P');
        }catch (GeneroException e){
            System.out.println("(Genero) Se ha producido un error ");
            System.out.println(e.getMessage());
        }
        try {
            alguien.ponFechaNacimiento(new GregorianCalendar(2003, 2, 28));
            alguien.ponGenero('H');
            System.out.println(alguien);
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
