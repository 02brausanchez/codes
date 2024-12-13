package Semana7and8;


import java.util.LinkedList;
import java.util.List;

public class Arbol {
    Nodo l, raiz;

    public Arbol(){
        l = raiz = null;
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

    private Nodo clonar(Nodo a){
        if(a == null){return null;}
        Nodo aux = new Nodo(a.info);
        aux.hizq = clonar(a.hizq);
        aux.hder = clonar(a.hder);
        return aux;
    }

    public Arbol clonar(){
        Arbol aux = new Arbol();
        aux.raiz = clonar(raiz);
        return aux;
    }

    private double evalua(Nodo a){
        if(a == null){return 0;}
        switch (a.info){
            case '+':
                return evalua(a.hizq) + evalua(a.hder);
            case '-':
                return evalua(a.hizq) - evalua(a.hder);
            case '*':
                return evalua(a.hizq) * evalua(a.hder);
            case '/':
                return evalua(a.hizq) / evalua(a.hder);
            default: return a.info-'0';
        }
    }

    public double evalua(){
        return evalua(raiz);
    }

    private Nodo derivada(Nodo a, char variable){
        if(a == null){return null;}
        switch(a.info){
            case '+', '-' -> {
                return derivaSumaResta(a, a.info, variable);
            }
            case '*' -> {
                return derivaMulti(a, variable);
            }
            case '/' -> {
                return derivaDiv(a, variable);
            }
            default -> {
                if(a.info == variable){
                    return new Nodo('1');
                }
                return new Nodo('0');
            }
        }
    }

    private Nodo derivaSumaResta(Nodo a, char op, char variable){
        Nodo aux = new Nodo(op);
        aux.hizq = derivada(a.hizq, variable);
        aux.hder = derivada(a.hder, variable);
        return aux;
    }

    private Nodo derivaMulti(Nodo a, char variable){
        Nodo aux = new Nodo('+');
        aux.hizq = new Nodo('*');
        aux.hder = new Nodo('*');
        aux.hizq.hizq = derivada(a.hizq, variable);
        aux.hizq.hder = clonar(a.hder);
        aux.hder.hizq = clonar(a.hizq);
        aux.hder.hder = derivada(a.hder, variable);
        return aux;
    }

    private Nodo derivaDiv(Nodo a, char variable){
        Nodo aux = new Nodo('/');
        aux.hizq = new Nodo('-');
        aux.hizq.hizq = new Nodo('*');
        aux.hizq.hder = new Nodo('*');
        aux.hizq.hizq.hizq = clonar(a.hizq);
        aux.hizq.hizq.hder = derivada(a.hder, variable);
        aux.hizq.hder.hizq = derivada(a.hizq, variable);
        aux.hizq.hder.hder = clonar(a.hder);
        aux.hder = new Nodo('*');
        aux.hder.hizq = clonar(a.hder);
        aux.hder.hder = clonar(a.hder);
        return aux;
    }

    public Arbol deriva(char variable){
        Arbol aux = new Arbol();
        aux.raiz = derivada(raiz, variable);
        return aux;
    }

    private String toInfijo(Nodo a){
        if(a == null){return "";}
        String auxi = "";
        String auxd = "";
        if(a.info =='/' && (a.hder.hder != null || a.hder.hizq != null)){
            return toInfijo(a.hizq) + "(" + toInfijo(a.hder) + ")";
        }

        if(a.info == '*' || a.info == '/'){
            if(a.hizq.info == '+' || a.hizq.info == '-'){
                auxi = "(" + toInfijo(a.hizq)+")";
            }else{
                auxi = toInfijo(a.hizq);
            }
            if(a.info == '/' && (a.hder.hder != null || a.hder.hizq != null)){
                auxd = "(" + toInfijo(a.hder) + ")";
            }else {
                if(a.hder.info == '+' || a.hder.info == '-'){
                    auxd = "(" + toInfijo(a.hder)+")";
                }else{
                    auxd = toInfijo(a.hder);
                }
            }
            return auxi + a.info + auxd;

        }
        if(a.info == '+' || a.info == '-'){
            if(a.hizq == null && (a.hder.hizq != null || a.hder.hder != null)){
                return "(" + a.info + toInfijo(a.hder) + ")";
            }
            return toInfijo(a.hizq) + a.info + toInfijo(a.hder);
        }
        return ""+a.info;
    }

    public String toInfijo(){
        return toInfijo(raiz);
    }

    private Nodo expSimple(char [] s , int [] i){
        Nodo signo = null;
        if(s[i[0]] == '+' || s[i[0]]=='/'){
            signo = new Nodo(s[i[0]]);
            i[0]++;
        }
        Nodo aux = termino(s, i);
        while(s[i[0]] == '*' || s[i[0]] == '/'){
            Nodo aux1 = new Nodo(s[i[0]]);
            i[0]++;
            aux1.hizq = aux;
            aux1.hder = termino(s,i);
            aux = aux1;
        }
        if(signo != null){
            signo.hder = aux;
            return aux;
        }
        return aux;
    }

    private Nodo termino(char [] s, int [] i){
        Nodo aux = factor(s,i);
        while(s[i[0]] == '+' || s[i[0]] == '-'){
            Nodo aux1 = new Nodo(s[i[0]]);
            i[0]++;
            aux1.hizq = aux;
            aux1.hder = factor(s,i);
            aux = aux1;
        }
        return aux;
    }

    private Nodo factor(char [] s, int [] i){
        if(s[i[0]] == '('){
            i[0]++;
            Nodo aux = expSimple(s, i);
            i[0]++;
            return aux;
        }
        return new Nodo(s[i[0]++]);
    }

    public Arbol (int k, String s){
        char [] a = (s+"#").toCharArray();
        int [] i = new int[1];
        i[0] = 0;
        raiz = expSimple(a, i);
    }

    private Nodo podaSuma(Nodo a){
        //neutro aditivo por la izquierda
        if(a.hizq.info == '0'){
            return a.hder;
        }
        if(a.hder.info == '0'){
            return a.hizq;//neutro aditivo por la derecha
        }
        return a;
    }
    private Nodo podaResta (Nodo a){
        //Neutro aditivo por la izquierda
        if(a.hizq.info == '0'){
            a.hizq = null;
            return a;
        }
        //neutro aditivo por la derecha
        if(a.hder.info == '0'){
            return a.hizq;
        }
        return a;
    }

    private Nodo podaMul(Nodo a){
        if(a.hizq.info == '0' || a.hder.info == '0'){
            return new Nodo('0');
        }
        //neutro multiplicativo por la derecha
        if(a.hizq.info == '1'){
            return a.hder;
        }
        if(a.hder.info == '1'){
            return a.hizq;
        }
        return a;
    }

    private Nodo podaDiv(Nodo a){
        if(a.hizq.info == '0'){
            return new Nodo('0');
        }
        if(a.hder.info == '1'){
            return a.hizq;
        }
        return a;
    }

    private Nodo poda(Nodo a){
        if(a == null){return null;}
        a.hizq = poda(a.hizq);
        a.hder = poda(a.hder);
        switch (a.info){
            case '+': return podaSuma(a);
            case '-': return podaResta(a);
            case '*': return podaMul(a);
            case '/': return podaDiv(a);
            default: return a;
        }
    }

    public void poda(){
        raiz = poda(raiz);
        raiz = poda(raiz);
    }

}
