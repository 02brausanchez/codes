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
        while ((l=f.readLine())!=null){
            System.out.println(l.toUpperCase());
            String [] palabras = l.split("\\s+");
            contador += palabras.length;
        }
        f.close();
    }

    public static void separaPalabras(String arch) throws FileNotFoundException, IOException{
        RandomAccessFile f = new RandomAccessFile(arch, "r");
        String l;
        int renglon = 0, columna = 0;
        while((l = f.readLine()) != null) {
            int encuentraPalabra = 0;
            for(int i = 0; i <= l.length(); i++){
                if(i == l.length() || !Character.isLetter(l.charAt(i))){
                    if(encuentraPalabra < i){
                        System.out.println(l.substring(encuentraPalabra, i).toUpperCase());
                    }
                    encuentraPalabra = i + 1;
                }
            }
        }
        f.close();
    }

    public static void muestraPosicion(String arch) throws IOException {
        RandomAccessFile f = new RandomAccessFile(arch, "r");
        String leerLinea;
        int ren = 0;
        while((leerLinea =  f.readLine()) != null){
            int col = 0;
            StringBuilder palabra = new StringBuilder();
            for(char c : leerLinea.toCharArray()){
                if(Character.isLetter(c)){
                    palabra.append(c);
                }else{
                    if(palabra.length() > 0){
                        System.out.printf("%s [%d, %d]%n", palabra.toString().toUpperCase(), ren, col - palabra.length());
                        palabra.setLength(0);
                    }
                }
                col++;
            }
            if(palabra.length() > 0){
                System.out.printf("%s [%d, %d]%n", palabra.toString().toUpperCase(), ren, col - palabra.length());
            }
            ren++;
        }
        f.close();
    }

    public static void guardaSinCoordenadas(String arch, ArbolPalabras arbol) throws IOException{
        RandomAccessFile f = new RandomAccessFile(arch, "r");
        String l;

        while((l = f.readLine()) != null){
            int encuentraPalabra = -1;
            for(int i = 0; i <= l.length(); i++){
                if(i == l.length() || !Character.isLetter(l.charAt(i))){
                    if(encuentraPalabra != -1){
                        String palabra = l.substring(encuentraPalabra, i).toUpperCase();
                        arbol.agregaSinCoordenadas(palabra);
                        encuentraPalabra = -1;
                    }
                } else if (encuentraPalabra == -1) {
                    encuentraPalabra = i;
                }
            }
        }
        f.close();
    }

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) throws Exception {
        String ArchTxt = "D:\\Users\\braulio\\Desktop\\romeo.txt";
        leeTexto(ArchTxt);
        System.out.println("Palabras contadas: " + contador);
        System.out.println("Ahora usando el metodo separarPalabras: ");
        separaPalabras(ArchTxt);
        System.out.println("Mostrando ahora su posicion de acuerdo a las palabras: ");
        muestraPosicion(ArchTxt);
        ArbolPalabras arbol = new ArbolPalabras();
        Archivo.guardaSinCoordenadas(ArchTxt, arbol);
        System.out.println("Arbol con palabras sin coordenadas: ");
        arbol.mostrarPalabras();

    }
}
