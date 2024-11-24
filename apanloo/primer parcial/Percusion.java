package EjercicioDos;

public class Percusion extends Instrumento{
    public Percusion(){}
    public void afinar(){
     System.out.println("Percusion.afinar() ");
    }
    public void tocar(){
     System.out.println("Percusion.tocar() ");
    }
    public void tocar(String nota){
     System.out.println("Percusion.tocar() " + nota);
    }
    public void cambiarSonido(String sonido){}
    public void acompañamientosAutomaticos(String acompañamiento){}
    public void grabarYReproducirMusica(String reproducirMusica){}

}
