package EjercicioCinco;

public class Dependiente implements Comparable <Dependiente> {
    int numeroEmp; // del que depende economicamente
    String nombre;
    String parentesco;  // hijo(a), esposo(a),etc..

    //Constructor de la Dependiente
    public Dependiente(int numeroEmp, String nombre, String parentesco){
        this.numeroEmp = numeroEmp;
        this.nombre = nombre;
        this.parentesco = parentesco;
    }

    @Override
    public int compareTo(Dependiente o){
        return (int)(numeroEmp-o.numeroEmp);
    }

    @Override
    public String toString(){
        return " " + numeroEmp + " " + nombre + " " + parentesco;
    }
}
