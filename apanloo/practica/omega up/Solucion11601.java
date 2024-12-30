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
