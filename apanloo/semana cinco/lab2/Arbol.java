package PracticaCuatro;
import java.util.LinkedList;
import java.util.List;

public class Arbol {
    Nodo raiz;

    public static Arbol ejemplo1() {
        Arbol aux = new Arbol();
        aux.raiz = new Nodo('k');
        aux.raiz.hizq = new Nodo('l');
        aux.raiz.hder = new Nodo('m');
        aux.raiz.hizq.hizq = new Nodo('n');
        aux.raiz.hizq.hder = new Nodo('o');
        aux.raiz.hder.hizq = new Nodo('p');
        aux.raiz.hder.hder = new Nodo('q');
        aux.raiz.hizq.hder.hder = new Nodo('k');
        return aux;
    }

    public static Arbol ejemplo2() {
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
        if (a.hder != null || a.hizq!= null) {
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
        return (ai > ad ? ai:ad)+1;
    }

    public int altura() {
        return altura(raiz);
    }

    public String toString(Nodo a) {
        if (a == null) return "";
        String aux = "" + a;
        if (a.hizq != null || a.hder != null) {
            aux += "(" + toString(a.hizq);
            if (a.hder != null){
                aux += "," + toString(a.hder);
            }
            aux += ")";
        }
        return aux;
    }

    @Override
    public String toString() {
        if(raiz == null){
            return "null";
        }
        return toString(raiz);
    }

    private boolean iguales(Nodo a, Nodo b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;
        if (a.info != b.info) return false;
        return iguales(a.hizq, b.hizq) && iguales(a.hder, b.hder);
    }

    public boolean iguales(Arbol a) {
        return iguales(raiz, a.raiz);
    }

    private Nodo strToArbol(char[]s, int [] i){
        Nodo aux = new Nodo(s[i[0]]); //elemento 0 del arreglo
        i[0]++;
        if(s[i[0]] == '('){
            i[0]++; //salta
            if(s[i[0]] == ','){
                i[0]++; //salta
                aux.hder = strToArbol(s,i);
                i[0]++; //salta
                return aux;
            }
            aux.hizq = strToArbol(s,i);
            if(s[i[0]] == ','){
                i[0]++; //salta ,
                aux.hder = strToArbol(s,i);
                i[0]++;//salta )
                return aux;
            }
            i[0]++; //salta )
            return aux;
        }
        return aux;
    }

    public Arbol(String a){
        if(a == null){
            raiz = null;
            return;
        }
        if(a.length() == 0){
            raiz = null;
            return;
        }
        char [] s = (a + "#").toCharArray();
        int [] i = new int [1];
        i[0] = 0;
        raiz = strToArbol(s,i);
    }

    //Fuerza bruta
    private String visitaNivel(Nodo a, int nivel){
        if(a == null){return "";}
        if(nivel == 1){return "" +a;}
        String aux = visitaNivel(a.hizq, nivel-1);
        String aux2 = visitaNivel(a.hder, nivel-1);
        if("".equals(aux)){return aux2;}
        if("".equals(aux2)){return aux;}
        return aux+","+aux2;
    }

    public String visitaNivel(int nivel){
        String aux = visitaNivel(raiz,nivel);
        if("".equals(aux)){return "(null)";}
        return aux;
    }

    //Fuerza bruta version dos
    public String visitaxNivel(){
        String aux = "";
        int a = altura(raiz);
        for(int b = 1; b <= a; b++){
            String aux1 = visitaNivel(raiz,b);
            if("".equals(aux)){
                aux = aux1;
            }else{
                aux += "," + aux1;
            }
        }
        return aux;
    }
    //version mejorada con usando lista
    public String visitaxNivel2(){
        String aux = "";
        List<Nodo> l = new LinkedList<>();
        //Agregamos la raiz
        l.add(raiz);
        int tam;
        while((tam = l.size())!= 0){
            for(int i = 0; i < tam; i++){
                Nodo a = l.remove(0);
                if("".equals(aux)){
                    aux = ""+a;
                }else{
                    aux += ","+a;
                }
                if(a.hizq != null){
                    l.add(a.hizq);
                }
                if(a.hder != null){
                    l.add(a.hder);
                }
            }
        }
        return aux;
    }

    private int completo(Nodo a){
        if(a == null){return 0;}
        int hizq = completo(a.hizq);
        if(hizq == -1){return -1;}
        int hder = completo(a.hder);
        if(hizq != hder){return -1;}
        return hizq+1;
    }
    public boolean completo(){
        return completo(raiz)>=0;
    }
}
