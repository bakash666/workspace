public class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    private String historialMedico;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.historialMedico = "Sin registros previos.";
    }

    public void actualizarHistorial(String nuevoRegistro) {
        this.historialMedico += "\n- " + nuevoRegistro;
    }

    public void mostrarFicha() {
        System.out.println("--- FICHA DE PACIENTE ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Historial: " + historialMedico);
    }
}