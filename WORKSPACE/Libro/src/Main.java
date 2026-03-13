import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        // Pedir información inicial
        System.out.print("Escribe el título del libro: ");
        String tituloInicial = lector.nextLine();

        System.out.print("Escribe el autor del libro: ");
        String autorInicial = lector.nextLine();

        // Crear el objeto con la información recibida
        Libro miLibro = new Libro(tituloInicial, autorInicial);

        // Mostrar la información
        System.out.println("\nInformación actual:");
        miLibro.mostrarInformacion();

        // Cambiar el autor
        System.out.print("¿Deseas cambiar el autor? Escribe el nuevo nombre: ");
        String nuevoAutor = lector.nextLine();
        miLibro.cambiarAutor(nuevoAutor);

        // Mostrar información actualizada
        System.out.println("\nInformación tras el cambio:");
        miLibro.mostrarInformacion();

        lector.close();
    }
}