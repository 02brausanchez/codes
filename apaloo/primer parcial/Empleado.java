package EjercicioCinco;
public class Empleado implements Comparable <Empleado> {
    int numeroEmp;
    String Nombre;

    //Constructor de la clase Empleado
    public Empleado(int numeroEmp, String Nombre){
        this.numeroEmp = numeroEmp;
        this.Nombre = Nombre;
    }


    @Override
    public int compareTo(Empleado o){
        return (int) (numeroEmp-o.numeroEmp);
    }

    @Override
    public String toString(){
        return " " + numeroEmp + " " + Nombre;
    }
}
