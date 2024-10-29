package SemanaDos;

import java.util.Arrays;

public class Cazador extends Personajes {
    private double damageEspada;
    private double contadorDamage;
    private int contadorVida;

    public Cazador(){
        super(); 
        this.damageEspada = 79.0;  
        this.contadorDamage = 20.0; 
        this.contadorVida = 10; 
    }

    @Override
    public void calculaDamage(){
        this.damageEspada += 10;
        System.out.println("El nuevo daño del ataque: " + damageEspada);
    }

    @Override
    public void calculaVida(){
        setVidaPersonaje(getVidaPersonaje() - getDamageRecibido());
        System.out.println("La vida actual del personaje: " + getVidaPersonaje());
        if(getVidaPersonaje() <= 0){
            System.out.println("El personaje ha sido derrotado ");
        }
    }

    @Override
    public void calculaMejora(){
        if(damageEspada >= 500.0){
            setVidaPersonaje(getVidaPersonaje() + contadorVida); //Recupera vida 
            damageEspada += contadorDamage; //Aumenta su daño en combate 
        }else{
            System.out.println("Daño aun no es suficiente para mejorar ");
        }
        System.out.println("Daño despues de la mejora: " + damageEspada + " Vida despues de la mejora: " + getVidaPersonaje());
    }

    public void mueveCoordenada(int x , int y , char[] camino, int i){
        if(x == 0 && y == 0){
            System.out.println("El personaje: " + getNombrePersonaje() + " llego a las coordenadas: ");
            System.out.println(Arrays.toString(camino));
            return; 
        }
        if(x > 0){
            camino[i] = 'E'; //Mover hacia el este
            mueveCoordenada(x-1, y, camino, i+1);
        }else if (x < 0){
            camino[i] = 'W'; //Mover hacia al oeste 
            mueveCoordenada(x+1, y, camino, i+1);
        }
        if(y > 0){
            camino[i] = 'N'; //Mover hacia el norte 
            mueveCoordenada(x, y-1, camino, i+1);
        }
        if(y < 0){
            camino[i] = 'S'; //Mover hacia al sur
            mueveCoordenada(x, y+1, camino, i+1);
        }
    }

    @Override 
    public String toString(){
        return "Nombre del personaje: " + getNombrePersonaje() + " | Habilidad: " + getHabilidadPersonaje() 
            + " | Mejora del personaje: " + damageEspada + " | Vida del personaje: " + getVidaPersonaje();
    }
}
