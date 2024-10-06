package EjercicioSeis;
public class MainLista {
    public static void main(String[] args) {
        Lista c = new Lista();
        c.encolarLista("Eduardo");
        c.encolarLista("Tadeo");
        c.encolarLista("Carlos");
        c.encolarLista("Pedro");

        Lista clonada = c.clonar();
        System.out.println("Original: " +c.toString());
        System.out.println("Clonada: "+clonada.toString());

    }
}
