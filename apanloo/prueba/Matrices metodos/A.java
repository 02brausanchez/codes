package MetodosMatrix;

import java.util.Arrays;

public class A {
    // Una matriz transpuesta
    static void transpose(int[][] mat) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int aux = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = aux;
            }
        }
    }

    // Driver code
    public static void main(String[] args) {
        int[][] mat = {
                { 1, 1, 1, 1 },
                { 2, 2, 2, 2 },
                { 3, 3, 3, 3 },
                { 4, 4, 4, 4 }
        };

        transpose(mat);

        System.out.println("Modified matrix is:");
        for (int[] row : mat) {
            System.out.println(Arrays.toString(row));
        }
    }

}