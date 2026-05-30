package Bill_generator;

public class order extends menu_item {
    private double order_id;

    public order(String name, double base_price) {
        super(name, base_price);
    }

    @Override
    public double calculatprice() {
        return 0;
    }
}
