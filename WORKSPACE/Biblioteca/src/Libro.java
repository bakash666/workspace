public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private String isbn;
    private boolean disponible;

    public Libro(String titulo, String autor, int anioPublicacion, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.isbn = isbn;
        this.disponible = true;
    }

    public void prestar() {
        this.disponible = false;
    }

    public void devolver() {
        this.disponible = true;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public boolean isDisponible() { return disponible; }

    @Override
    public String toString() {
        return "Libro: " + titulo + " | Autor: " + autor + " | Estado: " + (disponible ? "Disponible" : "Prestado");
    }
}