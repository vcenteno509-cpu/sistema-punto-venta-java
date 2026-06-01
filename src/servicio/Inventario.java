package servicio;

import modelo.Producto;
import java.util.ArrayList;

public class Inventario {

    private ArrayList<Producto> productos =
            new ArrayList<Producto>();

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void mostrarProductos() {

        System.out.println("\n=== INVENTARIO ===");

        for (Producto p : productos) {

            System.out.println(
                    p.getId() + " - " +
                    p.getNombre() + " - CRC " +
                    p.getPrecio() + " - Stock: " +
                    p.getStock()
            );
        }
    }

    public Producto buscarProducto(int id) {

        for (Producto p : productos) {

            if (p.getId() == id) {
                return p;
            }
        }

        return null;
    }
    public int obtenerCantidadProductos() {
    return productos.size();
}
public boolean eliminarProducto(int id) {

    Producto producto = buscarProducto(id);

    if (producto != null) {
        productos.remove(producto);
        return true;
    }

    return false;
}
}