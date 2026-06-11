import java.util.*;

//class Calculator0 {
//    public static void main( String[] args ) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter the first number: ");
//        int a = sc.nextInt();
//        System.out.print("Enter the second number: ");
//        int b = sc.nextInt();
//
//        System.out.println("Addition : " + add(a, b));
//        System.out.println("Substraction:" + subtract(a,b));
//        for (String s : Arrays.asList("Multiplication: " + multiply(a, b), "Division: " + divide(a, b))) {
//            System.out.println(s);
//        }
//    }
//    public static int add(int a, int b){
//        return a+b;
//    }
//    public static int subtract(int a, int b){
//        return a-b;
//    }
//    public static int multiply(int a, int b){
//        return a*b;
//    }
//    public static int divide(int a, int b){
//        return a/b;
//    }
//
//}


// user choose the operator

class calculator1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the operator(+,-,*,/,%) :  ");
        char operator = sc.next().charAt(0);
        System.out.print("Enter the num2: ");
        int num2 = sc.nextInt();

        switch(operator){
            case '+' :
                System.out.println( "Addition: " + add(num1,num2));
                break;
            case '-' :
                System.out.println( "Subtraction: " + subtract(num1,num2));
                break;
            case '*' :
                System.out.println( "Multiplication: " + multiply(num1,num2));
                break;
            case '/' :
                System.out.println( "Division: " + divide(num1,num2));
                break;
        }
        sc.close();
    }
    public static int add(int a, int b){
        return a+b;
    }
    public static int subtract(int a, int b){
        return a-b;
    }
    public static int multiply(int a, int b){
        return a*b;
    }
    public static int divide(int a, int b){
        return a/b;
    }

}



// Using If-else conditions


class calculator2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num1: ");
        int a = sc.nextInt();
        System.out.print("Enter the operator(+,-,*,/,%) :  ");
        char operator = sc.next().charAt(0);
        System.out.print("Enter the num2: ");
        int b = sc.nextInt();

        if (operator == '+'){
            System.out.print("Addition : " + add(a,b));
        }
        else if (operator == '-'){
            System.out.print("Substraction : " + subtract(a,b));
        }
        else if (operator == '*'){
            System.out.print("Multiplication : " + multiply(a,b));
        }
        else if (operator == '/'){
            System.out.print("Division : " + divide(a,b));
        }
        else{
            System.out.print("Invalid operator");
        }

    }
    public static int add(int a, int b){
        return a+b;
    }
    public static int subtract(int a, int b){
        return a-b;
    }
    public static int multiply(int a, int b){
        return a*b;
    }
    public static int divide(int a, int b){
        return a/b;
    }

}
