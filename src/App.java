import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        MetodoPago metodoPago = new MetodoPago();
        double montoIngresado = 100.0; 
        metodoPago.setPagoEfectivo(montoIngresado); 
        metodoPago.actualizarSaldo();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el monto a restar: ");
        double montoARestar = scanner.nextDouble();
        metodoPago.realizarPago(montoARestar);
    }
}
