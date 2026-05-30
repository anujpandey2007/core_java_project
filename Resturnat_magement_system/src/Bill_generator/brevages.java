package Bill_generator;

public class brevages extends menu_item {
    private int price;
    private String coke;
    private String coffe;
    private String pepsi;
    private int amount;

    public brevages(String name) {
        super(name, 0.0);
    }

    public void addpepsi(int amount){
        this.price = 20 * amount;
    }
    public void addcoke(int amount){
        this.price = 30 * amount;
    }
    public void coffe(int amount){
        this.price = 50 * amount;
    }
    public void getbill(){
        System.out.println("total bill generated");
        System.out.println(this.price);
    }

    @Override
    public double calculatprice() {
        return this.price;
    }
}
