import java.awt.Color;

public class TestColor {

    public static void main(String[] args) {

        // crea un objeto llamado verde, de la clase Color, enviandole el R,G,B
        Color verde = new Color(17, 194, 7);
        // ejecuta el metodo getBlue del objeto verde, que obtiene el valor azul del color
        int azul = verde.getBlue();
        System.out.println("Valor azul para el verde  " + azul);
        // obtiene a partir del color creado, un verde mas oscuro, llamando al metodo darker()
        Color verdeOscuro = verde.darker();
        System.out.println(verdeOscuro);

    }
}
