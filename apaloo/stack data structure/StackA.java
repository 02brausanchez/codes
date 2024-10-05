package pilas;

public class StackA {
    int tope;
    int [] datos; 
    
    public StackA(int tam){
        datos = new int [tam]; 
        tope = tam-1; 
    }

    public void push(int dato){
        if(tope == -1){
            return;
        }
        datos[tope--] = dato; 
    }
    
    public int pop(){
        if(tope == datos.length-1){
            return 0; 
        }
        tope++; 
        return(datos[tope]); 
    } 

    public void destruye(){
        tope = datos.length-1; 
    }
}
