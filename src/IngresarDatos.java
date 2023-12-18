import java.util.Scanner;

public class IngresarDatos {
    Scanner sc = new Scanner(System.in);

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

        String opcion3;
        int opcionSalida = 0;
        do {
            System.out.println("\nOpciones disponibles para Tarjeta de Crédito:");
            System.out.println("a. Cambio de contraseña");
            System.out.println("b. Realizar un pago");
            System.out.println("c. Presentación de la tarjeta");
            System.out.println("d. Regresar al menú principal");
            System.out.print("Seleccione una opción:");
            opcion3 = sc.nextLine();
            switch (opcion3.toLowerCase()) {
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
                    System.out.println("Regresando menú principal...");
                    opcionSalida = 1;
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
                    break;
            }
        } while (opcionSalida != 1);
    }

    public void DatosEfectivo() {
        MetodoPago metodoPago = new MetodoPago();
        metodoPago.setPagoEfectivo(1000.00);
        metodoPago.actualizarSaldo();
        metodoPago.realizarPagoEfectivo(100);
    }
}
