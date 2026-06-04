
//public class loops{
//    public static void main (String[] args){
//        for(int counter =0; counter < 4; counter = counter + 1 ){
//            System.out.println("Hello world!!");
//        }
//    }
//}


//for loop
//public class loops{
//    public static void main (String[] args){
////        counter++ --> counter = counter +1
//        for(int i =0; i <= 10; i ++ ){
//            System.out.print(i + " "); print in a one line
//        }
//    }
//}

// while loop
//public class loops{
//    public static void main (String[] args){
//        int counter = 0;
//        while(counter < 11){
//            System.out.println(counter);
//            counter = counter +1;
//        }
//    }
//}


//do-while loop
//public class loops{
//    public static void main (String[] args){
//        int counter = 0;
//        while(counter < 11){
//            System.out.println(counter);
//            counter = counter +1;
//        }
//    }
//}



import java.util.*;
//
//class loops{
//    public static void main(String[] args){
//      Scanner sc = new Scanner(System.in);
//       int n = sc.nextInt();
//       int sum =0;
//       for(int i=0; i<=n; i++){
//           sum = sum +i;
//       }
//        System.out.println(sum);
//    }
//}
//
//
//class Month {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for(int i=1; i<11; i++){
//            System.out.println(i*n);
//        }
//        sc.close();
//    }
//}


class While_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        do{
            System.out.print("Input a number : ");
            number = sc.nextInt();
            System.out.print("here is your number : ");
            System.out.println(number);
        } while(number >=0);
        System.out.println("The end");
    }
}