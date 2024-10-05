package MetodosOrdenamientos;
public class EstudianteV2 implements Comparable<EstudianteV2> {

    long matricula;
    String nombre;

    public EstudianteV2(long matricula, String nombre) {
        this.matricula = matricula;
        this.nombre = nombre;
    }

    @Override
    public int compareTo(EstudianteV2 o) {
        return nombre.compareTo(o.nombre);
        //return (int)(matricula-o.matricula);
    }

    @Override
    public String toString() {
        return " " + matricula + " " + nombre;
    }
}
