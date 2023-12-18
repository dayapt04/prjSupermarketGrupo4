import java.util.Scanner;

public class TarjetaCredito {
    private String nombreBanco;
    private String nombreUsuario;
    private String numeroTarjeta;

    private String cvv;
    private String clave;
    private String chipSeguridad;

    private Integer añoExpedicion;

    private Integer mesExpiracion;
    private Integer añoExpiracion;

    private Double saldo;

    // Métodos
    public String getBanco() {
        return nombreBanco.toUpperCase();
    }

    public void setBanco(String nombreBanco) {
        if (nombreBanco != null && nombreBanco.toLowerCase().contains("banco"))
            this.nombreBanco = nombreBanco.replaceAll("(?i)banco", "").trim();
        else
            this.nombreBanco = nombreBanco;
    }

    public String getNombre() {
        return nombreUsuario.toUpperCase();
    }

    public void setNombre(String nombreUsuario) {
        if (nombreUsuario.length() <= 0) {
            System.out.println("Nombre no válido.");
            return;
        } else
            this.nombreUsuario = nombreUsuario;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        if (numeroTarjeta.length() != 16) {
            System.out.println("Número de tarjeta no válido.");
            return;
        } else {
            StringBuilder modNumTC = new StringBuilder();
            for (int i = 0; i < numeroTarjeta.length(); i += 4) {
                String subNum = numeroTarjeta.substring(i, i + 4);
                modNumTC.append(subNum).append(" ");
            }
            this.numeroTarjeta = modNumTC.toString();
        }
    }

    public String getCVV() {
        return cvv;
    }

    public void setCVV(String cvv) {
        if (cvv.length() != 3) {
            System.out.println("El CVV ingresado no es válido.");
            return;
        } else
            this.cvv = cvv;
    }

    public String getClave() {
        return clave.toLowerCase();
    }

    public void setClave(String clave) {
        if (clave.length() != 6) {
            System.out.println("La clave no cumple con los 6 carácteres solicitados.");
            return;
        } else
            this.clave = clave;
    }

    public String getChipSeguridad() {
        return chipSeguridad;
    }

    public void setChipSeguridad(String chipSeguridad) {
        this.chipSeguridad = chipSeguridad;
    }

    public String getAñoExpedicion() {
        return Integer.toString(añoExpedicion);
    }

    public void setAñoExpedicion(Integer añoExpedicion) {
        if (añoExpedicion < 2000) {
            System.out.println("Año expedición no válido.");
            return;
        } else
            this.añoExpedicion = añoExpedicion;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double nuevoSaldo) {
        this.saldo = nuevoSaldo;
    }

    public String getFechaExpiracion() {
        StringBuilder fechaExpiracionBuilder = new StringBuilder();
        fechaExpiracionBuilder.append(Integer.toString(mesExpiracion)).append("/")
                .append(Integer.toString(añoExpiracion).substring(2));
        return fechaExpiracionBuilder.toString();
    }

    public void setFechaExpiracion(Integer mesExpiracion, Integer añoExpiracion) {
        if (mesExpiracion <= 0 || mesExpiracion > 12 || añoExpiracion < añoExpedicion) {
            System.out.println("Fecha de expiración no válida.");
            return;
        } else {
            this.mesExpiracion = mesExpiracion;
            this.añoExpiracion = añoExpiracion;
        }
    }

    public String cambiarClave(String claveAnterior, String claveNueva, String claveNuevaRees) {
        String observación = " ";

        if (!claveAnterior.equals(getClave()))
            observación += "\nLa clave anterior no es correcta.\n";

        if (!claveNueva.equals(claveNuevaRees))
            observación += "\nLas nuevas contraseñas no coinciden.";

        if (observación.equals(" ")) {
            setClave(claveNueva);
            System.out.println("Clave cambiada con éxito.");
        } else {
            System.out.println("Error." + observación);
        }
        return (observación.equals(" ") ? "OK" : observación);
    }

    public void realizarPago(Double monto) {
        System.out.println((monto <= 0) ? "No se puede pagar un importe inferior a cero."
                : (monto > saldo) ? "Error: Fondos insuficientes para la transacción."
                        : ("Transacción realizada con éxito. Nuevo saldo: " + (saldo -= monto)));
    }

    private static int espacio = 29;
    private static int ancho = 60;
    private static int alto = 13;

    public void presentarCredenciales() {
        if (getNombre() == null || getBanco() == null || getNumeroTarjeta() == null || getCVV() == null
                || getAñoExpedicion() == null || getFechaExpiracion() == null) {
            System.out.println("No se pueden presentar las credenciales debido a datos faltantes o inválidos.");
            return;
        }

        String linea = "|";
        String separador = " -----------------------------------------------------------";
        System.out.println(separador);

        System.out.println(linea + "                                                          " + linea);

        String formatoNombre = String.format("%-" + espacio + "s", getNombre());
        String formatoBanco = String.format("%-" + espacio + "s", getBanco());
        String formatoNumeroTarjeta = String.format("%-" + espacio + "s", getNumeroTarjeta());

        System.out.println(linea + "  " + " BANCO                                                  " + linea);
        System.out.println(linea + "   " + formatoBanco + "                          " + linea);
        System.out.println(linea + "                                                          " + linea);
        System.out.println(linea + "   |¯¯¯¯|                                                 " + linea);
        System.out.println(linea + "   |____|                                                 " + linea);
        System.out.println(linea + "                                                          " + linea);
        System.out
                .println(linea + "   " + formatoNumeroTarjeta + "                          " + linea);
        System.out
                .println(linea + "   MIEMBRO DESDE   " + getAñoExpedicion() + "      " + "VÁLIDO HASTA "
                        + getFechaExpiracion()
                        + "            " + linea);
        System.out.println(linea + "   " + formatoNombre + "                          " + linea);
        System.out.println(linea + "                                                          " + linea);
        System.out.println(separador);

        System.out.println();
        System.out.println("Parte posterior de la Tarjeta de Crédito: ");

        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                if (i == 0 || i == alto - 1)
                    System.out.print("-");
                else if (i == 3 && j != 0 && j != ancho - 1)
                    System.out.print("#");
                else if (i == 4 && j == ancho - "CVV:".length() - getCVV().length() - 1) {
                    System.out.print("CVV:" + getCVV());
                    j += ("CVV:".length() + getCVV().length()) - 1;
                } else if (j == 0 || j == ancho - 1)
                    System.out.print("|");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("\nTarjeta creada con éxito.");
    }
}
