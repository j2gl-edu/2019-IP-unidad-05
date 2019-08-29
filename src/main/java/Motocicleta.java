// clase Motocicleta
public class Motocicleta {

    // atributos
    String marca;
    String modelo;
    int cilindraje;
    double precio;
    String estado;
    String color;

    // acción que realiza la venta de la motocicleta, siempre que ésta esté disponible,
    // si está disponible se vende y cambia a vendida, devolviendo true.
    public boolean vender() {
        // equals permite la comparación de Strings.
        if (estado.equals("disponible")){
            estado = "vendido";
            return true;
        }
        return false;
    }

}
