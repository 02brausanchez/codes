package Practica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class FuerazaBruta {
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


    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        //int sequenceOne = sc.nextInt();
        //int sequenceTwo = sc.nextInt();

        int [] firstArray = new int[n];
        int [] secondArray = new int[n];

        for(int i = 0; i < n; i++){
            firstArray[i] = sc.nextInt();
        }

        for(int j = 0; j < n; j++){
            secondArray[j] = sc.nextInt();
        }

        ArrayList<Integer> resultFirstArray = new ArrayList<>();
        ArrayList<Integer> resultSecondArray = new ArrayList<>();

        for(int i = 0; i < n; i++){
            boolean isInSecondArray = false;
            for(int j = 0; j < n; j++) {
                if (firstArray[i] == secondArray[j]) {
                    isInSecondArray = true;
                    break;
                }
            }
            if(!isInSecondArray){
                resultFirstArray.add(firstArray[i]);
            }
        }

        for(int j = 0; j < n; j++){
            boolean isInFirstArray = false;
            for(int i = 0; i < n; i++) {
                if (firstArray[i] == secondArray[j]) {
                    isInFirstArray = true;
                    break;
                }
            }
            if(!isInFirstArray){
                resultSecondArray.add(secondArray[j]);
            }
        }
        for(int valueOne: resultFirstArray){
            System.out.print(valueOne + " ");
        }
        System.out.println(" ");
        for(int valueTwo: resultSecondArray){
            System.out.print(valueTwo + " ");
        }
    }
}