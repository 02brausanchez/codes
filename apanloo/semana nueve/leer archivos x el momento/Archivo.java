package LeerArchivo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class Archivo {
    static int contador = 0;
    /* Leer un archivo en formato texto */
    static public void leeTexto(String arch) throws FileNotFoundException, IOException{
        //Abre el archivo como de lectura
        RandomAccessFile f = new RandomAccessFile(arch, "r");
        String l;
        while ((l=f.readLine())!=null){
            System.out.println(l);
            String [] palabras = l.split("");
            contador += palabras.length;
            //l = f.readLine();
        }
        f.close();
    }

    //Crea un archivo en formato de texto
    static public void creaTexto(String arch) throws FileNotFoundException, IOException{
        //rw indica que se abre para escribir y leer, si el archivo no existe lo crea
        RandomAccessFile f = new RandomAccessFile(arch, "rw");

        f.writeBytes("Hola mundo cruel\n");
        f.writeBytes("La energía no se crea ni se destruye\n");
        f.close();
    }
    private static void creaArchivoTexto(String nombre) throws FileNotFoundException {
        File fleExample = new File(nombre);
        try (PrintWriter pw = new PrintWriter(fleExample)) {
            pw.println("Hola mundo");
            pw.format("%s %c", "hola", 'P');
            pw.close();
        }
        catch (Exception e)
        {
            System.err.format("Exception occurred trying to open '%s'.", nombre);
            return;
        }

        // For convenience, let the user know that the file has been created
        System.out.println("El archivo se creo correctamente");
    }
    //Abre un archivo y modifica unas letras
    static public void abreyModificaTexto(String arch) throws FileNotFoundException, IOException{
        //rw indica que se abre para escribir y leer, si el archivo no existe lo crea
        RandomAccessFile f = new RandomAccessFile(arch, "rw");

        f.seek(10);
        f.writeBytes("perro");
        f.close();
    }

    // Crea un archivo donde se almacena un arreglo de números flotantes
    static public void creaArchFlotantes(String arch, double [] datos) throws FileNotFoundException, IOException{
        //rw indica que se abre para escribir y leer, si el archivo no existe lo crea
        RandomAccessFile f = new RandomAccessFile(arch, "rw");

        for (double x:datos){
            f.writeDouble(x);
        }
        f.close();
    }

    static public double[] leeArchFlotantes(String arch) throws FileNotFoundException, IOException{
        //rw indica que se abre para escribir y leer, si el archivo no existe lo crea
        RandomAccessFile f = new RandomAccessFile(arch, "rw");

        //Obtiene el tamaño del archivo
        long tam = f.length();
        int numFloats = (int)(tam/Double.BYTES);
        //Crea el arreglo de salida
        double [] nums = new double[numFloats];

        for (int i=0; i<numFloats; i++){
            nums[i] = f.readDouble();

        }
        f.close();
        return nums;
    }

    //Lee un archivo como un arreglo de bytes
    static public byte[] leeArchBytes(String arch) throws FileNotFoundException, IOException{
        //rw indica que se abre para escribir y leer, si el archivo no existe lo crea
        RandomAccessFile f = new RandomAccessFile(arch, "rw");

        //Obtiene el tamaño del archivo
        byte [] b = new byte[(int)(f.length())];

        //lee los bytes
        f.readFully(b);
        f.close();
        return b;
    }


    //Convierte un arreglo de bytes en un arreglo de doubles
    static public double [] arrToDouble(byte [] bytes){

        //Dado el tamaño del arreglo de bytes
        double [] nums = new double[bytes.length/Double.BYTES];

        for (int i = 0; i<bytes.length/Double.BYTES; i++){
            nums[i] = ByteBuffer.wrap(bytes, i*Double.BYTES, Double.BYTES).getDouble();
        }

        return nums;
    }


    //Cambia un número en el archivo de flotantes, se le pasa el nombre del archivo,
    //la posición y el nuevo valor

    static public void modUnFlotante(String arch, int pos, double valor) throws FileNotFoundException, IOException{
        //rw indica que se abre para escribir y leer, si el archivo no existe lo crea
        RandomAccessFile f = new RandomAccessFile(arch, "rw");

        //Se coloca el apuntador al archivo en la posición
        f.seek(pos*Double.BYTES);
        // Escribe el nuevo flotante
        f.writeDouble(valor);

        f.close();

    }


    @SuppressWarnings("empty-statement")
    static public void quitaAsteriscos(String arch, String archSalida) throws FileNotFoundException, IOException{
        RandomAccessFile fs;
        try ( //Abre el archivo como de lectura
              RandomAccessFile fe = new RandomAccessFile(arch, "r")) {
            fs = new RandomAccessFile(archSalida, "rw");
            String l;
            while ((l=fe.readLine())!=null){
                System.out.println(l);
                if (l.length()<10){continue;}
                char [] x = l.toCharArray();
                int i;
                for (i=0; i<l.length()&&x[i]==' '; i++);

                fs.writeBytes(l.substring(i)+"\n");

            }
        }
        fs.close();
    }


    public static void main2(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here

        quitaAsteriscos("f:\\papersvivos\\crossmarkets\\pearson.dat", "f:\\papersvivos\\crossmarkets\\pearsonsina.dat");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here

        leeTexto("C:\\Users\\braulio\\Downloads\\romeo.txt");
        System.out.println("Palabras contadas: " + contador);
        /*
        creaTexto("f:\\sal.txt");
        creaArchivoTexto("f:\\sal2.txt");
        abreyModificaTexto("f:\\sal.txt");
        double nums [] = {1.0,2.0,3.0,4.0};
        creaArchFlotantes("f:\\flotantes.txt", nums);
        System.out.println(Arrays.toString(leeArchFlotantes("f:\\flotantes.txt")));
        System.out.println(Arrays.toString(arrToDouble(leeArchBytes("f:\\flotantes.txt"))));
        modUnFlotante("f:\\flotantes.txt", 2, 5.0e5);
        System.out.println(Arrays.toString(leeArchFlotantes("f:\\flotantes.txt")));
        */
    }
}
