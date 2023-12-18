import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menú");
            System.out.println("1. Mostrar los productos disponibles.");
            System.out.println("2. Comprar un producto.");
            System.out.println("3. Salir del programa.");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    Producto oProducto = new Producto(0, null, null, null, null, 0);
                    oProducto.VerProductosSupermarket();
                    break;
                case 2:
                    IngresarDatos oDatos = new IngresarDatos();
                    oDatos.TCmenu();
                default:
                    break;
            }
        } while (opcion != 3);

        sc.close();
    }

}
