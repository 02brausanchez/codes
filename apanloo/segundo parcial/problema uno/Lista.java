package ProgramaTres;

import java.util.ArrayList;
import java.util.List;

public class Lista<T extends Comparable<T>> {
    private List<T> L = null;

    public void insertaOrdenado(T item) {
        int j = 0;
        if (L == null) {
            L = new ArrayList<>();
            L.add(item);
        } else {
            for (T i : L) {
                if (item.compareTo(i) >= 0) {
                    break;
                }
                j++;
            }
            L.add(j, item);
        }
    }

    public int getTam() {
        return L.size();
    }

    public T getElement(int index) {
        return L.get(index);
    }

    public void destruir() {
        L = null;
    }

    public void recorreLista() {
        for (T i : L) {
            System.out.println(i);
        }
    }

    public boolean buscaElement(T element) {
        if (L == null || L.isEmpty()) {
            return false; // Si la lista está vacía, el elemento no existe.
        }
        for (T i : L) {
            if (i.equals(element)) {
                return true; // Elemento encontrado.
            }
        }
        return false; // Elemento no encontrado.
    }

    public void insertaOrdenadoAlreves(T item) {
        int j = 0;
        if (L == null) {
            L = new ArrayList<>();
            L.add(item);
        } else {
            for (T i : L) {
                if (item.compareTo(i) <= 0) { // Cambiar >= a <= para orden inverso.
                    break;
                }
                j++;
            }
            L.add(j, item);
        }
    }

}
