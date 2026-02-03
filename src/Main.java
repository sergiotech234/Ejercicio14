import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void eliminarMenores(List<Persona> personas) {
        Iterator<Persona> it = personas.iterator();
        while (it.hasNext()) {
            Persona p = it.next();
            if (p.getEdad() < 18) {
                it.remove(); // eliminación segura
            }
        }
    }

    public static void main(String[] args) {
        List<Persona> lista = new ArrayList<>();
        lista.add(new Persona("Ana", 20));
        lista.add(new Persona("Luis", 16));
        lista.add(new Persona("Maria", 18));
        lista.add(new Persona("Pedro", 15));
        lista.add(new Persona("Lucia", 25));

        System.out.println("Lista original:");
        for (Persona p : lista) {
            System.out.println(p);
        }

        // Llamamos al método
        eliminarMenores(lista);

        System.out.println("\nLista después de eliminar menores de 18:");
        for (Persona p : lista) {
            System.out.println(p);
        }
    }
}
