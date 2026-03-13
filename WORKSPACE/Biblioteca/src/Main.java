public class Main {
    public static void main(String[] args) {
        Biblioteca miBiblioteca = new Biblioteca();
        
        Libro l1 = new Libro("Cien años de soledad", "García Márquez", 1967, "978-1");
        Libro l2 = new Libro("Don Quijote", "Miguel de Cervantes", 1605, "978-2");
        Libro l3 = new Libro("El Principito", "Saint-Exupéry", 1943, "978-3");
        Libro l4 = new Libro("Java POO", "Expertos UNICORSALUD", 2024, "978-4");

        miBiblioteca.agregarLibro(l1);
        miBiblioteca.agregarLibro(l2);
        miBiblioteca.agregarLibro(l3);
        miBiblioteca.agregarLibro(l4);

        Usuario estudiante = new Usuario("Pedro Pérez", "ID-123");
        miBiblioteca.registrarUsuario(estudiante);

        System.out.println("--- Iniciando Préstamos ---");
        miBiblioteca.procesarPrestamo(estudiante, l1);
        miBiblioteca.procesarPrestamo(estudiante, l2);
        miBiblioteca.procesarPrestamo(estudiante, l3);

        miBiblioteca.procesarPrestamo(estudiante, l4);

        miBiblioteca.mostrarLibrosDisponibles();
    }
}