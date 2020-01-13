import java.util.*;

public class OnlineStore{

    public static void main(String[]args){
        double totalCost = 0;

        Customer customer = new Customer("Bill", "billy@gmail.com");

        Item item1 = new Item(name, id, price);
        Item item2 = new Item(name, id, price);
        Item item3 = new Item(name, id, price);
        Item item4 = new Item(name, id, price);
        Item item5 = new Item(name, id, price);
        Item item6 = new Item(name, id, price);
        Item item7 = new Item(name, id, price);
        Item item8 = new Item(name, id, price);
        Item item9 = new Item(name, id, price);
        Item item10 = new Item(name, id, price);

        totalCost+= price;
        
        String[] order = [item1.orderName(),
                        item2.orderName(),
                        item3.orderName(),
                        item4.orderName(),
                        item5.orderName(),
                        item6.orderName(),
                        item7.orderName(),
                        item8.orderName(),
                        item9.orderName(),
                        item10.orderName()];

        double[] cost = [];

        String[] sku = [];
        
        System.out.println("\n" + customer.getName());
        System.out.println(customer.getEmail());

        System.out.println("Order: " + Arrays.toString(order));
        System.out.println("Item: " + Arrays.toString(cost));
        System.out.println("SKU: " + Arrays.toString(sku));

        System.out.println("Total Cost: " + (totalCost/=100.0));
    }
}