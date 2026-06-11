import java.util.*;
//import java.util.ArrayList;
//class r{
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        ArrayList<Integer> marks = new ArrayList<>();
//
//        System.out.print("Enter the num1: ");
//        int num1 = sc.nextInt();
//        System.out.print("Enter the num2: ");
//        int num2 = sc.nextInt();
//        System.out.print("Enter the num3: ");
//        int num3 = sc.nextInt();
//        System.out.print("Enter the num4: ");
//        int num4 = sc.nextInt();
//        System.out.print("Enter the num5: ");
//        int num5 = sc.nextInt();
//
//        int total = num1 + num2 + num3 + num4 + num5;
//        marks.add(num1);
//        marks.add(num2);
//        marks.add(num3);
//        marks.add(num4);
//        marks.add(num5);
//
//        System.out.println(marks);
//        System.out.println("Total marks: " + total);
//
//        int count = 0;
//        for ( int num : marks) {
//        if (num % 2 == 0) {
//            System.out.println(num + "  is even number");
//            count++;
//        } else {
//            System.out.println(num + "  is odd number");
//        }
//    }
//        System.out.println(count);
//
//    }
class Node{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> name = new ArrayList<>();

        System.out.print("Enter the student name1: ");
        String Name1 = sc.nextLine();
        System.out.print("Enter the student name2: ");
        String Name2 = sc.nextLine();
        System.out.print("Enter the student name3: ");
        String Name3 = sc.nextLine();

        name.add(Name1);
        name.add(Name2);
        name.add(Name3);
        System.out.println(name);
    }
}