import modelo.Producto;
import servicio.Inventario;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Inventario inventario = new Inventario();

        inventario.agregarProducto(
                new Producto(1, "Laptop", 350000, 5));

        inventario.agregarProducto(
                new Producto(2, "Mouse", 5000, 20));

        int opcion;

        do {

            System.out.println("\n===== PUNTO DE VENTA =====");
            System.out.println("1. Ver productos");
            System.out.println("2. Realizar venta");
            System.out.println("3. Agregar producto");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:

                    inventario.mostrarProductos();
                    break;

                case 2:

                    inventario.mostrarProductos();

                    System.out.print(
                            "Ingrese ID del producto: ");

                    int id = teclado.nextInt();

                    Producto producto =
                            inventario.buscarProducto(id);

                    if (producto != null) {

                        System.out.print(
                                "Cantidad: ");

                        int cantidad =
                                teclado.nextInt();

                        if (cantidad <= producto.getStock()) {

                            double total =
                                    cantidad *
                                    producto.getPrecio();

                            producto.setStock(
                                    producto.getStock()
                                            - cantidad);

                         System.out.println("\n======================");
                         System.out.println("       TICKET");
                         System.out.println("======================");
                         System.out.println("Producto: " +
                                 producto.getNombre());
                         System.out.println("Cantidad: " +
                                 cantidad);
                         System.out.println("Precio Unitario: CRC " +
                                 producto.getPrecio());
                         System.out.println("Total: CRC " +
                                 total);
                         System.out.println("======================");
                         System.out.println("Venta realizada");

                        } else {

                            System.out.println(
                                    "Stock insuficiente");
                        }

                    } else {

                        System.out.println(
                                "Producto no encontrado");
                    }

                    break;

                case 3:

                         teclado.nextLine();

                         System.out.print("Nombre: ");
                         String nombre =
                                teclado.nextLine();

                         System.out.print("Precio: ");
                         double precio =
                                teclado.nextDouble();

                         System.out.print("Stock: ");
                         int stock =
                                teclado.nextInt();

                         int nuevoId =
                                 inventario.obtenerCantidadProductos() + 1;

                         inventario.agregarProducto(
                                 new Producto(
                                      nuevoId,
                                      nombre,
                                      precio,
                                      stock
            )
    );

                         System.out.println(
                                 "Producto agregado correctamente."
    );

                    break;

                case 4:

                         inventario.mostrarProductos();

                        System.out.print(
                                 "Ingrese ID a eliminar: ");

                        int idEliminar =
                                 teclado.nextInt();

                        if (inventario.eliminarProducto(idEliminar)) {

                            System.out.println(
                                 "Producto eliminado correctamente."
        );

                         } else {

                            System.out.println(
                                 "Producto no encontrado."
        );
    }

                     break;

                case 5:

                    System.out.println(
                            "Gracias por usar el sistema");
                    break;

                default:

                    System.out.println(
                            "Opcion invalida");
            }

        } while (opcion != 5);

        teclado.close();
    }
}