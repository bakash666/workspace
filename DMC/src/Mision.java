public class Mision {
    private String nombreMision;
    private int dificultad;

    public Mision(String nombre, int dificultad) {
        this.nombreMision = nombre;
        this.dificultad = dificultad;
    }

    public void iniciar(Personaje p) {
        System.out.println("Iniciando Misión: " + nombreMision + " (Dificultad: " + dificultad + ")");
        p.mostrarEstado();
    }
}