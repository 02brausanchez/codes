package Semana7and8;

public class Main {
    public static void main(String[] args) {
        Arbol a = new Arbol();
        //a = new Arbol("+(1,2)");
        a = new Arbol("+(1,*(5,4))");

        System.out.println(a.evalua());
    }
}
