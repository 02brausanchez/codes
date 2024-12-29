package OmegaUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Solucion11601 {
   static class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                String line = br.readLine();
                if (line == null) {
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

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    double nextDouble() {
        return Double.parseDouble(next());
    }

    String nextLine() {
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
   }

    
    public static void solucion(int [] elementos, int n, int m){
        int [] contador = new int[m + 1]; 
        
        for(int i = 0; i < n; i++){
            contador[elementos[i]]++; 
        }

        for(int i = 1; i <= m; i++){
            System.out.println(i + ": " + contador[i]);
        }
    }

    public static void main(String[] args) {
        /*
        FastReader sc = new FastReader(); 
        int n = sc.nextInt(); 
        int k = sc.nextInt(); 
        int count = 0; 
        while(n --> 0){
            int x = sc.nextInt(); 
            if(x % k == 0){count++;}
        }
        System.out.println(count);*/
        
        // Comparacion entre FastReader y Scanner 
        FastReader sc = new FastReader();

        int num,m; 
        num = sc.nextInt(); //Cantidad de pelotas que hay
        m = sc.nextInt(); //El numero mayor que se puede encontrar 

        int [] elementos = new int[num]; //cantidad maxima que tendra
        
        for(int i = 0; i < num; i++){
            elementos[i] = sc.nextInt();
        }

        solucion(elementos,num,m);             
    }
}
