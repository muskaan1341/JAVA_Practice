import java.util.Scanner;

public class guess_the_number {
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);

        int Mynumber = (int)(Math.random()*100);
        int number = 0;

        do{
            System.out.println("Enter the number between 1 to 100: ");
            number = sc.nextInt();

            if(number == Mynumber){
                System.out.println("Wohoo! you win.");
                break;
            }
            else if(number < Mynumber){
                System.out.println("Number is too small");
            }
            else{
                System.out.println("Number is too big");
            }
        } while(number >= 0);
        System.out.println("My number was: " + Mynumber);
    }
    }
