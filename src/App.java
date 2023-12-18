import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int condicion = 0;
        int condition2 = 0;

        Scanner scanner = new Scanner(System.in);
        Empresa oempresa = new Empresa();

        System.out.println("\t* " + oempresa.getnombreEmpresa() + " *");
        System.out.println("\tDireccion Sucursal: ");
        System.out.println("    " + oempresa.getDireccionEmpresa());
        System.out.println("\t  Quito - Ecuador");
        System.out.println("\tRUC: " + oempresa.getRucEmpresa());
        
        do {
            System.out.println("En que caja desea cancelar su pedido (1 o 2)");
            int cajero = scanner.nextInt();

            switch (cajero) {
            case 1:
                System.out.println("Cajero: " + oempresa.Nombre1);
                System.out.println("Cedula: " + oempresa.Cedula1);
                condicion = 1;
                break;
            case 2:
                System.out.println("Cajero: " + oempresa.Nombre2);
                System.out.println("Cedula: " + oempresa.Cedula2);
                condicion = 1;
                break;
            default:
                System.out.println("Ingrese una opcion valida");
                break;
            }
        } while (condicion != 1);
        
        scanner.nextLine();
        do {
           
            System.out.println("Ingrese el numero de cedula o RUC");
            String identificacion = scanner.nextLine();
            if (identificacion.matches("[0-9]+") && identificacion.length() == 10){
                String cedula = identificacion;
                System.out.println("Cedula guardada correctamente");
                condition2 = 1;
            } else if (identificacion.matches("[0-9]+") && identificacion.length() == 13) {
                String RUC = identificacion;
                System.out.println("RUC guardado correctamente");
                condition2 = 1;
            }
            else{
                System.out.println("Ingrese un dato valido");
                condition2 = 0;
            }
        } while (condition2 != 1);
    }
}
