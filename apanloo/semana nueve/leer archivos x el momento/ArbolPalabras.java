package LeerArchivo;

import java.util.TreeMap;

public class ArbolPalabras {
    TreeMap<String, ListaCoord> palabras;

    public ArbolPalabras(){
        palabras = new TreeMap();
    }

    public void agregaPalabra(String palabra, int ren, int col){
        palabra = palabra.toUpperCase();

    }
}
