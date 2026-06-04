
import java.util.*;
//class functions{
//    public static int calculateSm(int a, int b){
//        int sum = a + b;
//        return sum;
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        int sum = calculateSm(a,b);
//        System.out.println(sum);
//    }
//}

class functions{
    public static int calculateProduct(int a, int b){
        return a*b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculateProduct(a,b);
        System.out.println("product of two number is :" +" " + sum);
    }
}