package EjerciciosDeQueue;

public class ColaL {
    private Nodo frente;

    public ColaL(){
        frente = null;
    }

    public boolean vacia(){
        return frente == null;
    }

    public void encolar(int valor){
        if(frente == null){
            frente = new Nodo(valor);
        }else{
            Nodo ultimo;
            for(ultimo = frente; ultimo.sig != null; ultimo = ultimo.sig){
                // Se recorre hasta el último nodo.
            }
            ultimo.sig = new Nodo(valor);
        }
    }

    public int desencolar(){
        if(frente == null){
            return 0; // o alguna otra señal de que la cola está vacía
        }
        int aux = frente.valor;
        frente  = frente.sig;
        return aux;
    }

    //Funcion para mostrar los valores del Nodo
    public String toString() {
        String valores = "";
        Nodo aux;
        for(aux = frente; aux != null; aux = aux.sig) {
            valores = valores + aux.valor;
            if(aux.sig != null) {
                valores = valores + ",";
            }
        }
        return valores;
    }
    //Funcion para mostrar todos los valores excepcion del ultimo
    public String eliminaUltimoNodo(){
        String valores = "";
        Nodo aux; 
        for(aux = frente; aux != null && aux.sig != null; aux = aux.sig){
            valores += aux.valor;
            if(aux.sig != null){
                valores += ",";
            }
        }
        return valores;
    }
    //Funcion para mostrar todos los valores excepcion del segundo 
    public String eliminaSegundo(){
        String valores = "";
        Nodo aux = frente; 

        valores += aux.valor; 
        aux = aux.sig.sig;

        while(aux != null){
            valores += "," + aux.valor;
            aux = aux.sig;
        }

        return valores;

    }


    //Funcion que muestra los valores excepto el segundo y ultimo 
    public String eliminaSegundoConUltimo(){
        String valores = "";
        Nodo aux = frente;
        while(aux != null){
            if(aux.sig != null){
                valores += aux.valor + ",";
            }
            aux = aux.sig.sig;
        } 
        
        return valores;
    }

    //Funcion de un valor repetido dos veces 
    public boolean replica(){
        Nodo aux;
        Nodo repetido; 
        for(aux = frente; aux.sig != null; aux = aux.sig){
            for(repetido = aux.sig; repetido != null; repetido = repetido.sig){
                if(aux.valor == repetido.valor){
                    return true;
                }
            }
        }
        return false;
    }

    //Funcion para saber las veces que se repite un valor dentro del Nodo
    public int repetido(int valorNodo){
        Nodo aux = frente; 
        int valorRepetido = 0;
        while(aux != null){
            if(aux.valor == valorNodo){
                valorRepetido++;
            }
            aux = aux.sig;
        }
        return valorRepetido;
    }

    //funcion para saber ordenar los valores 
    public void insertaOrdenado(int valor){
        //caso 1 para cuando este vacia el nodo
        if(frente == null){
            frente = new Nodo(valor);
            return;
        }
        //caso 2 parte 1
        if(frente.valor > valor){
            Nodo aux = new Nodo(valor); 
            aux.sig = frente; 
            return;
        }
        Nodo aux; 
        for(aux = frente; aux.sig!= null; aux = aux.sig){
            if(aux.sig.valor > valor){
                {break;}
            }
        }
        Nodo aux2 = new Nodo(valor); 
        aux2.sig = aux.sig; 
        aux.sig = aux2;
    }

    //funcion para invertir los valores ordenados 
    public void invertir(int valor){
        if(frente == null){
            return;
        }
        Nodo ant, actual,siguiente; 
        ant = null; 
        actual = frente; 
        siguiente = actual.sig; 

        while(siguiente != null){
            actual.sig = ant; 
            ant = actual; 
            actual = siguiente; 
            siguiente = actual.sig; 
        }
        actual.sig = ant; 
        frente = actual; 
    }



    public int sumaNodos(){
        Nodo aux;
        int suma = 0;
        for(aux = frente; aux != null; aux = aux.sig){
                suma += aux.valor;
        }
        return suma;
    }

    public int nodoMinimo(){
        Nodo aux = frente;
        int min = aux.valor;
        while(aux != null){
            if(aux.valor < min){
                min = aux.valor;
            }
            aux = aux.sig;
        }
        return min;
    }

    public int nodoMaximo() {
        Nodo aux = frente;
        int max = aux.valor;
        while (aux != null) {
            if (aux.valor > max) {
                max = aux.valor;
            }
            aux = aux.sig;
        }
        return max;
    }

    public void destruir(){
        frente = null;
    }
}
