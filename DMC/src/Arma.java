public class Arma {
    private String nombre;
    private String tipo; // Espada o Arma de fuego
    private int dañoBase;

    public Arma(String nombre, String tipo, int dañoBase) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.dañoBase = dañoBase;
    }

    public void atacar() {
        System.out.println("Atacando con " + nombre + " causando " + dañoBase + " de daño.");
    }

    public String getNombre() { return nombre; }
}