package semanauno;

public class Lista {
    Nodo l;
    //Nodo ultimo;
    public Lista (){
        l = null;
        //ultimo = null;
    }
    //De manera no recursiva
    public void agregarNodoFinal(int info){
        if(l == null){
            l = new Nodo(info);
            //ultimo = l;
        }else {
            Nodo aux;
            for (aux = l; aux.sig != null; aux = aux.sig) {

            }
            aux.sig = new Nodo(info);
            //ultimo = aux.sig;
        }
    }

    //Imprimir el ultimo elemento
    @Override
    public String toString(){
        return "[" + (ultimo != null ? ultimo.info : "") + "]";
        /*if(ultimo != null){
            return "[" + ultimo.info + "]"; 
        }else{
            return "[]";
        }*/    
    }
    
    //Imprime todos los valores
    @Override
    public String toString() {
        String valores = "";
        Nodo aux;
        for (aux = l; aux != null; aux = aux.sig) {
            valores += aux.info;
            if (aux.sig != null) {
                valores += ",";
            }
        }
        return "[" + valores + "]";
    }  
     
    //De manera recursiva
    private Nodo insertaFinal(Nodo a, int info){
        if(a == null){return new Nodo(info);}
        a.sig = insertaFinal(a.sig, info);
        return a;
    }

    public void insertaFinal(int info){
        l = insertaFinal(l,info);
    }
}
