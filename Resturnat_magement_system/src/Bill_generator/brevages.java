package Bill_generator;

public class brevages extends menu_item {
    private int price;
    private String coke;
    private String coffe;
    private String pepsi;
    private int amount;

    public brevages(String name, double base_price) {
        super(name, base_price);
    }

    public void addpepsi(int amount){
        this.price = 20;
    }
    public void addcoke(int amount){
        this.price = 0;

    }
    public void coffe(){
        this.price = 50 ;
    }
    public void getbill(){
        System.out.println("total bill generated");

        System.out.println(this.price);

    }


    @Override
    public double calculatprice() {
        System.out.println(this.price);
        return 0;
    }
}
