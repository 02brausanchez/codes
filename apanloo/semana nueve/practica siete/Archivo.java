package PracticaSiete;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.TreeMap;

public class Archivo {
    TreeMap<String, Coordenada> l;
    public Archivo(){
        l = new TreeMap();
    }

    static int contador = 0;
    /* Leer un archivo en formato texto */
    static public void leeTexto(String arch) throws FileNotFoundException, IOException{
        //Abre el archivo como de lectura
        RandomAccessFile f = new RandomAccessFile(arch, "r");
        String l;
       // int espacio = arch.indexOf(' ');
        while ((l=f.readLine())!=null){
            System.out.println(l.toUpperCase());
            String [] palabras = l.split("");
            contador += palabras.length;
            //l = f.readLine();
            /*
            if(espacio == -1){
                System.out.println(l);
            }else{
                leeTexto(l.substring(0,espacio));
                leeTexto(l.substring(0,espacio));
            }*/
        }
        f.close();
    }


    public static void separaPalabras(String arch) throws FileNotFoundException, IOException{
        RandomAccessFile f = new RandomAccessFile(arch, "r");
        String s;
        int renglon = 0, columna = 0;
        while((s = f.readLine()) != null) {
            while(s.contains(" ")){
                int espacio = s.indexOf(' ');
                System.out.println(s.substring(0, espacio).toUpperCase());
                s = s.substring(espacio + 1);
            }
            if(!s.isEmpty()){
                System.out.println(s.toUpperCase());
            }
        }
        f.close();
    }

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) throws FileNotFoundException, IOException {
        leeTexto("C:\\Users\\Alumno\\Downloads\\prueba.txt");
        System.out.println("Palabras contadas: " + contador);

        //String archivo;
        System.out.println("Ahora usando el metodo separarPalabras: ");
        separaPalabras("C:\\Users\\Alumno\\Downloads\\prueba.txt");

    }
}
