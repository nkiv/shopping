import java.util.Scanner;

public class OnlineStore{

    public static void main(Sting[]args){
        public Item[] order = new Item[10];

        Scanner scan = new Scanner(System.in);
        
        for(int i = 0; i<10; i++){
            System.out.println("Enter Name:");
            String name = scan.nextLine();
            System.out.println("Enter id:")
            String id = scan.nextLine();
            System.out.println("Enter Price in Cents:")
            int price = scan.nextInt();
            
            Item[i] = Item(name, id, price)
        }

    }
}