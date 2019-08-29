import java.io.File;

public class TestObjetos {

    public static void main(String[] args) {

        // crea una instancia llamada archivo, de la clase File (java.io.File)
        File archivo = new File("dummy-file.txt");
        // llama al metodo exists de la clase File, para el objeto archivo
        boolean existe = archivo.exists();
        System.out.println("Existe archivo " + archivo.getName() + ": " + existe);

        // crea una instancia llamada file, de la clase File (java.io.File)
        File file = new File("no-existe.txt");
        // llama al metodo exists de la clase File, para el objeto file
        boolean exists = file.exists();
        System.out.println("Existe archivo " + file.getName() + ": " + exists);

    }
}
