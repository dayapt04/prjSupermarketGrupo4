import java.util.Scanner;

public class MetodoPago {
    // Método pago en Efectivo

    private Double PagoEfectivo;
    private Double saldoEfectivo;

    public double getPagoEfectivo() {
        return PagoEfectivo;
    }

    public void setPagoEfectivo(double pagoEfectivo) {
        if (pagoEfectivo >= 0) {
            PagoEfectivo = pagoEfectivo;
        } else {
            System.out.println("Error: El monto en efectivo no puede ser negativo.");
        }
    }

    public double getSaldoEfectivo() {
        return saldoEfectivo;
    }

    public void setSaldo(double saldoEfectivo) {
        this.saldoEfectivo = saldoEfectivo;
    }

    public void realizarPagoEfectivo(double monto) {
        if (monto <= 0) {
            System.out.println("No se puede pagar un importe inferior a cero.");
        } else if (monto > saldoEfectivo) {
            System.out.println("Error: Fondos insuficientes para la transacción.");
        } else {
            saldoEfectivo -= monto;
            System.out.println("Transacción realizada con éxito. Saldo restante: " + saldoEfectivo);
        }
    }

    public void actualizarSaldo() {
        saldoEfectivo = PagoEfectivo;
    }

    public void DatosEfectivo() {
        MetodoPago metodoPago = new MetodoPago();
        metodoPago.setPagoEfectivo(1000.00);
        metodoPago.actualizarSaldo();
        metodoPago.realizarPagoEfectivo(100);
    }

    // Método pago de Tarjeta de Crédito
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
                    oCredito.realizarPago(100.0);
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
}
