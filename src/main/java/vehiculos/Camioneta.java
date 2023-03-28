package vehiculos;

public class Camioneta extends Vehiculo {
    private static int cantidadCamionetas;
    private boolean volco;
    private int velocidadMaxima = 90;
    private String traccion = "4X4";
    
    public Camioneta(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso,
            String traccion, String fabricante, boolean volco) {
        super(placa, puertas, velocidadMaxima, nombre, precio, peso, traccion, fabricante);
        this.volco = volco;
        cantidadCamionetas++;
    }

    // GETTERS AND SETTERS
    public static int getCantidadCamionetas() {
        return cantidadCamionetas;
    }

    public static void setCantidadCamionetas(int cantidadCamionetas) {
        Camioneta.cantidadCamionetas = cantidadCamionetas;
    }

    public boolean isVolco() {
        return volco;
    }

    public void setVolco(boolean volco) {
        this.volco = volco;
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
