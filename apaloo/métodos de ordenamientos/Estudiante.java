package MetodosOrdenamientos;

public class Estudiante implements Comparable<Estudiante>{
    long matricula;
    String nombre;

    public Estudiante(long matricula, String nombre){
        this.matricula = matricula;
        this.nombre = nombre;
    }
    
    /*
    @Override
    public int comparaTo(Estudiante s){
        //return (int)(matricula-s.matricula);
        return nombre.compareTo(s.nombre);
    }
    */

    @Override
    public String toString(){
        return " " + matricula + " " + nombre;
    }

    @Override
    public int compareTo(Estudiante o) {
        return nombre.compareTo(o.nombre);
        //return (int)(matricula-o.matricula);
    }
}