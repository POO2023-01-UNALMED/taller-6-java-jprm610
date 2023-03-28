package vehiculos;

import java.util.HashMap;
import java.util.Map;

public class Pais {
    private String nombre;
    static Map<Pais, Integer> vehiculosPorPais = new HashMap<>();

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    // METHODS
    public static Pais paisMasVendedor() {
        int max = 0;
        Pais paisMasVendedor = null;

        for (Pais pais : vehiculosPorPais.keySet()) {
            if (vehiculosPorPais.get(pais) > max) {
                max = vehiculosPorPais.get(pais);
                paisMasVendedor = pais;
            }
        }
        
        return paisMasVendedor;
    }

    // GETTERS AND SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
