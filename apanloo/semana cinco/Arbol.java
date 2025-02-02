package Arboles;

public class Arbol {
    Nodo raiz;

    public Arbol() {
        raiz = null;
    }

    public void previo(Nodo a) {
        if (a == null) return;
        System.out.println(a.info);
        previo(a.hizq);
        previo(a.hder);
    }

    public void previo() {
        previo(raiz);
    }

    public void enOrden(Nodo a) {
        if (a == null) return;
        enOrden(a.hizq);
        System.out.println(a);
        enOrden(a.hder);
    }

    public void enOrden() {
        enOrden(raiz);
    }

    public void postOrden(Nodo a) {
        if (a == null) return;
        postOrden(a.hizq);
        postOrden(a.hder);
        System.out.println(a);
    }

    public void postOrden() {
        postOrden(raiz);
    }

    public int numNodo(Nodo a) {
        if (a == null) return 0;
        return numNodo(a.hizq) + numNodo(a.hder) + 1;
    }

    public int numNodo() {
        return numNodo(raiz);
    }

    public void soloHojas(Nodo a) {
        if (a == null) return;
        if (a.hizq == null && a.hder == null) {
            System.out.println(a);
            return;
        }
        soloHojas(a.hizq);
        soloHojas(a.hder);
    }

    public void soloHojas() {
        soloHojas(raiz);
    }

    public void noHojas(Nodo a) {
        if (a == null) return;
        if (a.hizq != null || a.hder != null) {
            System.out.println(a);
        }
        noHojas(a.hizq);
        noHojas(a.hder);
    }

    public void noHojas() {
        noHojas(raiz);
    }

    public int altura(Nodo a) {
        if (a == null) return 0;
        int ai = altura(a.hizq);
        int ad = altura(a.hder);
        return Math.max(ai, ad) + 1;
    }

    public int altura() {
        return altura(raiz);
    }

    public String toString(Nodo a) {
        if (a == null) return "";
        String aux = "" + a;
        if (a.hizq != null || a.hder != null) {
            aux += "(" + toString(a.hizq);
            if (a.hder != null) aux += "," + toString(a.hder);
            aux += ")";
        }
        return aux;
    }

    @Override
    public String toString() {
        return toString(raiz);
    }

    public boolean iguales(Nodo a, Nodo b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;
        if (a.info != b.info) return false;
        return iguales(a.hizq, b.hizq) && iguales(a.hder, b.hder);
    }

    public boolean iguales(Arbol otro) {
        return iguales(raiz, otro.raiz);
    }
}
