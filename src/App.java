import java.util.Scanner;

public class App {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        App app = new App();
        app.TCmenu();
    }

    // Datos ingresados para el programa
    public void TCmenu() {

        TarjetaCredito oCredito = new TarjetaCredito();
        oCredito.setBanco("Banco Pacífico");
        oCredito.setNombre("Karolina Salazar");
        oCredito.setNumeroTarjeta("1234567890023432");
        oCredito.setCVV("022");
        oCredito.setClave("1234ab");
        oCredito.setAñoExpedicion(2023);
        oCredito.setFechaExpiracion(4, 2027);
        oCredito.setSaldo(1000.0);

        while (true) {
            System.out.println("\nOpciones disponibles para Tarjeta de Crédito:");
            System.out.println("a. Cambio de contraseña");
            System.out.println("b. Realizar un pago");
            System.out.println("c. Presentación de la tarjeta");
            System.out.println("d. Salir");
            System.out.print("Seleccione una opción:");
            String opcion = sc.nextLine();
            switch (opcion.toLowerCase()) {
                case "a":
                    oCredito.cambiarClave("1234ab", "312abb", "312abb");
                    break;
                case "b":
                    oCredito.realizarPago(1100.0);
                    break;
                case "c":
                    oCredito.presentarCredenciales();
                    break;
                case "d":
                    System.out.println("¡Hasta luego!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }
    }
    // sc.close(scanner);
}
