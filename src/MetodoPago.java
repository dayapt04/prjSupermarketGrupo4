public class MetodoPago {
        private double PagoEfectivo;
        private double saldo;
    
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
        public double getSaldo() {
            return saldo;
        }
        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }
        public void realizarPago(double monto) {
            if (monto <= 0) {
                System.out.println("No se puede pagar un importe inferior a cero.");
            } else if (monto > saldo) {
                System.out.println("Error: Fondos insuficientes para la transacción.");
            } else {
                saldo -= monto;
                System.out.println("Transacción realizada con éxito. Saldo restante: " + saldo);
            }
        }
        public void actualizarSaldo() {
            saldo = PagoEfectivo;
        }
    }

