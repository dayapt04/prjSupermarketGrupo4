import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Empresa oempresa = new Empresa();
        System.out.println();
        oempresa.presentarEmpresa();

        int opcion;
        do {
            System.out.println("\nMenú Principal");
            System.out.println("1. Mostrar los productos disponibles.");
            System.out.println("2. Comprar un producto.");
            System.out.println("3. Salir del programa.");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    Producto oProducto = new Producto(0, null, null, null, null, 0);
                    oProducto.VerProductosSupermarket();
                    break;
                case 2:
                    System.out.println();
                    oempresa.cajero();
                    int iden;

                    do {
                        System.out.println("Elija su metodo de identificacion:\n1. Cedula\n2. RUC");
                        iden = sc.nextInt();
                        switch (iden) {
                            case 1:
                                oempresa.identificacionCedula();
                                iden = 3;
                                break;
                            case 2:
                                oempresa.identificacionRuc();
                                iden = 3;
                                break;

                            default:
                                System.out.println("Opción no válida.\nVuelva a intentarlo.");
                                break;
                        }
                    } while (iden != 3);

                    System.out.println();
                    System.out.println("Elija su metodo de pago");
                    System.out.println("1. Efectivo");
                    System.out.println("2. Tarjeta");
                    System.out.println("3. Regresar menú principal");
                    System.out.print("Ingresar opcion: ");
                    int opcion2 = sc.nextInt();

                    IngresarDatos oDatos = new IngresarDatos();

                    do {
                        switch (opcion2) {
                            case 1:
                                System.out.println();
                                oDatos.DatosEfectivo();
                                opcion2 = 3;
                                break;
                            case 2:
                                System.out.println();
                                oDatos.TCmenu();
                                opcion2 = 3;
                                break;
                            case 3:
                                System.out.println("Regresando al menú principal..");
                                break;
                            default:
                                System.out.println("Opción no válida.");
                                break;
                        }
                    } while (opcion2 != 3);
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion != 3);

        sc.close();
    }

}
