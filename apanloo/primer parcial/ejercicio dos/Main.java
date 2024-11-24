package EjercicioDos;

public class Main {
    public static Instrumento generarInstrumento(int i){
        switch (i) {
            default:
            case 0:
                return new Viento();    
            case 1:
                return new Percusion();
            case 2: 
                return new Cuerda();
            case 3: 
                return new Electrico();
        }
    }

    public static void afinarInstrumento (Instrumento o){
        o.afinar();
    }

    public static void tocarInstrumento(Instrumento o){
        o.tocar();
    }

    public static void tocarInstrumento(Instrumento o, String nota){
        o.tocar(nota);
    }

    public static void cambiarSonido(Instrumento o, String sonidos){
        o.cambiarSonido(sonidos);
    }

    public static void acompañamientosAutomaticos(Instrumento o, String ritmo){
        o.acompañamientosAutomaticos(ritmo);
    }

    public static void grabarYReproducirMusica(Instrumento o, String reproducir){
        o.grabarYReproducirMusica(reproducir);
    }

    public static void main(String[] args) {
    String [] notas = {"Do", "Re" , "Mi" , "Fa", "Sol", "La", "Si"}; 
    Instrumento orquesta []  = new Instrumento[10]; 
    Instrumento sintetizador [] = new Instrumento[10]; 

    String [] cambiarSonidos = {"Transforma un sonido basico(onda simple)", "Crear un bajo", 
    "Convertir un tambor simple en algo futurista"};
    String [] acompañamientosAutomaticos = {"Ritmo basico con arpegiador", "Base ritmica con estilo pregrabado",
    "Patron de percusion automatica"};
    String [] reproducirMusica = {"Sol(G)", "La(A)", "Si(B)", "La(A)", "Fa(F)"};
    
    for(int i = 0; i < 10; i++){
        orquesta[i] = generarInstrumento(new java.util.Random().nextInt(5)); 
    }
    for(int i = 0; i < 10; i++){
        afinarInstrumento(orquesta[i]);
    }    
    for(int i = 0; i < 10; i++){
        tocarInstrumento(orquesta[i]);
    }
    for(int i = 0; i < 10; i++){
        tocarInstrumento(orquesta[i],notas[i%7]);
    }
    
    for(int j = 0; j < 10; j++){
        sintetizador[j] = generarInstrumento(new java.util.Random().nextInt(5)); 
    }
    for(int j = 0; j < 10; j++){
        cambiarSonido(sintetizador[j],cambiarSonidos[j%3]);
    }
    for(int j = 0; j < 10; j++){
        acompañamientosAutomaticos(sintetizador[j],acompañamientosAutomaticos[j%3]);
    }
    for(int j = 0; j < 10; j++){
        grabarYReproducirMusica(sintetizador[j],reproducirMusica[j%5]);
    }
    
    }
}