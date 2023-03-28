package vehiculos;

import java.util.HashMap;
import java.util.Map;

public class Fabricante {
    private String nombre;
    private Pais pais;
    static Map<Fabricante, Integer> vehiculosPorFabricante = new HashMap<>();

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    // METHODS
    public static Fabricante fabricaMayorVentas() {
        int max = 0;
        Fabricante fabricanteMasVendedor = null;

        for (Fabricante fabricante : vehiculosPorFabricante.keySet()) {
            if (vehiculosPorFabricante.get(fabricante) > max) {
                max = vehiculosPorFabricante.get(fabricante);
                fabricanteMasVendedor = fabricante;
            }
        }

        return fabricanteMasVendedor;
    }

    // GETTERS AND SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
