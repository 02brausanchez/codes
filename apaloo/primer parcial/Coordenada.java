package EjercicioDos;
public class Coordenada {
    int renglon, columna;

    public Coordenada(int renglon, int columna) {
        this.renglon = renglon;
        this.columna = columna;
    }

    public String toString() {
        return " " + renglon + " " + columna;
    }
}
