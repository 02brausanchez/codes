package pilas;

public class Alumno implements Comparable <Alumno> {    
    long matricula; 
    String nombre; 

    public Alumno(long matricula, String nombre){
        this.matricula = matricula; 
        this.nombre = nombre; 
    }

    public void setMatricula(long matricula){
        this.matricula = matricula; 
    }

    public void setNombre(String nombre){
        this.nombre = nombre; 
    }

    //@Override
    public long getMatricula(){
        return matricula; 
    }
    //@Override
    public String getNombre(){
        return nombre; 
    }
    
    //@Override
    public String toString(){
        return "{Alumno " + " matricula: " + matricula + ", nombre: " + nombre + "}";
    }
    
    public int compareTo(Alumno o){
        return (int)(this.matricula - o.matricula);
    }
}
