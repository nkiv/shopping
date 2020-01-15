import java.util.*;

public class OnlineStore{

    public static void main(String[]args){
        double totalCost = 0;

        Customer customer = new Customer("Bill", "billy@gmail.com");

        Item[] items = new Item[10];

        items[0] = new Item("Orange", "505", 620);
        items[1] = new Item("Apple", "725", 730);
        items[2] = new Item("Banana", "830", 657);
        items[3] = new Item("Chips", "907", 540);
        items[4] = new Item("Milk", "432", 330);
        items[5] = new Item("Soda", "210", 540);
        items[6] = new Item("Lettuce", "123", 4.32);
        items[7] = new Item("Candy", "435", 675);
        items[8] = new Item("Turkey", "980", 975);
        items[9] = new Item("", "", 0);

        for (int i = 0; i < 10; i++) {
            if (items[i].getCents() >= 100) {
                totalCost += items[i].centsToDollar();
            } else {
                totalCost += (items[i].getCents());
            }  
        }
        totalCost *= 1.08;

        String[] order = new String[10];
        for (int j = 0; j < 10; j++) {
            order[j] = items[j].orderName();
        }

        double[] cost = new double[10];
        for (int n = 0; n < 10; n++) {
            if (items[n].getCents() > 100) {
                cost[n] = items[n].centsToDollar();
            } else {
                cost[n] = items[n].getCents();
            }
        }

        String[] sku = new String[10];
        for (int k = 0; k < 10; k++) {
            sku[k] = items[k].skuName();
        }

        
        System.out.println("\n" + customer.getName());
        System.out.println(customer.getEmail());

        System.out.println("Order: " + Arrays.toString(order));
        System.out.println("Item: " + Arrays.toString(cost));
        System.out.println("SKU: " + Arrays.toString(sku));

        System.out.println("Total Cost: " + totalCost);
    }
}