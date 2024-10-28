package semanaDos;

public class Main {
    public static void main(String[] args) {
        Videojuegos oVideojuegos;
        oVideojuegos = new Videojuegos();

        oVideojuegos.setNombre("Devil may cry 5 ");
        oVideojuegos.setYear(2019);
        oVideojuegos.setPrecio(450);
        oVideojuegos.calculaVida();
        oVideojuegos.calculaDamage();
        System.out.println(oVideojuegos);

        Peliculas oPeliculas = new Peliculas();
        oPeliculas.setNombre("Avengers");
        oPeliculas.setFecha("2012");
        oPeliculas.setGenero("Superheroes");
        System.out.println(oPeliculas);

    }
}
