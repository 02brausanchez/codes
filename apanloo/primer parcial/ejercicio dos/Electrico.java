package EjercicioDos;

public class Electrico extends Instrumento{
    public Electrico(){}
    public void afinar(){}
    public void tocar(){}
    public void tocar(String nota){}
    public void cambiarSonido(String sonido){
        System.out.println("Electrico.cambiarSonido() "+ sonido);
    }
    public void acompañamientosAutomaticos(String acompañamiento){
        System.out.println("Eletrico.acompañamientoAutomaticos() " + acompañamiento );
    }
    public void grabarYReproducirMusica(String reproducirMusica){
        System.out.println("Electrico.grabarYReproducirMusica() " + reproducirMusica);
    }

}
