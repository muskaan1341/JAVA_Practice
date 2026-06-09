import java.util.Scanner;

public class MultiplicationTableGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number: ");

        int number = input.nextInt();
        int i = 1;
        while(i <=10){
            System.out.println(i * number);
            i++;
        }
    }
}

