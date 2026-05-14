import java.util.Scanner;

public class TiendaRPG {

    // Scanner global
    static Scanner entrada = new Scanner(System.in);

    // Matriz de la tienda
    static String[][] tienda = {
            { "Espada", "150", "10" },
            { "Pocion", "50", "20" },
            { "Armadura", "300", "5" }
    };

    // Inventario del jugador
    static int[] inventarioJugador = { 0, 0, 0 };

    // Dinero inicial
    static double dinero = 500;

    // Capacidad máxima del inventario
    static int capacidadMaxima = 10;

    public static void main(String[] args) {

        int opcion = 0;

        while (opcion != 5) {

            System.out.println("\n===== TIENDA RPG =====");
            System.out.println("1. Ver productos");
            System.out.println("2. Comprar producto");
            System.out.println("3. Vender producto");
            System.out.println("4. Ver inventario");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");

            try {

                opcion = entrada.nextInt();

                switch (opcion) {

                    case 1:
                        mostrarProductos();
                        break;

                    case 2:
                        comprarProducto();
                        break;

                    case 3:
                        venderProducto();
                        break;

                    case 4:
                        verInventario();
                        break;

                    case 5:
                        System.out.println("Saliendo del sistema...");
                        break;

                    default:
                        System.out.println("Opcion invalida.");

                }

            } catch (Exception e) {

                System.out.println("Error: Debe ingresar un numero.");
                entrada.nextLine();

            }

        }

    }

    // FUNCIONES

    public static void mostrarProductos() {

        // Ordena antes de mostrar
        ordenarProductos();

        System.out.println("\n===== PRODUCTOS DISPONIBLES =====");

        for (int i = 0; i < tienda.length; i++) {

            System.out.println(
                    (i + 1) + ". " +
                            tienda[i][0] +
                            " | Precio: " + tienda[i][1] +
                            " monedas | Stock: " + tienda[i][2]);

        }

    }

    public static void comprarProducto() {

    }

    public static void venderProducto() {

    }

    public static void verInventario() {

    }

    public static void ordenarProductos() {

        for (int i = 0; i < tienda.length - 1; i++) {

            for (int j = 0; j < tienda.length - 1 - i; j++) {

                // Convertimos el precio a entero para compararlo
                int precioActual = Integer.parseInt(tienda[j][1]);
                int precioSiguiente = Integer.parseInt(tienda[j + 1][1]);

                // Si el actual es mayor, intercambiamos filas
                if (precioActual > precioSiguiente) {

                    String[] temporal = tienda[j];
                    tienda[j] = tienda[j + 1];
                    tienda[j + 1] = temporal;

                }

            }

        }

    }

}