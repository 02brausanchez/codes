package ExamenesDeMaestria;

public class Coordenadas {
    int x,y,z;

    public Coordenadas (int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String toString(){
        return " [ " + x + " , " + y + " , " + z + " ] ";
    }

    public double distaciaAUnPunto(int x, int y, int z){
        return (Math.sqrt(Math.pow(x-this.x,2)+ Math.pow(y-this.y,2)+Math.pow(z-this.z,2)));
    }
}
