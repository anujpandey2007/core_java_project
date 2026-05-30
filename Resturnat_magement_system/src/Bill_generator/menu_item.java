package Bill_generator;

public abstract class menu_item {
    private String name;
    private double Base_price;

    public menu_item(String name, double base_price) {
        this.name = name;
        this.Base_price = base_price;
    }

    public String getName() {
        return name;
    }

    public double getBase_price() {
        return Base_price;
    }
    public abstract double calculatprice();
}
