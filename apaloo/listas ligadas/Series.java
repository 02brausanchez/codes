package Listas;

public class Series implements Comparable<Series> {
    String nameSerie;
    int yearSerie;
    String genreSerie;

    public Series(String nameSerie, int yearSerie, String genreSerie){
        this.nameSerie = nameSerie;
        this.yearSerie = yearSerie;
        this.genreSerie = genreSerie;
    }

    public void setName(String nameSerie){
        this.nameSerie = nameSerie;
    }

    public void setYear(int yearSerie){
        this.yearSerie  = yearSerie;
    }

    public void setGenre(String genreSerie){
        this.genreSerie = genreSerie;
    }

    public String getName(){
        return nameSerie;
    }

    public int getYear(){
        return yearSerie;
    }

    public String getGenre(){
        return genreSerie;
    }

    public String toString(){
        return "Serie: " + nameSerie + "| Año de emision:  " + yearSerie + "| Genero: " + genreSerie;
    }

    public int compareTo(Series o){
        return this.nameSerie.compareTo(o.nameSerie);
    }

}
