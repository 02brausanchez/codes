package PracticaCinco;

import java.util.LinkedList;
import java.util.List;

public class Arbol {
    Nodo l, raiz;

    public Arbol(){
        l = raiz = null;
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
    //Metodo que visita un nivel recursivo
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

    //Metodo que visita todos los niveles utilizando el primer metodo
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
    //Netodo que visita a todos pero usando una cola
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

    //Metodo de insercion ordenada en el Arbol
    private Nodo insertaOrdenado(Nodo a, char info){
        if(a == null){return new Nodo(info);}
        if(info < a.info){
            a.hizq = insertaOrdenado(a.hizq, info);
            return a;
        }
        a.hder = insertaOrdenado(a.hder, info);
        return a;
    }

    public void insertaOrdenado(char info){
        raiz = insertaOrdenado(raiz, info);
    }

    //Metodo para saber si el arbol es degenerado
    private boolean degenerado(Nodo a){
        if(a == null){return true;}
        if(a.hizq != null && a.hder != null){return false;}
        /*un hijo o los dos son nulos
         * los ods hijos son nulos, i.e es una hoja
         */
        if(a.hder == null && a.hizq == null){return true;}
        //uno de los hijos es nulo
        if(a.hizq != null){return degenerado(a.hizq);}
        return degenerado(a.hder);

    }

    public boolean degenerado(){
        return degenerado(raiz);
    }

    //Metodo para saber si un arbol cumple con ser ABB
    private boolean esABB(Nodo a, char min, char max){
        if(a == null){return true;}
        if(a.info < min || a.info > max){return false;}
        return esABB(a.hizq,min,a.info) && esABB(a.hder, a.info, max);
    }

    public boolean esABB(){
        if(raiz == null){return true;}
        return esABB(raiz, Character.MIN_VALUE, Character.MAX_VALUE);
    }
    /*
    Método que valida que el árbol esté lleno (examen) utilizando una lista y validando que el
    número de nodos sea una potencia de dos de cada nivel.
    */

    public boolean llenoExamenUno(){
        String aux = "";
        List<Nodo> l = new LinkedList();
        //agregamops la raiz
        l.add(raiz);
        int tam;
        int numNodosNiivel = 1;
        while((tam = l.size()) != 0){
            //tam debera de ser una potencia de 2
            if(tam != numNodosNiivel){
                return false;
            }
            numNodosNiivel *= 2;
            for(int i = 0; i < tam; i++){
                Nodo a = l.remove(0);
                if(a.hizq != null){
                    l.add(a.hizq);
                }
                if(a.hder != null){
                    l.add(a.hder);
                }
            }
        }
        return true;
    }

    /*
    Método que valida que el árbol esté lleno (examen) utilizando una lista y validando que
    cuando el primer elemento de la lista es nulo todos los demás deben de serlo, si no es nulo
    todos los demás no deberán serlo.
     */
    public boolean llenoExamenDos(){
        List<Nodo> l = new LinkedList();
        int tam;
        while((tam = l.size()) != 0){
            boolean nulo = false;
            boolean primero = true;
            for(int i = 0; i < tam; i++){
                Nodo a = l.remove(0);
                if(primero){
                    primero = false;
                    nulo = a == null;
                }else{
                    if(nulo && a!= null){return false;}
                }
                l.add(a.hizq);
                l.add(a.hder);
            }
        }
        return true;
    }

    @SuppressWarnings("StatementWithEmptyBody")
    private Nodo borrarRaiz(Nodo a){
        if(a == null){return null;}
        if(a.hizq == null){return a.hder;}
        if(a.hder == null){return a.hizq;}
        //Busca el predecesor simetrico
        Nodo aux;
        if(a.hizq.hder == null){
            a.info = a.hizq.info;
            a.hizq = a.hizq.hizq;
        }else {
            for (aux = a; aux.hder.hder != null; aux = aux.hder) ;
            a.info = aux.hder.info;
            aux.hder = borrarRaiz(aux.hder);
        }
        return  a;
    }

    public void borrarRaiz(){
        raiz = borrarRaiz(raiz);
    }
    private Nodo buscayBorra(Nodo a, char info){
        if(a == null){return null;}
        if(a.info == info){return borrarRaiz(a);}
        if(a.info < info){
            a.hder = buscayBorra(a.hizq, info);
        }
        a.hizq = buscayBorra(a.hder, info);
        return a;
    }

    public void buscayBorra(char info){
        raiz = buscayBorra(raiz,info);

    }
    //Metodo busca y borra y borra raiz
    private Nodo buscayBorra2(Nodo a, char info){
        if(a == null){return null;}
        if(info < a.info){
            a.hizq = buscayBorra2(a.hizq, info);
        }else if(info > a.info){
            a.hder = buscayBorra2(a.hder, info);
        }else{
            if(a.prev != null){
                a.prev.suc = a.suc;
            }
            if(a.suc != null){
                a.suc.prev = a.prev;
            }
            if(a.hizq == null){return a.hder;}
            if(a.hder == null){return a.hizq;}
            Nodo aux = a.hizq;
            while(aux.hder != null){
                aux = aux.hder;
            }
            a.info = aux.info;
            a.hizq = buscayBorra2(a.hizq, aux.info);
        }
        return a;
    }

    public void buscayBorra2(char info){
        ponLigas();
        raiz = buscayBorra(raiz, info);
    }

    //Metodo colocar ligas al predecesor y sucesor simetricos
    private Nodo ponLigas(Nodo a, Nodo ant){
        if(a == null){return ant;}
        ant = ponLigas(a.hizq, ant);
        //visita
        if(ant == null){//primer elemento de la lista
            l = a;
        }else{
            ant.suc = a;
            a.prev = ant;
        }
        ant = ponLigas(a.hder, a);
        return ant;

    }

    public void ponLigas(){
        ponLigas(raiz, null);
    }

    //Metodo de inserta ordenado para que considere las ligas al predecesor y sucesor
    //simétricos.
    private Nodo insertaOrdenado2(Nodo a, char from, Nodo ant, char info){
        if(a == null){
            if(ant == null){//primer nodo del arbol
                Nodo aux = new Nodo(info);
                l = aux;
                return aux;
            }
            //No es el primer nodo el arbol
            if(from == 'i'){
                Nodo aux = new Nodo(info);
                aux.suc = ant;
                aux.prev = ant.prev;
                ant.prev = aux;

                if(aux.prev == null){
                    l = aux;
                }else{
                    aux.prev.suc = aux;
                }
                return aux;
            }
            //viene por la derecha
            Nodo aux = new Nodo(info);
            aux.prev = ant;
            aux.suc = ant.suc;
            if (aux.suc != null) {
                aux.suc.prev = aux;
            }
            ant.suc = aux;
            return aux;
        }
        if(info < a.info){
            a.hizq = insertaOrdenado2(a.hizq,'i' , a, info);
        }
        a.hder = insertaOrdenado2(a.hder,'d' , a, info);
        return a;
    }

    public void insertaOrdenado2(char info){
        raiz = insertaOrdenado2(raiz, 'a', null, info);
    }

    //Metodo de busca y borra que considere las ligas al predecesor y sucesor simetricos
    @SuppressWarnings("StatementWithEmptyBody")
    private Nodo borrarRaiz(Nodo a, char info){
        if(a == null){
            return null;
        }
        if(a.hizq == null || a.hder == null){
            if(a.prev != null){
                a.prev.suc = a.suc;
            }else{
                l = a.suc;
            }
            if(a.suc != null){
                a.suc.prev = a.prev;
            }
            if(a.hizq == null){return a.hder;}
            if(a.hder == null){return a.hizq;}
        }
        //buca el predecesor simetrico
        Nodo aux;
        if(a.hizq.hder == null){
            a.info = a.hizq.info;
            a.hizq = buscayBorra(a.hizq, info);
        }else{
            for(aux = a.hizq; aux.hder.hder != null; aux = a.hizq.hizq );
            a.info = aux.hder.info;
            aux.hder = buscayBorra(aux.hder, info);
        }
        return a;
    }

    public void borrarRaiz(char info){
        raiz = buscayBorra(raiz, info);
    }

    public String recorreLista(){
        Nodo aux;
        String salida = "";
        for(aux = l; aux != null; aux = aux.suc){
            if("".equals(salida)){
                salida = "" + aux;
            }else{
                salida += "," + aux;
            }
        }
        return salida;
    }

    @SuppressWarnings("StatementWithEmptyBody")
    public String recorreListaAlReves(){
        if(l == null){return "lista vacia";}
        Nodo aux;
        String salida = "";
        for(aux = l; aux.suc != null; aux = aux.suc);
        for(; aux != null; aux = aux.prev){
            if("".equals(salida)){
                salida = "" + aux;
            }else{
                salida += "," + aux;
            }
        }
        return salida;
    }
}
