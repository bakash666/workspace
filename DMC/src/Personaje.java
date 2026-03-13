import java.util.ArrayList;
import java.util.List;

public class Personaje {
    private String nombre;
    private int salud;
    private List<Arma> equipo;

    public Personaje(String nombre, int salud) {
        this.nombre = nombre;
        this.salud = salud;
        this.equipo = new ArrayList<>();
    }


    public void equiparArma(Arma arma) {
        if (equipo.size() < 2) {
            equipo.add(arma);
            System.out.println(nombre + " ha equipado: " + arma.getNombre());
        } else {
            System.out.println("Error: " + nombre + " no puede cargar más de 2 armas al mismo tiempo.");
        }
    }

    public void mostrarEstado() {
        System.out.println("\n--- ESTADO DEL CAZADOR ---");
        System.out.println("Nombre: " + nombre + " | Salud: " + salud);
        System.out.print("Armas actuales: ");
        for (Arma a : equipo) System.out.print("[" + a.getNombre() + "] ");
        System.out.println("\n--------------------------");
    }
}