package EjercicioDos;

public abstract class Instrumento {
    public Instrumento(){}
    public abstract void tocar(); 
    public abstract void tocar(String nota);
    public abstract void afinar();
    public abstract void cambiarSonido(String sonido);
    public abstract void acompañamientosAutomaticos(String acompañamiento);
    public abstract void grabarYReproducirMusica(String reproducirMusica); 


}
