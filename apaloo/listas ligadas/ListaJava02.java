package Listas;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ListaJava02 {
    public static void main(String[] args) {
        List<Series> s = new LinkedList();

        s.add (new Series("Breaking Bad", 2008,"Drama criminal"));
        s.add(new Series("Mr. Robot",2015,"Drama televiso / Tecno-thriller"));
        s.add(new Series("Better Call Saul ",2015,"Drama criminal / Tragedia"));
        s.add(new Series("The Simpsons",1989,"Animacion / Comedia"));
        s.add(2, new Series("Peaky Blinders", 2013,"Drama criminal / Ficcion historica"));
        s.sort(c1);
        s.sort(c2);
        s.sort(c3);

        s.forEach(ListaJava02::s);
            System.out.println("Dentro del top 5 como una de las mejores series de los todos los tiempos: " +s.get(1));
        }

        static Comparator<Series> c1 =(Series a, Series b)-> a.nameSerie.compareTo(b.nameSerie);
        static Comparator<Series> c2 = (Series a, Series b)-> a.yearSerie - b.yearSerie; 
        static Comparator<Series> c3 = (Series a, Series b)->(a.yearSerie+a.genreSerie).compareTo(b.yearSerie+b.genreSerie); 
        
        public static void s(Series x){
            System.out.println("Acerca de la 🎬 "+x);
        }        
}

