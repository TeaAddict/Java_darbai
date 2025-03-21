
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Name: ");
            String input = scanner.nextLine();
            System.out.println();

            if (input.isEmpty()) break;

            Item newItem = new Item(input);
            items.add(newItem);
        }

        for(Item item : items) {
            System.out.println(item);
        }
    }
}
