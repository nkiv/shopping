public class Item{

    private String name;
    private String id;
    private int price;

    public Item(String name,String id,int price){
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String orderName(){
        return name;
    }

    public String skuName(){
        return id;
    }
    
    public double centsToDollar(){
        return price/100.0;
    }
}