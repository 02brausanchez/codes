/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolavl;

/**
 *
 * @author Administrador
 */
public class Arbol <T extends Comparable<T>>{
   NodoAVL raiz;
    
   private int altura(NodoAVL nodo){
       int ai, ad;
       if (nodo.hi == null) {
           ai = -1;
       }
       else { ai = nodo.hi.altura;}
       if (nodo.hd == null) {
           ad = -1;
       }
       else { ad = nodo.hd.altura;}
       return ad>ai?ad+1:ai+1;
       
   }
   
   private int alturaAVL(NodoAVL r){
       if (r == null) {return -1;}
       return r.altura;
   }
   
   private int balanceAVL(NodoAVL a){
       return alturaAVL(a.hi)-alturaAVL(a.hd);
   }
   
   
   //método de inserción ordenada con actualización de altura
   private NodoAVL insertaRec(NodoAVL a, T info){
       
       int balance;
       NodoAVL x,y,z, v,w, aux;
       
       if (a == null){
          a = new NodoAVL();
          a.info = info;
          a.altura = 0;
          return a;
       }
       if (a.info.compareTo(info)> 0){
           a.hi=insertaRec(a.hi, info);    
       }
       else {
           a.hd=insertaRec(a.hd, info);    
       }
       //actualiza la altura    
       a.altura = altura(a);
       
       //Calcula el desbalance y manda a llamar a las distintas rotaciones
       balance = balanceAVL(a);
       
       if (Math.abs(balance)== 2){
         //decide el tipo de desbalance
         if (balance == 2 && balanceAVL(a.hi) == 1){
           x = a.hi.hi;
           y = a.hi.hd;
           z = a.hd;
           aux = a.hi;
           a.hi = y;
           a.hd = z;
           aux.hi = x;
           aux.hd = a;
           a.altura = altura(a);
           aux.altura = altura(aux);
           return aux;
         }  
         if (balance == -2 && balanceAVL(a.hd) == -1){
             x=a.hd.hd;
             y=a.hd.hi;
             z=a.hi;
             aux =a.hd;
             a.hi = z;
             a.hd = y;
             aux.hi = a;
             aux.hd = x;
             a.altura = altura(a);
             aux.altura = altura(aux);
             
             return aux;
         } 
         if (balance == 2 && balanceAVL(a.hi)== -1){
             x=a.hi.hi;
             y=a.hi.hd;
             z= a.hd;
             v = y.hi;
             w = y.hd;
             aux = a.hi;
             y.hi = aux;
             y.hd = a;
             aux.hi = x;
             aux.hd=v;
             a.hi=w;
             a.hd=z;
             //coloca las nuevas alturas
             aux.altura = altura(aux);
             y.hi.altura = altura(y.hi);
             y.hd.altura = altura(y.hd);
             y.altura = altura(y);
             
             return y;
         }
         if (balance == -2 && balanceAVL(a.hd)==1){
             z = a.hi;
             aux = a.hd;
             y=aux.hi;
             x=aux.hd;
             w=y.hi;
             v=y.hd;
             //forma el nuevo árbol
             a.hi=z;
             a.hd=w;
             aux.hi=v;
             aux.hd=x;
             y.hi=a;
             y.hd=aux;
             
             //actualiza las alturas
             y.hi.altura=altura(y.hi);
             y.hd.altura=altura(y.hd);
             y.altura=altura(y);
             aux.altura=altura(aux);
             return y;
             
         }
        }
       return a;
   }
   
   public void inserta(T info){
       this.raiz = insertaRec(raiz, info);
   }
   
   private void recorreRec(NodoAVL nodo){
       if (nodo == null){return;}
       recorreRec(nodo.hi);
       System.out.println(nodo.info+" altura "+nodo.altura+" balance "+ balanceAVL(nodo));
       recorreRec(nodo.hd);
       
   }
   
   public void recorre(){
       recorreRec(raiz);
   }
   
   private void recorreParRec(NodoAVL nodo){
       if (nodo == null){return;}
       
       if (nodo.hi == null && nodo.hd == null)
       {   
          System.out.print(nodo.info); 
          return;
       }
       
       System.out.print(nodo.info); 
       
       System.out.print('(');  
       
       if(nodo.hi!=null){
         recorreParRec(nodo.hi);
       }
       else            
       {
           System.out.print("null");
       }
       System.out.print(','); 
       
       if (nodo.hd!=null){
          recorreParRec(nodo.hd);       
       }
       else
       {
           System.out.print("null");
       }
          System.out.print(')');
   }
   
   public void recorrePar(){
       recorreParRec(raiz);
       System.out.println();
   }
   
   // busca el siguiente en orden simétrico, lo elimina y regresa el nodo
    //eliminado 
    private NodoAVL eliminaSucesorSimetrico(NodoAVL a, NodoAVL r){
 
        
        
        if (a.hi==null) {
            r.info = a.info;
            return a.hd;
          }
        
        a.hi = eliminaSucesorSimetrico(a.hi, r);
        
        return a;
    }
    
    
    private NodoAVL eliminaPredSimetrico(NodoAVL a, NodoAVL r){
 
        
        
        if (a.hd==null) {
            r.info = a.info;
            return a.hi;
          }
        
        a.hd = eliminaSucesorSimetrico(a.hd, r);
        
        return a;
    }
    
    //Elimina la raíz del árbol
    private NodoAVL eliminaNodoRec(NodoAVL a){
        
        if (a == null) {return null;}
        
        //Si es una hoja lo elimina
        if(a.hi==null&&a.hd==null){
            return null;
        }
        
        //Si tiene hijo derecho elimina el sucesor simétrico
        if (a.hd!=null){
            a.hd=eliminaSucesorSimetrico(a.hd, a);
            return a;
        }
        //Elimina el predecesor simétrico
        a.hi = eliminaPredSimetrico(a.hi, a);
        
        //Mete los posibles balanceos
        
        return a;
    }
    
    //elimina un nodo del árbol
    private NodoAVL buscayelimina(NodoAVL a, T dato){
       
                
        //si es una hoja simplemente regresa null
        if (a.hi == null && a.hd == null){
            return null;
        }
        if (a.info.compareTo(dato)>0){
            a.hi = buscayelimina(a.hi, dato);
        }
        else {
           a.hd = buscayelimina(a.hd, dato);
        }
        return a;
    }
    
    
}
