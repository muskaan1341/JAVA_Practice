import java.util.Scanner;

class arithemeticOperators {
    public static void main(String[] agrs){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer a: ");
        int a = sc.nextInt();
        System.out.print("Enter the integer b: ");
        int b = sc.nextInt();

        System.out.print("Addition of the integers:  ");
        System.out.println(a+b);
        System.out.print("Subtraction of the integers:  ");
        System.out.println(a-b);
        System.out.print("Multiplication of the integers:  ");
        System.out.println(a*b);
        System.out.print("Division of the integers:  ");
        System.out.println(a/b);
    }
}
