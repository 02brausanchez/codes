package SemanaDos;

/**
 * Author: braulio sanchez 
 */
public class Main {
    public static void main(String[] args) {
        /*
        Personajes oPersonajes; 
        oPersonajes = new Personajes(); 

        oPersonajes.setNombrePersonaje("Nero");
        oPersonajes.setHabilidadPersonaje("Cazador de demonios");
        oPersonajes.setDamagePersonaje(7.9);
        oPersonajes.setMejoraPersonaje(2.0); 
        oPersonajes.setDamageRecibido(3); 
        oPersonajes.setVidaPersonaje(280);
        oPersonajes.mueveCoordenada(3,2, new char[5],0); 
        */ 

        //oPersonajes.calculaDamage();
        //oPersonajes.calculaMejora();
        //oPersonajes.calculaVida();

        //System.out.println(oPersonajes.getDamagePersonaje());
        //System.out.println(oPersonajes.getMejoraPersonaje());
        //System.out.println(oPersonajes.getVidaPersonaje());
        
        Cazador cazador = new Cazador(); 
        cazador.setNombrePersonaje("Nero");
        cazador.setHabilidadPersonaje("Cazador de demonios");
        cazador.setDamagePersonaje(7.9);
        cazador.setMejoraPersonaje(2.0);
        cazador.setDamageRecibido(3);
        cazador.setVidaPersonaje(280);
        
        System.out.println("Estado actual " + cazador);
        System.out.println("");
        cazador.calculaDamage();
        cazador.calculaVida();
        cazador.calculaMejora();
        char [] camino = new char[5];
        cazador.mueveCoordenada(1, 1, camino, 0);
        System.out.println("");

        BossFinal bossFinal = new BossFinal();
        bossFinal.setNombrePersonaje("Urizen");
        bossFinal.setHabilidadPersonaje("Poder devastador");
        bossFinal.setDamagePersonaje(15.0);
        bossFinal.setMejoraPersonaje(9000);
        bossFinal.setDamageRecibido(300);
        bossFinal.setVidaPersonaje(5000);      

        System.out.println("Estado actual " + bossFinal);
        System.out.println("");
        bossFinal.calculaDamage();
        bossFinal.calculaVida();
        bossFinal.calculaMejora();
        System.out.println("");

        Armera armera = new Armera();
        armera.setNombrePersonaje("Nico");
        armera.setHabilidadPersonaje("Ingeniera de combate");
        armera.mueveCoordenada(3, 2, new char [5], 0);
        System.out.println(armera);
        

    }
}