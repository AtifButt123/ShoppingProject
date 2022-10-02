public class PaypalPayment implements IPaymentStrategy{
    private String emailId;
    private String password;

    public PaypalPayment(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public void executePayment(int amount) {
        System.out.println(amount + " Payment using paypal...");
    }
}
