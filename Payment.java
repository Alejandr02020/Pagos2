abstract class Payment {
    public double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public void printReceipt(){
        System.out.println("Receipt for payment of $: " + amount);
    }

    public abstract void processPayment();
}
