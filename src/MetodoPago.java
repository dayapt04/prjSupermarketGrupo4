public class MetodoPago {
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
}
