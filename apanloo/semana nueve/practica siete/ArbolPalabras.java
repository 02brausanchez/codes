package PracticaSiete;

import java.util.TreeMap;
public class ArbolPalabras {
    TreeMap<String, ListaCoord> palabras;

    public ArbolPalabras(){
        palabras = new TreeMap();
    }

    public void agregaPalabra(String palabra, int ren, int col){
        palabra = palabra.toUpperCase();
        if(palabras.containsKey(palabra)){
            palabras.get(palabra).agregaCoordenada(new Coordenada(ren, col));
        }else{
            ListaCoord l = new ListaCoord();
            l.agregaCoordenada(new Coordenada(ren, col));
            palabras.put(palabra, l);
        }

    }
}
