package LeerArchivo;

public class Coordenada {
    int ren, col;

    public Coordenada(int ren, int col){
        this.ren = ren;
        this.col = col;
    }

    @Override
    public String toString(){
        return String.format("[%d, %d]", ren, col);
    }
}
