package Bill_generator;

public class burger extends menu_item{
    private int price;
    private boolean veg;
    private int extracheeseprice = 20;
    private int extra_aloo_tikki_price = 30;
    private int backpackprice = 20;

    public burger(String name, boolean veg) {
        super(name ,0);
        this.veg = veg;
        this.price = veg ? 79 : 99;
    }

    public void Extra_aloo_tikki() {
        this.price += extra_aloo_tikki_price;
    }

    public void Extracheese() {
        this.price += extracheeseprice;
    }
    public void takeaway(){
        this.price += backpackprice;
    }

    @Override
    public double calculatprice() {
        return this.price;
    }
}
