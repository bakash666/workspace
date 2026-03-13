public class Veterinaria {
    private String nombreClinica;

    public Veterinaria(String nombre) {
        this.nombreClinica = nombre;
    }

    public void agendarCita(Dueño dueño, Mascota mascota, String fecha) {
        System.out.println("\n[CITA AGENDADA EN " + nombreClinica.toUpperCase() + "]");
        System.out.println("Fecha: " + fecha);
        System.out.println("Propietario: " + dueño.getNombre());
        System.out.print("Paciente: ");
        mascota.mostrarFicha();
    }
}