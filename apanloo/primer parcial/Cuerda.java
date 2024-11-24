package EjercicioDos;

public class Cuerda extends Instrumento{
    public Cuerda(){}
    public void afinar(){
        System.out.println("Cuerda.afinar() ");
    }
    public void tocar(){
        System.out.println("Cuerda.tocar() ");
    }
    public void tocar(String nota){
        System.out.println("Cuerda.tocar() " + nota);
    }
    public void cambiarSonido(String sonido){}
    public void acompañamientosAutomaticos(String acompañamiento){}
    public void grabarYReproducirMusica(String reproducirMusica){}
}
