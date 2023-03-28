package vehiculos;

public class Automovil extends Vehiculo {
    private static int cantidadAutomoviles;
    private int puestos;
    private int puertas = 4;
    private int velocidadMaxima = 100;
    private String traccion = "FWD";
    
    public Automovil(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso,
            String traccion, String fabricante, int puestos) {
        super(placa, puertas, velocidadMaxima, nombre, precio, peso, traccion, fabricante);
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

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }
}
