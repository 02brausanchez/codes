package MetodosOrdenamientos;
import java.util.Arrays;

public class SeleccionDirectaEstudiante {
     static public Estudiante [] selDirecta(Estudiante [] datos){
        for(int i = 0; i < datos.length-1; i++){
            int menor = i;
            for(int j = i+1; j < datos.length; j++){
                if(datos[menor].compareTo(datos[j])>0){
                    menor = j;
                }
            }
            //"perro".compareTo("gato");
            if(i != menor){
                Estudiante aux = datos[i];
                datos[i] = datos[menor];
                datos[menor] = aux;
            }
        }
        return datos;
    }
    
    public static void main(String[] args) {
        Estudiante[] datos = { new Estudiante(10,"alex"),new Estudiante(5,"pedro"),new Estudiante( 8,"benjamin"),new Estudiante(7 ,"Daniel")};
        System.out.println(Arrays.toString(selDirecta(datos)));

    }
}
