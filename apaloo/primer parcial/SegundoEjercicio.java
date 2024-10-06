package EjercicioDos;
public class SegundoEjercicio {
    public static Coordenada buscaMayor (int[][] matriz) {
        int maxValor = Integer.MIN_VALUE;
        int renglonMax = 0, columnaMax = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maxValor) {
                    maxValor = matriz[i][j];
                    renglonMax = i;
                    columnaMax = j;
                }
            }
        }
        return new Coordenada(renglonMax, columnaMax);
    }

    public static void main(String[] args) {
        int[][] matriz = {{1, 9}, {45, 4}};
        Coordenada resultado = buscaMayor(matriz);
        System.out.println("La posicion del numero mas grande de la matriz es: ");
        System.out.println("(" + resultado.renglon + "," + resultado.columna + ")");
    }
}
