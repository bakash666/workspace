public class Libro {
    // Atributos privados para proteger los datos
    private String titulo;
    private String autor;

    // Constructor para inicializar el libro con información
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("--------------------------------");
        System.out.println("TÍTULO DEL LIBRO: " + this.titulo);
        System.out.println("AUTOR DEL LIBRO: " + this.autor);
        System.out.println("--------------------------------");
    }

    // Método para cambiar el autor (Setter)
    public void cambiarAutor(String nuevoAutor) {
        this.autor = nuevoAutor;
        System.out.println("¡El autor ha sido actualizado correctamente!");
    }
}