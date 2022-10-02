import java.util.ArrayList;
import java.util.List;

public class ShoppingCart{

    List<Item>itemList;

    public ShoppingCart() {
        this.itemList = new ArrayList<>();
    }

    public void addItem(Item item){
        itemList.add(item);
    }

    public void removeItem(Item item){
        itemList.remove(item);
    }

    public int calculatePrice()
    {
        int sum = 0;
        for (Item item:itemList) {
            sum+=item.getPrice();
        }
        return sum;
    }

    public void executePayment(IPaymentStrategy paymentStrategy){
        int amount = calculatePrice();
        paymentStrategy.executePayment(amount);
    }

}
