package EjercicioDos;

public class Viento extends Instrumento{
    public Viento(){}
    public void afinar(){
        System.out.println("Viento.afinar() ");
    }
    public void tocar(){
        System.out.println("Viento.tocar ");
    }
    public void tocar(String nota){
        System.out.println("Viento.tocar() " + nota);
    }
    public void cambiarSonido(String sonido){}
    public void acompañamientosAutomaticos(String acompañamiento){}
    public void grabarYReproducirMusica(String reproducirMusica){}
}
