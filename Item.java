public class Item{

    private String name;
    private String id;
    private int price;

    public item(name,id,price){
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public double centsToDollar(){
        return price/100.0;
    }
}