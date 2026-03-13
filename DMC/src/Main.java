public class Main {
    public static void main(String[] args) {
        Personaje dante = new Personaje("Dante", 1000);

        Arma rebelion = new Arma("Rebellion", "Espada", 150);
        Arma ebonyIvory = new Arma("Ebony & Ivory", "Pistolas", 50);
        Arma cerberus = new Arma("Cerberus", "Nunchaku", 120);

        dante.equiparArma(rebelion);
        dante.equiparArma(ebonyIvory);

        dante.equiparArma(cerberus);

        Mision m1 = new Mision("Rescate en Red Grave City", 5);
        m1.iniciar(dante);
        
        System.out.println("\n¡Aparece un demonio!");
        rebelion.atacar();
    }
}