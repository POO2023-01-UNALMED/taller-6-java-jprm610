package vehiculos;

public class Vehiculo {
    private static int CantidadVehiculos;
    private String placa;
    private String nombre;
    private int precio;
    private int velocidadMaxima;
    private Fabricante fabricante;
    private int puertas;
    private int peso;
    private String traccion;

    public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso,
            String traccion, Fabricante fabricante) {
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion = traccion;
        this.fabricante = fabricante;
        CantidadVehiculos++;
        
        // Se suma 1 al contador del diccionario de la cantidad de vehículos por fabricante
        if (Fabricante.vehiculosPorFabricante.containsKey(fabricante)) {
            Fabricante.vehiculosPorFabricante.put(fabricante, Fabricante.vehiculosPorFabricante.get(fabricante) + 1);
        } else {
            Fabricante.vehiculosPorFabricante.put(fabricante, 1);
        }

        // Se suma 1 al contador del diccionario de la cantidad de vehículos por pais
        if (Pais.vehiculosPorPais.containsKey(fabricante.getPais())) {
            Pais.vehiculosPorPais.put(fabricante.getPais(), Pais.vehiculosPorPais.get(fabricante.getPais()) + 1);
        } else {
            Pais.vehiculosPorPais.put(fabricante.getPais(), 1);
        }
    }

    // METHODS
    public static String vehiculosPorTipo() {
        return  String.format("""
                Automoviles: %s
                Camionetas: %s
                Camiones: %s
                """, Automovil.getCantidadAutomoviles(), Camioneta.getCantidadCamionetas(), Camion.getCantidadCamiones());
    }

    // GETTERS AND SETTERS
    public static int getCantidadVehiculos() {
        return CantidadVehiculos;
    }

    public static void setCantidadVehiculos(int cantidadVehiculos) {
        CantidadVehiculos = cantidadVehiculos;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }
}
