package OmegaUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Solucion7563 {
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
                        throw new RuntimeException("No more tokens available in input.");
                    }
                    st = new StringTokenizer(line);
                } catch (IOException e) {
                    e.printStackTrace();
                    throw new RuntimeException("Error reading input.");
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();
        int n = sc.nextInt();

        int[] firstArray = new int[n];
        int[] secondArray = new int[n];

        // Leer el primer arreglo
        for (int i = 0; i < n; i++) {
            firstArray[i] = sc.nextInt();
        }

        // Leer el segundo arreglo
        for (int j = 0; j < n; j++) {
            secondArray[j] = sc.nextInt();
        }

        // Usar HashSet para optimizar la búsqueda
        HashSet<Integer> setFirst = new HashSet<>();
        HashSet<Integer> setSecond = new HashSet<>();

        // Agregar elementos del segundo arreglo al conjunto
        for (int value : secondArray) {
            setSecond.add(value);
        }

        // Crear el resultado del primer arreglo sin intersección
        StringBuilder resultFirst = new StringBuilder();
        for (int value : firstArray) {
            if (!setSecond.contains(value)) {
                resultFirst.append(value).append(" ");
            }
        }

        // Crear el resultado del segundo arreglo sin intersección
        for (int value : firstArray) {
            setFirst.add(value);
        }
        StringBuilder resultSecond = new StringBuilder();
        for (int value : secondArray) {
            if (!setFirst.contains(value)) {
                resultSecond.append(value).append(" ");
            }
        }

        // Imprimir los resultados
        System.out.println(resultFirst.toString().trim());
        System.out.println(resultSecond.toString().trim());
    }
}
