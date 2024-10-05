package ExamenesDeMaestria;

import java.util.Random;

public class Objeto {
    String nombre;
    Coordenadas c;

    public Objeto(String nombre){
        this.nombre = nombre;
        Random r = new Random();
        //este es para cuando se usa solamente las coordenadas
        /*
        c.x = (int) (r.nextInt(91) + 10);
        c.y = (int) (r.nextInt(91) + 10);
        c.z = (int) (r.nextInt(91) + 10);
        */
        //este es cuando se usa solamente el objeto
        c = new Coordenadas((int)(r.nextInt(91)+10),(int)(r.nextInt(91)+10),(int)(r.nextInt(91)+10));
    }
    @Override
    public String toString(){
        return nombre + c;
    }

    //Queda pendiente este apartado
    public double distanciaAUnObjeto(Objeto o){
        return o.c.distaciaAUnPunto(this.c.x, this.c.y, this.c.z);
    }
}