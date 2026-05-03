import java.util.ArrayList;

public class Order {
   private int seatNumber;
   ArrayList<MenuItem> items;

    public Order(int seatNumber, ArrayList<MenuItem> items) {
        this.seatNumber = seatNumber;
        this.items = items;
    }
    public void addMenu(MenuItem menuItem) {
        items.add(menuItem);
    }
    public int calculateTotal() {
        int sum = 0;
        for (MenuItem menuitem : items) {
            sum += menuitem.getPrice();
        }
        return sum;
    }


}
