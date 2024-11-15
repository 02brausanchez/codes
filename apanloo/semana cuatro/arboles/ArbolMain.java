package Arboles;

public class ArbolMain {
    public static void main(String[] args) {
        ArbolMain a = new ArbolMain();
        a = a.ejemplo1();
        a.previo();

    }

    public Arbol ejemplo2(){
        Arbol aux = new Arbol();
        aux.raiz = new Nodo('a');
        aux.raiz.hizq = new Nodo('b');
        aux.raiz.hder = new Nodo('c');
        aux.raiz.hizq.hizq = new Nodo('d');
        aux.raiz.hizq.hder = new Nodo('e');
        aux.raiz.hder.hizq = new Nodo('f');
        aux.raiz.hder.hder = new Nodo('g');
        aux.raiz.hizq.hder.hder = new Nodo('h');
        return aux;
    }

    private void previo(Nodo a){
        if(a==null){return;}
        System.out.println(a.info);
        previo(a.hizq);
        previo(a.hder);
    }

    public void previo(){
        previo(raiz);
    }

    private void enOrden(Nodo a){
        if(a == null){return;}
        enOrden(a.hizq);
        System.out.println(a);
        enOrden(a.hder);
    }

    public void enOrden(){
        enOrden(raiz);
    }

    private void postOrden(Nodo a){
        if(a == null){return;}
        postOrden(a.hizq);
        postOrden(a.hder);
        System.out.println(a);
    }

    public void postOrden(){
        postOrden(raiz);
    }

    private int numNodo(Nodo a){
        if(a == null){return 0;}
        return numNodo(a.hizq)+numNodo(a.hder)+1;
    }

    public int numNodo(){
        return numNodo(raiz);
    }

    private void soloHojas(Nodo a){
        if(a == null){return;}
        if(a.hizq == null && a.hder == null){
            System.out.println(a);
            return;
        }
        soloHojas(a.hizq);
        soloHojas(a.hder);
    }

    public void soloHojas(){
        soloHojas(raiz);
    }

    private void noHojas(Nodo a){
        if(a == null){return;}
        if(a.hder != null || a.hizq != null){
            System.out.println(a);
        }
        noHojas(a.hizq);
        noHojas(a.hder);
    }

    public void noHojas(){
        noHojas(raiz);
    }

    private int altura(Nodo a){
        if(a == null){return 0;}
        int ai = altura(a.hizq);
        int ad = altura(a.hder);
        return (ai > ad ? ai:ad)+1;
    }

    public int altura(){
        altura(raiz);
    }

    private String toString(Nodo a){
        if(a == null){return "";}
        String aux = ""+a;
        if(a.hizq != null || a.hder != null){
            aux += "(";
            aux += toString(a.hizq);
            if(a.hder != null){
                aux = aux + "," + toString(a.hder);
            }
            aux += ")";
        }
        return aux;
    }

    @Override
    public String toString(){
        return toString(raiz);
    }

    private boolean iguales(Nodo a, Nodo b){
        if(a == null && b == null){return true;}
        //uno o los dos no son nulos
        if(a == null || b == null){return false;}
        //los dos no son nulos
        if(a.info != b.info){return false;}
        //los dos no son nulos y los campos info son
        return iguales(a.hizq, b.hder) && iguales(a.hder, b.hizq);
    }

    public boolean iguales(Nodo a){
        return iguales(raiz,a);
    }

}
