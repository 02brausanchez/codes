package SemanaDos;

public class Armera extends Personajes{
    public Armera() {
        super();
    }

    @Override
    public void calculaDamage() {
        System.out.println("La armera no participa en combate directo.");
    }

    @Override
    public void calculaVida() {
        System.out.println("La armera no tiene una barra de vida activa.");
    }

    @Override
    public void calculaMejora() {
        System.out.println("La armera mejora las armas del cazador.");
    }

    public void mueveCoordenada(int x, int y, char[] camino, int i) {
        System.out.println("La armera sigue al cazador en la base móvil.");
    }

    @Override
    public String toString() {
        return "Nombre de la armera: " + getNombrePersonaje() + " | Habilidad: " + getHabilidadPersonaje();
    }
}
