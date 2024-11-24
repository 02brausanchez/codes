package EjercicioCinco;

public class ArbolCinco {
    NodoCinco raiz; 

    public ArbolCinco(){
        raiz = null;
    }

    public static ArbolCinco ejemplo(){
        ArbolCinco a = new ArbolCinco(); 
        a.raiz = new NodoCinco('k'); 
        a.raiz.hizq = new NodoCinco('l');
        a.raiz.hder = new NodoCinco('m');
        a.raiz.hizq.hizq = new NodoCinco('n');
        a.raiz.hizq.hder = new NodoCinco('o');
        a.raiz.hder.hizq = new NodoCinco('p');
        a.raiz.hder.hder = new NodoCinco('q');
        a.raiz.hizq.hder.hder = new NodoCinco('k');
        return a;
    }
    
    public void previo(NodoCinco a) {
        if (a == null) return;
        System.out.println(a.info);
        previo(a.hizq);
        previo(a.hder);
    }

    public void previo() {
        previo(raiz);
    }

    public void enOrden(NodoCinco a) {
        if (a == null) return;
        enOrden(a.hizq);
        System.out.println(a);
        enOrden(a.hder);
    }

    public void enOrden() {
        enOrden(raiz);
    }

    public void postOrden(NodoCinco a) {
        if (a == null) return;
        postOrden(a.hizq);
        postOrden(a.hder);
        System.out.println(a);
    }

    public void postOrden() {
        postOrden(raiz);
    }

    public int numNodo(NodoCinco a) {
        if (a == null) return 0;
        return numNodo(a.hizq) + numNodo(a.hder) + 1;
    }

    public int numNodo() {
        return numNodo(raiz);
    }

    public void soloHojas(NodoCinco a) {
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

    public void noHojas(NodoCinco a) {
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

    public int altura(NodoCinco a) {
        if (a == null) return 0;
        int ai = altura(a.hizq);
        int ad = altura(a.hder);
        return (ai > ad ? ai:ad)+1;
    }

    public int altura() {
        return altura(raiz);
    }

    public String toString(NodoCinco a) {
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

    private boolean iguales(NodoCinco a, NodoCinco b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;
        if (a.info != b.info) return false;
        return iguales(a.hizq, b.hizq) && iguales(a.hder, b.hder);
    }

    public boolean iguales(ArbolCinco a) {
        return iguales(raiz, a.raiz);
    }

    private NodoCinco strToArbol(char[]s, int [] i){
        NodoCinco aux = new NodoCinco(s[i[0]]); //elemento 0 del arreglo
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

    public ArbolCinco(String a){
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

   private ArbolCinco clonar(NodoCinco aux){
    ArbolCinco arbolClonado = new ArbolCinco(); 
    if(aux == null){
        return arbolClonado;
    }
    arbolClonado.raiz = new NodoCinco(aux.info); 
    if(aux.hizq != null){
        arbolClonado.raiz.hizq = clonar(aux.hizq).raiz;
    }
    if(aux.hder != null){
        arbolClonado.raiz.hder = clonar(aux.hder).raiz;
    }
    return arbolClonado;
   }

    public ArbolCinco clonar(){
        return clonar(raiz);
    }
}
