import java.util.Scanner;

public class Empresa {
    Scanner scanner = new Scanner(System.in);
    PersonaJuridica personaJuridica = new PersonaJuridica();
    PersonaNatural personaNatural = new PersonaNatural();

    private String nombreEmpresa = "Supermaxi Quito";
    private String DireccionEmpresa = "Madrid y Av. 12 de Octubre";
    private String RucEmpresa = "1790016919001";

    public String getnombreEmpresa() {
        return this.nombreEmpresa;
    }

    public String getDireccionEmpresa() {
        return this.DireccionEmpresa;
    }

    public String getRucEmpresa() {
        return RucEmpresa;
    }

    // Datos Empleados

    public String Nombre1 = "Eduard Cachicuango";
    public String Cedula1 = "1717879012";

    public String Nombre2 = "Brisa Cando";
    public String Cedula2 = "1809097865";

    public void presentarEmpresa() {
        System.out.println("\t* " + getnombreEmpresa() + " *");
        System.out.println("\tDireccion Sucursal: ");
        System.out.println("    " + getDireccionEmpresa());
        System.out.println("\t  Quito - Ecuador");
        System.out.println("\tRUC: " + getRucEmpresa());
    }

    public void cajero() {

        int condicion = 0;

        do {
            System.out.println("En que caja desea cancelar su pedido (1 o 2)");
            int cajero = scanner.nextInt();

            switch (cajero) {
                case 1:
                    System.out.println("Cajero: " + Nombre1);
                    System.out.println("Cedula: " + Cedula1);
                    condicion = 1;
                    break;
                case 2:
                    System.out.println("Cajero: " + Nombre2);
                    System.out.println("Cedula: " + Cedula2);
                    condicion = 1;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        } while (condicion != 1);

    }

    public void identificacionCedula() {

        String ruc = personaNatural.getcedula();

        if (ruc.matches("[0-9]+") && ruc.length() == 10) {
            System.out.println("Cedula guardada correctamente");
        } else {
            System.out.println("Ingrese un dato valido");
        }

    }

    public void identificacionRuc() {

        String id = personaJuridica.getRUC();

        if (id.matches("[0-9]+") && id.length() == 13) {
            System.out.println("RUC guardado correctamente");
        } else {
            System.out.println("Ingrese un dato valido");
        }

    }

    public void Pago() {

        int condicion = 0;

        do {
            System.out.println("Elija su metodo de pago");
            System.out.println("1. Efectivo");
            System.out.println("2. Tarjeta");
            ;
            int respuesta = scanner.nextInt();

            switch (respuesta) {
                case 1:

                    condicion = 1;
                    break;
                case 2:

                    condicion = 1;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        } while (condicion != 1);

    }
}
