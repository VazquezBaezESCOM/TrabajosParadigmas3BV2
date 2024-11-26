
public class CuentaBancaria {
    private String numerocuenta;
    private double saldo;

    public CuentaBancaria(String numerocuenta, double saldo) {
        this.numerocuenta = numerocuenta;
        this.saldo = saldo;
    }

    public void depositar(double cantidad) throws IllegalArgumentException {
        if (cantidad < 0) {
            throw new IllegalArgumentException("No se puede ingresar una cantidad negativa");
        }
        try{
            this.saldo += cantidad;
            System.out.println("Deposito exitoso, nueva cantidad: " + saldo     );
        } catch(IllegalArgumentException e) {
            System.out.println("Error al depositar: " + e.getMessage());
        }
    }

    public void retirar(double cantidad) throws IllegalArgumentException, IllegalStateException {
        if(cantidad < 0) {
            throw new IllegalArgumentException("No se puede retirar una cantidad negativa");
        }
        if(cantidad > this.saldo) {
            throw new IllegalArgumentException("Fondos insuficietes");
        }
        try{
            this.saldo -= cantidad;
            System.out.println("Retiro exitoso, nueva cantidad: " + saldo);
        }catch(IllegalArgumentException e) {
            System.out.println("Error al retirar: " + e.getMessage());
        }
    }

}
