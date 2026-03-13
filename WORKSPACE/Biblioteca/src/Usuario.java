import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String identificacion;
    private List<Libro> librosPrestados;

    public Usuario(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.librosPrestados = new ArrayList<>();
    }


    public boolean solicitarPrestamo(Libro libro) {
        if (librosPrestados.size() < 3) {
            librosPrestados.add(libro);
            return true;
        }
        return false;
    }

    public void devolverLibro(Libro libro) {
        librosPrestados.remove(libro);
    }

    public String getNombre() { return nombre; }
}