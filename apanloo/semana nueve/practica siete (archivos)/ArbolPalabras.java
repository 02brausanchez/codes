package PracticaSiete;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.TreeMap;

public class ArbolPalabras {
    TreeMap<String, List<Coordenada>> palabras;

    public ArbolPalabras(){
        palabras = new TreeMap<>();
    }

    public void agregaSinCoordenadas(String palabra){
        palabra = palabra.toUpperCase();
        if(!palabras.containsKey(palabra)){
            palabras.put(palabra, new ArrayList<>());
        }
    }

    public void mostrarPalabras() {
        for(String palabra: palabras.keySet()){
            System.out.println(palabra);
        }
    }

    public void agregaPalabra(String palabra, int ren, int col){
        palabra = palabra.toUpperCase();
        Coordenada coord = new Coordenada(ren, col);
        if(palabras.containsKey(palabra)){
            palabras.get(palabra).add(coord);
        }else{
            List<Coordenada> c = new ArrayList<>();
            c.add(coord);
            palabras.put(palabra, c);
        }
    }

    public void mostrarConCoordenadas(){
        for(Map.Entry<String, List<Coordenada>> entry : palabras.entrySet()){
            String palabra  = entry.getKey();
            List<Coordenada> coordenadas = entry.getValue();
            System.out.println(palabra + "(" + coordenadas.size() + ")");
            for(int i = 0; i < coordenadas.size(); i++){
                System.out.println(coordenadas.get(i));
                if(i < coordenadas.size() - 1){
                    System.out.println(",");
                }
            }
            System.out.println();
        }
    }
}
