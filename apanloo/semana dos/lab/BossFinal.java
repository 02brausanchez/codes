package SemanaDos;

public class BossFinal extends Personajes{
    private double lanzaRayo; 
    private int activaEscudo; 

    public BossFinal() {
        super();
        this.lanzaRayo = 3800.75; 
        this.activaEscudo = 400;
    }

    @Override
    public void calculaDamage() {
        this.lanzaRayo += 105.25; 
        System.out.println("El nuevo daño de: "+getNombrePersonaje()+" es de: " + lanzaRayo);
    }

    @Override
    public void calculaVida() {
        setVidaPersonaje(getVidaPersonaje() - getDamageRecibido());
        System.out.println("La vida actual del personaje: " + getVidaPersonaje());
        if(getVidaPersonaje() <= 0){
            System.out.println("Has derrotado a " + getNombrePersonaje());
        }
    }

    @Override
    public void calculaMejora() {
        if(lanzaRayo >= 2500){
            setVidaPersonaje(getVidaPersonaje() + activaEscudo + (int) getMejoraPersonaje());
        }else{
            System.out.println("Escudo aun no esta activo para la mejora de: " + getNombrePersonaje());
        }
        System.out.println("Daño despues de la mejora: " + lanzaRayo + " Vida despues de la mejora: " + getVidaPersonaje());
    }

    public void mueveCoordenada(int x, int y, char[] camino, int i) {
        System.out.println("El Boss Final no se mueve de su posición.");
    }

    @Override
    public String toString() {
        return "Boss Final: " + getNombrePersonaje() + " | Poder: " + getDamagePersonaje() + " | Vida: " + getVidaPersonaje();
    }

}
