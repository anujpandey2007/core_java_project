package Bill_generator;

import java.awt.*;
import java.util.ArrayList;

public class pizza extends menu_item {

    private int price;
    private boolean veg;
    private int extracheeseprice = 80;
    private int extratopingprice = 50;
    private int bagpackprice = 20;

    public pizza(String name, double base_price, boolean veg) {
        super(name, base_price);
        this.veg = veg;
        if(this.veg){
            this.price = 300 ;
        }else {
            this.price = 400;
        }
   }

    public void addextracheese(){
        System.out.println("extra cheese added");
        this.price += extracheeseprice;


    }
    public void addextratoping(){
        System.out.println("extra toping added");
        this.price +=extratopingprice;


    }
    public void opttakeway(){
        System.out.println("opted takeaway");
        this.price += bagpackprice;

    }

    @Override
    public double calculatprice() {
        System.out.println(this.price);
        return 0;
    }
}
