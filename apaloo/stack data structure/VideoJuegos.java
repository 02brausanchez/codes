package pilas;

public class VideoJuegos implements Comparable <VideoJuegos> {
    String name, genre; 
    int year,price; 
    
    public VideoJuegos(String name, String genre, int year, int price){
        this.name = name; 
        this.genre = genre;
        this.year = year; 
        this.price = price; 
    }

    public void setName(String name){
        this.name = name;
    }

    public void setGenre(String genre){
        this.genre = genre; 
    }
    
    public void setYear(int year){
        this.year = year; 
    }

    public void setPrice(int price){
        this.price = price; 
    }

    public String getName(){
        return name; 
    }

    public String getGenre(){
        return genre; 
    }

    public int getYear(){
        return year; 
    }

    public int getPrice(){
        return price; 
    }


    public String toString(){
        return  "Juego: " + name + "| Genero: " + genre + "| Fecha de lanzamiento: " + year +"| Precio: $" + price + "\n";  
    }

    public int compareTo(VideoJuegos o){
        //compara solo el nombre 
        return this.name.compareTo(o.name); 
    }
}
