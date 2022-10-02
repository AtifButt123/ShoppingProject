public class Main {
    public static void main(String[] args) {

        Item laptop = new Item(1, "Laptop", 80000);
        Item mobile = new Item(2, "Mobile Phone", 25000);
        Item earPhone = new Item(3, "Ear phone", 4000);

        ShoppingCart shopping = new ShoppingCart();
        shopping.addItem(laptop);
        shopping.addItem(mobile);
        shopping.addItem(earPhone);

        shopping.executePayment(new PaypalPayment("iqbalatif921@gmail.com", "123"));
        shopping.executePayment(new CreditCardPayment("Atif Iqbal", "123456", "123", "20-12-2022"));

    }
}