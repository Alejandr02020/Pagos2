public class Pagos {
    public static void main(String[] args) {
        Payment credit = new CrediCardPayment(100);
        credit.processPayment();
        credit.printReceipt();
        
        Payment paypal = new PayPalPayment(1000);
    }
}