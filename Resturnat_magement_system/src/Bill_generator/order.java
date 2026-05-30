package Bill_generator;

import java.util.ArrayList;
import java.util.List;

public class order extends menu_item {
    private double order_id;
    private List<menu_item> items;

    public order(String name) {
        super(name, 0.0);
        this.items = new ArrayList<>();
        this.order_id = Math.random() * 10000;
    }

    public void add_item(menu_item item) {
        this.items.add(item);
    }

    @Override
    public double calculatprice() {
        double total = getBase_price();
        for (menu_item item : items) {
            total += item.calculatprice();
        }
        return total;
    }

    public void display_bill() {
        System.out.println("==================================");
        System.out.println("         RESTAURANT BILL          ");
        System.out.println("==================================");
        System.out.println("Order ID: " + (int)order_id);
        System.out.println("Order Name: " + getName());
        System.out.println("----------------------------------");
        for (menu_item item : items) {
            System.out.printf("%-20s: Rs. %.2f\n", item.getName(), item.calculatprice());
        }
        System.out.println("----------------------------------");
        System.out.printf("Total Amount        : Rs. %.2f\n", calculatprice());
        System.out.println("==================================");
    }
}
