import java.sql.SQLOutput;
import java.util.*;

//class Conditions {
//    public static void main(String[] agrs) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("ENTER THE AGE: ");
//        int age = sc.nextInt();
//
//        if(age>18){
//            System.out.println("Adult");
//        } else{
//            System.out.println("Not Adult!!");
//        }
//    }
//}

//Check the Even odd
//class Conditions {
//    public static void main(String[] agrs) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("ENTER THE NUMBER: ");
//        int num = sc.nextInt();
//
//        if(num % 2 == 0){
//            System.out.println("Even");
//        } else{
//            System.out.println("Odd");
//        }
//    }
//}


// Check the number is equal or not
//class Conditions {
//    public static void main(String[] agrs) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("ENTER THE NUMBER: ");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        if(a==b){
//            System.out.println("Equal");
//        } else if (a>=b) {
//            System.out.println("A is greater");
//        } else{
//            System.out.println("B is greater");
//        }
//    }
//}

//Switch condition
//class Conditions {
//    public static void main(String[] agrs) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("ENTER THE NUMBER: ");
//        System.out.println("Enter the any one number 1,2 or 3: ");
//        int Button = sc.nextInt();

//        if(Button ==1){
//            System.out.println("Hello");
//        } else if (Button == 2) {
//            System.out.println("Namaste");
//        } else if (Button ==3 ){
//            System.out.println("Bonjour");
//        } else{
//            System.out.println(" Invalid Input");
//        }

//         switch (Button){
//            case 1: System.out.println("Hello");
//            break;
//            case 2: System.out.println("Namaste");
//            break;
//            case 3: System.out.println("Bonjour");
//            break;
//             default:
//                 System.out.println("Invalid Button");
//        }
//    }
//}



// Exercise 1

//class Calculator{
//    public static void main (String[] args){
//         Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the num 1: ");
//        int num1 = sc.nextInt();
//        System.out.println("Enter the num 2: ");
//        int num2 = sc.nextInt();
//        System.out.println("Enter the operator (+,-,*,/) : ");
//        char op = sc.next().charAt(0);
//
//        switch (op){
//            case '+': System.out.println("Result" + (num1 + num2));
//            break;
//            case '-': System.out.println("Result" + (num1-num2));
//            break;
//            case '*': System.out.println("Result" + (num1 * num2));
//            break;
//            case '/' :
//                if (num2!=0)
//                    System.out.println( "Result" + (num1/num2));
//                else
//                    System.out.println("Cannot divide by zero");
//            break;
//
//            default:
//                System.out.println("Invalid Operator");
//
//        }
//    }
//}

// Exercise 2
class month{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of the month: ");
        int number = sc.nextInt();
        switch (number){
            case 1: System.out.println("Jan");
            break;
            case 2: System.out.println("Feb");
            break;
            case 3: System.out.println("Mar");
            break;
            case 4 : System.out.println("Apr");
            break;
            case 5 : System.out.println("may");
            break;
            case 6: System.out.println("June");
            break;
            case 7: System.out.println("July");
            break;
            case 8: System.out.println("Aug");
            break;
            case 9: System.out.println("Sept");
            break;
            case 10 : System.out.println("Oct");
            break;
            case 11: System.out.println("Nov");
            break;
            case 12: System.out.println("Dec");
            break;
            default: System.out.println("Invalid Value");
        }
    }
}


//class Month {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        String[] months = {
//                "jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", "Dec"
//        };
//        System.out.println("Enter the number of the month: ");
//        int number = sc.nextInt();
//
//        if (number >=1 && number <= 12){
//            System.out.println(months[number-1]);
//        }else{
//            System.out.println("Invalid Value");
//        }
//        sc.close();
//    }
//}



