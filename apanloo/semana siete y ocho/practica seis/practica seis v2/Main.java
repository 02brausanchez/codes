package Semana7and8;

public class Main {
    public static void main(String[] args) {
        /*
        Arbol a = new Arbol();
        a = new Arbol(0,"+(x,2)");
        //a = new Arbol("+(1,*(5,4))");
        Arbol da = a.deriva('x');
        System.out.println(da.evalua());
        */

        Arbol a = new Arbol();
        a = new Arbol(0,"x+2*5");
        System.out.println(a);
        Arbol da = a.deriva('x');
        System.out.println(da.toInfijo());
        da.poda();
        System.out.println(da.toInfijo());

        // Caso 1: Sencillo
        Arbol arbol = new Arbol("(+(* 23)(+44))");
        System.out.println("caso 1: "+arbol.evalua()); // Esperado: 10

// Caso 2: Expresión más compleja
        Arbol arbol2 = new Arbol("(-(/(+99)(-21))(-33))");
        System.out.println("caso 2: " + arbol2.evalua()); // Esperado: valor evaluado de la expresión

        // Crear un árbol y verificar la conversión a infijo
        Arbol arbolInfijo = new Arbol("(+(* 23)(+44))");
        System.out.println(arbolInfijo.toInfijo()); // Esperado: (2*3)+(4+4)

// Otro caso de prueba
        Arbol arbolInfijo2 = new Arbol("(-(/(+99)(-21))(-33))");
        System.out.println("caso arbol Infijo2" + arbolInfijo2.toInfijo()); // Esperado: ((9+9)/(2-1))-(3-3)
        // Asumiendo un formato apropiado para el constructor
        Arbol arbolExp = new Arbol(0, "2*3+4");
        System.out.println("caso arbol exp Infijo"+arbolExp.toInfijo()); // Debe coincidir con la expresión infija original

// Caso más complejo
        Arbol arbolExp2 = new Arbol(0, "(9+9)/(2-1)-(3-3)");
        System.out.println("caso de arbol mas complejo: "+arbolExp2.toInfijo()); // Debe coincidir con la expresión infija original

        // Derivar respecto a una variable, ejemplo sencillo
        Arbol arbolDerivar = new Arbol("(x)");
        Arbol derivada = arbolDerivar.deriva('x');
        System.out.println("caso de derivada: "+ derivada.toInfijo()); // Esperado: 1

// Expresión más compleja
        Arbol arbolDerivar2 = new Arbol("(+(* x2)(+45))");
        Arbol derivada2 = arbolDerivar2.deriva('x');
        System.out.println("caso de derivada2: "+derivada2.toInfijo()); // Esperado: (1*2)+(0)

    }
}
