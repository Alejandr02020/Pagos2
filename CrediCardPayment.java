public class CrediCardPayment extends Payment {

    public CrediCardPayment(double amount) {
        super(amount);
    }

    public void processPayment() {
        System.out.println("Procesando pago con tarjeta de crédito");
    }
}
