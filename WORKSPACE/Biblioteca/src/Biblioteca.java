import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> coleccionLibros = new ArrayList<>();
    private List<Usuario> usuariosRegistrados = new ArrayList<>();

    public void agregarLibro(Libro libro) {
        coleccionLibros.add(libro);
    }

    public void registrarUsuario(Usuario usuario) {
        usuariosRegistrados.add(usuario);
    }

    public void buscarLibro(String criterio) {
        System.out.println("Resultados para: " + criterio);
        for (Libro l : coleccionLibros) {
            if (l.getTitulo().equalsIgnoreCase(criterio) || l.getAutor().equalsIgnoreCase(criterio)) {
                System.out.println(l);
            }
        }
    }

    public void mostrarLibrosDisponibles() {
        System.out.println("\n--- Libros Disponibles en Biblioteca ---");
        for (Libro l : coleccionLibros) {
            if (l.isDisponible()) System.out.println(l);
        }
    }


    public void procesarPrestamo(Usuario u, Libro l) {
        if (!l.isDisponible()) {
            System.out.println("Error: El libro '" + l.getTitulo() + "' ya está prestado.");
        } else if (u.solicitarPrestamo(l)) {
            l.prestar();
            System.out.println("Éxito: " + u.getNombre() + " ha tomado prestado " + l.getTitulo());
        } else {
            System.out.println("Error: " + u.getNombre() + " excedió el límite de 3 libros.");
        }
    }
}