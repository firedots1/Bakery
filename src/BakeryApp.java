import java.util.ArrayList;
import java.util.Scanner;

public class BakeryApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        BakeryStore store = new BakeryStore();
        System.out.println("Welcome to the Brookley's Better Bakery Store App! \n The Selection of the product contains peanut, gluten, soy and dairy");
        System.out.println("To Search for foods that you can eat, please enter the name of the diet restriction or q to quit ");
        System.out.println("To See a list of all our items, please type \"all\". \n ");
        input = sc.nextLine();

        ArrayList<String> goods = new ArrayList<>();

        goods = store.searchStore("All");
        if (input.equalsIgnoreCase("All")) {

            System.out.println("Here is all our products: ");
            for (String items : goods) ;
            System.out.println(goods);
        } else {
            for (String item : goods) {
                if (item.contains(input)){
                    System.out.println(item);
                System.out.println();}
            }
        }
    }
}