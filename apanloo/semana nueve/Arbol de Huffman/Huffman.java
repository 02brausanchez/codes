package ArbolHuffman;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.FileSystemNotFoundException;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Huffman {
    static public int [] leeTexto(String arch) throws FileSystemNotFoundException, IOException {
        int [] tabla = new int [256];
        RandomAccessFile f = new RandomAccessFile(arch, "r");
        String l;
        while((l = f.readLine()) != null){
            System.out.println(l);
            char [] aux = (l+"\n").toCharArray();
            for(char a: aux){

                if(a > 255){continue;}
                tabla[a]++;
            }
        }
        f.close();
        return tabla;
    }

    public static void muestraTabla(int [] tabla){
        for(int i = 0; i < tabla.length; i++){
            if(tabla[i] == 0){continue;}
            System.out.println((char)i + " " + i + " " + tabla[i]);
        }
    }

    public static Comparator<Nodo> porFrec = new Comparator<Nodo>() {
        @Override
        public int compare(Nodo a, Nodo b) {
            return a.frec-b.frec;
        }
    };

    public static List<Nodo> genLista(int [] tabla){
        List<Nodo> l = new LinkedList();
        for(int i = 0 ; i < tabla.length; i++){
            if(tabla[i] == 0){continue;}
            Nodo aux = new Nodo((char)i, tabla[i]);
            l.add(aux);
        }
        l.sort(porFrec);
        return l;
    }

    public static void muestraLista(List<Nodo> l){
        for(Nodo a: l){
            System.out.println(a.simbolo + " " + a.frec);
        }
    }

    public static Nodo genHuffman(List<Nodo> l){
        while(l.size() > 1){
            Nodo izq, der, aux;
            izq = l.remove(0);
            der = l.remove(0);
            aux = new Nodo('x', izq.frec + der.frec);
            l.add(aux);
            l.sort(porFrec);
        }
        return l.remove(0);
    }

    public static void recorreArbol(Nodo a){
        if(a == null){return;}
        recorreArbol(a.hizq);
        System.out.println(a.simbolo + "" + a.frec);
        recorreArbol(a.hder);
    }

    public static void genCodigos(Nodo h, String c, String [] cs){
        if(h == null){return;}
        if(h.hizq == null && h.hder == null){
            cs[h.simbolo] = c;
            System.out.println((int)h.simbolo + " " + h.simbolo + " " + h.frec + " " + c);
            return;
        }
        genCodigos(h.hizq, c + "0", cs);
        genCodigos(h.hder, c + "1", cs);
    }

    public static void muestraTablaCodigos(String [] cs){
        for(int i = 0; i < cs.length; i++){
            if(cs[i] == null){continue;}
            System.out.println((char)i + " " + cs[i]);
        }
    }

    public static String genSalida(String arch, String [] cs) throws IOException{
        String s = "";
        RandomAccessFile f = new RandomAccessFile(arch, "r");
        String l;
        while((l = f.readLine()) != null){
            System.out.println(l);
            char [] aux = (l+"\n").toCharArray();
            for(char a: aux){
                s = s + cs[a];
            }
        }
        f.close();
        return s;
    }

    public static void main(String[] args) throws IOException{
        //System.out.println();
        int [] frecuencia;
        frecuencia = leeTexto("C:\\Users\\braulio\\Desktop\\texto ingles.txt");
        muestraTabla(frecuencia);
        List<Nodo> l = genLista(frecuencia);
        muestraLista(l);
        Nodo huffman = genHuffman(l);
        recorreArbol(huffman);
        String [] cs = new String[256];
        genCodigos(huffman, "", cs);
        muestraTablaCodigos(cs);
        //String s  = genSalida("C:\\Users\\braulio\\Desktop\\texto ingles.txt", cs);
        //System.out.println(s);
    }
}

