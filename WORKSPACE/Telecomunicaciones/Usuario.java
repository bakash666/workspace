 import java.util.UUID;

    public class Usuario {

        public UUID id;
        public String nombre = "Pedro Perez";
        public Object email = "usuario@gmail.com";
        public int telefono = 3152002020;

                //Constructor vacio
    public Usuario () {

    }
    public void mostrardatos (){
        System.out.println(" - - datos - -\n" +
                "- ID: " + this.id ){


    }
}