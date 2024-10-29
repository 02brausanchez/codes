package SemanaDos;

abstract class Personajes {
    protected String nombrePersonaje; 
    private String habilidadPersonaje; 
    private double damagePersonaje; 
    private double mejoraPersonaje; 
    private int vidaPersonaje; 
    private int damageRecibido;

    //Constructor de la clase Personajes
    public Personajes(){
        this.nombrePersonaje = nombrePersonaje; 
        this.habilidadPersonaje = habilidadPersonaje; 
        this.damagePersonaje = damagePersonaje; 
        this.mejoraPersonaje = mejoraPersonaje; 
        this.vidaPersonaje = vidaPersonaje;
        this.damageRecibido = damageRecibido;  
    } 

    public void setNombrePersonaje (String nombrePersonaje){
        this.nombrePersonaje = nombrePersonaje; 
    }

    public void setHabilidadPersonaje (String habilidadPersonaje){
        this.habilidadPersonaje = habilidadPersonaje;
    }

    public void setDamagePersonaje (double damagePersonaje){
        this.damagePersonaje = damagePersonaje;
    }

    public void setMejoraPersonaje (double mejoraPersonaje){
        this.mejoraPersonaje = mejoraPersonaje;
    }

    public void setVidaPersonaje (int vidaPersonaje){
        this.vidaPersonaje = vidaPersonaje;
    }

    public void setDamageRecibido(int damageRecibido){
        this.damageRecibido = damageRecibido; 
    }

    public String getNombrePersonaje (){
        return nombrePersonaje; 
    }

    public String getHabilidadPersonaje (){
        return habilidadPersonaje; 
    }

    public double getDamagePersonaje (){
        return damagePersonaje; 
    }

    public double getMejoraPersonaje (){
        return mejoraPersonaje; 
    }

    public int getVidaPersonaje (){
        return vidaPersonaje; 
    }

    public int getDamageRecibido (){
        return damageRecibido; 
    }

    //Metodos abstractos 
    public abstract void calculaDamage();
    public abstract void calculaVida();
    public abstract void calculaMejora();
    public abstract void mueveCoordenada(int x, int y, char[] camino, int i);


}
