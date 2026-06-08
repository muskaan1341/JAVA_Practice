
import java.util.Scanner;

// With normal version
//public class RestaurantMenu {
//    public static void main(String[] agrs){
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("'Menu - pizza " +
//                "Burger " +
//                "Sandwich'");
//        System.out.print("Enter the menu of restaurants you want to eat: ");
//
//        String menu = sc.nextLine();
//
//        if (menu.equals("pizza")){
//            System.out.println("You have selected pizza!");
//            System.out.println("Price of pizza is 400");
//        }
//        else if (menu.equals("burger")){
//            System.out.println("You have selected burger!");
//            System.out.println("Price of burger is 200");
//        }
//        else if (menu.equals("sandwich")){
//            System.out.println("You have selected sandwich!");
//            System.out.println("Price of sandwich is 100");
//        }
//    }
//}


// with switch case


public class RestaurantMenu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("Pizza");
        System.out.println("Burger");
        System.out.println("Sandwich");

        System.out.print("Enter your choice: ");
        String menu = sc.nextLine();

        switch (menu.toLowerCase()) {

            case "pizza":
                System.out.println("You have selected Pizza!");
                System.out.println("Price of Pizza is 400");
                break;

            case "burger":
                System.out.println("You have selected Burger!");
                System.out.println("Price of Burger is 200");
                break;

            case "sandwich":
                System.out.println("You have selected Sandwich!");
                System.out.println("Price of Sandwich is 100");
                break;

            default:
                System.out.println("Invalid menu item!");
        }

        sc.close();
    }
}