package SemanaSeis;

import java.util.LinkedList;
import java.util.List;

public class Arbol {
    Nodo raiz; 

    public Arbol(){
        raiz = null;
    }

    public int numNodos(Nodo a) {
        if (a == null) return 0;
        return numNodos(a.hizq) + numNodos(a.hder) + 1;
    }

    public int numNodo() {
        return numNodos(raiz);
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

    public boolean isCompleto(Nodo raiz){
        if(raiz == null){
            return true;
        }
        List<Nodo> queue = new LinkedList(); 
        boolean flag = false; 
        queue.add(raiz); 
        while(!queue.isEmpty()){
            int size = queue.size(); 
            for(int i = 0; i < size; i++){
                Nodo tmp = queue.remove(0); 
                if(tmp == null){
                    flag = true; 
                }else if(flag){
                    return false;
                }else{
                    queue.add(queue.size(), tmp.hizq);
                    queue.add(queue.size(), tmp.hizq);
                }
            }
        }
        return true;
    }

    public boolean isCompleto(){
        return isCompleto(this.raiz);
    }

    private Tipo completo(Nodo a){
        if(a == null){return new Tipo('F',0);}
        Tipo tipoHizq, tipoHder; 
        tipoHizq = completo(a.hizq); 
        tipoHder = completo(a.hder); 
        //Caso 1 
        if(tipoHizq.tipo == 'F' && tipoHder.tipo == 'F' && tipoHizq.h == tipoHder.h){
            return new Tipo('F', tipoHizq.h+1); 
        }
        //Caso 2 
        if(tipoHizq.tipo == 'F' && tipoHder.tipo == 'C'&& tipoHizq.h == tipoHder.h){
            return new Tipo('C', tipoHizq.h+1); 
        }
        //Caso 3 
        if(tipoHizq.tipo == 'F' && tipoHder.tipo == 'F' && tipoHizq.h == tipoHder.h+1){
            return new Tipo('C', tipoHizq.h+1);
        }
        //Caso 4
        if(tipoHizq.tipo == 'C' && tipoHder.tipo == 'F' && tipoHizq.h == tipoHder.h+1){
            return new Tipo('C', tipoHizq.h+1);
        }
        //Ninguno 
        return new Tipo('#', 0); 
    }

    public boolean completo(){
        Tipo aux = completo(raiz); 
        return aux.tipo == 'C' || aux.tipo == 'F'; 
    }

    private boolean isComplete(Nodo a, int index, int numNodos){
        if(a == null){return true;}
        if(index >= numNodos){return false;}
        return isComplete(a.hizq, 2*index+1, numNodos)&&
        isComplete(a.hder, 2*index+2, numNodos);
    }

    public boolean isComplete(){
        return isComplete(raiz,0,numNodos(raiz)); 
    }

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

    private boolean busqueda(Nodo a, char info){
        if(a == null){return false;}
        if(a.info == info){return true;}
        if(info < a.info ){
            return busqueda(a.hizq, info);
        }
        return busqueda(a.hder, info);
    }

    public boolean busqueda(char info){
        return busqueda(raiz, info);
    }

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
}