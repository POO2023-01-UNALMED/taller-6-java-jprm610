package vehiculos;

public class Automovil extends Vehiculo {
    private static int cantidadAutomoviles;
    private int puestos;

    public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
        super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
        this.puestos = puestos;
        cantidadAutomoviles++;
    }

    // GETTERS AND SETTERS
    public static int getCantidadAutomoviles() {
        return cantidadAutomoviles;
    }

    public static void setCantidadAutomoviles(int cantidadAutomoviles) {
        Automovil.cantidadAutomoviles = cantidadAutomoviles;
    }

    public int getPuestos() {
        return puestos;
    }

    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }
}
