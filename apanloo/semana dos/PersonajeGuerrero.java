package semanaDos;

public class PersonajeGuerrero extends Videojuegos{
    private String nombre;
    private String habilidadPersonaje;
    private double habilidadDamage;
    private double vida;
    private double damage;

    public PersonajeGuerrero(){
        super();
        this.habilidadPersonaje = habilidadPersonaje;
        this.nombre = nombre;
        this.habilidadDamage = 7.5; //su habilidad es guerrero
        this.vida = 250;
        this.damage = 15.0;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setHabilidadPersonaje(String habilidadPersonaje){
        this.habilidadPersonaje = habilidadPersonaje;
    }

    public String getHabilidadPersonaje(){
        return habilidadPersonaje;
    }


    public void calculaVida(){
        vida =  vida - (damage * habilidadDamage);
    }


    @Override
    public String toString(){
        return "Nombre del personaje: " + nombre + "Habilidad que posee: " + "vida que tiene actualmente: " + vida + ;
    }

}
