import java.util.Scanner;

public class Student_grade {
    public static void main (String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students");
        System.out.print("Maths: ");
        int maths = sc.nextInt();
        System.out.print("English: ");
        int English = sc.nextInt();
        System.out.print("Computer: ");
        int Computer = sc.nextInt();

        int Total = maths + English + Computer;
        System.out.println("Total marks: " + Total);

        int percentage = Total*100/300;
        System.out.println("Percentage: " + percentage);

        if ( percentage >= 80){
            System.out.println("Grade A");
        }
        else if( percentage >= 60){
            System.out.println("Grade B");
        }
        else if( percentage >= 50){
            System.out.println("Grade C");
        }
        else{
            System.out.println("Grade D");
        }
        sc.close();
    }
}
