import java.util.Scanner;
public class Strings {
        public static void main(String[] agrs){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the String here: ");
            String user_input = sc.nextLine();

            System.out.println(user_input);
            System.out.println(user_input.length());
            System.out.println(user_input.charAt(0));
            System.out.println(user_input.toUpperCase());
            System.out.println(user_input.toLowerCase());

        }
    }

