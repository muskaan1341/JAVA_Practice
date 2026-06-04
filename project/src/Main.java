import java.util.Scanner;

/*
class StudentPercentage{
    public static void main(String agrs[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of maths: ");
    int math = sc.nextInt();
    System.out.println("Enter the number of english: ");
    int english = sc.nextInt();
    System.out.println("Enter the number of science: ");
    int science = sc.nextInt();
    System.out.println("Enter the number of hindi: ");
    int hindi = sc.nextInt();
    int total = math + english + science + hindi;
    int percentage = (total* 100) /400;

    System.out.println("The total number: "+ total);
    System.out.println("The percentage: " + percentage);

        if (percentage >= 80 && percentage <= 90) {
            System.out.println("Grade A");
        }
        else if (percentage > 90) {
            System.out.println("Grade B");
        }
        else {
            System.out.println("Grade C");
        }

        sc.close();
    }
}
*/

class StudentPercentage{
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);

        String[] subjects = {
                "maths",
                "english",
                "science",
                "hindi"
        };

        int[] marks = new int[4];

        int i = 0;
        for(i = 0; i < subjects.length; i++) {
            System.out.println("Enter the marks of " + subjects[i] + ":");
            marks[i] = sc.nextInt();
        }
        int total = marks[0] + marks[1] + marks[2]+marks[3];
        int percentage = (total* 100) /400;

        System.out.println("The total number: "+ total);
        System.out.println("The percentage: " + percentage);


        for(i = 0; i < subjects.length; i++){
            System.out.println("Subject: " + subjects[i]);
            System.out.println("Marks: " + marks[i]);
        }
        if (percentage >= 80 && percentage <= 90) {
            System.out.println("Grade A");
        }
        else if (percentage > 90) {
            System.out.println("Grade B");
        }
        else {
            System.out.println("Grade C");
        }
        sc.close();
    }
}