package Bill_generator;

public class burger extends menu_item {
    private int price;
    private boolean veg;
    private int extracheeseprice = 20;
    private int extra_aloo_tikki_price = 30;
    private int backpackprice = 20;

    public burger(String name, double base_price, boolean veg) {
        super(name, base_price);
        this.veg = veg;
        if(this.veg){
            this.price=79;
        }else{
            this.price= 99;
        }
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
        System.out.println(this.price);
        return 0;
    }
}
