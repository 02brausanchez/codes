package Practica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Solucion11601 {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st == null || !st.hasMoreElements()){
                try{
                    String line = br.readLine();
                    if(line == null){
                        throw new NoSuchElementException("No more tokens available in input.");
                    }
                    st = new StringTokenizer(line);
                } catch (IOException e) {
                    e.printStackTrace();
                    throw new NoSuchElementException("Error reading input.");
                }
            }
            return st.nextToken();
        }

        int nextInt(){return Integer.parseInt(next());}
        long nextLong(){return Long.parseLong(next());}
        double nextDouble(){return Double.parseDouble(next());}

        String nextLine(){
            String str = "";
            try{
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    /*
        Tengo una pregunta como es que funciona el metodo solver
        sobre todo con el arreglo count como es que se cuenta correctamente si hay
        elementos repetidos y puedes hacer un analisis profundo de este metodo paso a
        paso.
        Los casos que maneja de prueba son:
        input
        5 3
        1 1 1 1 3
        Descripcion de input: son 5 elementos y el valor maximo de estos es 3
        output
        1:4
        2:0
        3:1
        Descripcion de output: se imprime 3 elemtos de los cuales 1 se repitio 4 el 2 se repitio 0 y el 3 se
        repitio 1 vez.
        input
        8 5
        3 2 3 5 3 1 1 3
        output
        1: 2
        2: 1
        3: 4
        4: 0
        5: 1
     */
    static void solver(int [] elements, int n, int m){
        int [] count = new int[m+1];
        for(int i = 0; i < n; i++){
            count[elements[i]]++;
        }
        for(int i = 1; i <= m; i++){
            System.out.println(i + ": " + count[i]);
        }
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        
        int n = sc.nextInt();
        int m = sc.nextInt();

        int [] elements = new int[n];

        for(int i = 0; i < n; i++){
            elements[i] = sc.nextInt();
        }
        solver(elements,n,m);
    }
}
