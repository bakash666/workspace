public class Main {
    public static void main(String[] args) {
      
        Veterinaria miClinica = new Veterinaria("Veterinaria Unicorsalud");

        Dueño cliente1 = new Dueño("Juan Pérez", "300-1234567");
        Mascota paciente1 = new Mascota("Firulais", "Perro", 5);

        paciente1.actualizarHistorial("Vacunación triple felina/canina completada.");
        paciente1.actualizarHistorial("Limpieza dental realizada.");

        miClinica.agendarCita(cliente1, paciente1, "20-Octubre-2026");
    }
}