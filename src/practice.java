
import java.sql.SQLOutput;
import java.util.*;


//Nested Loops
//*****
//*****
//*****
//*****
//class practice{
//    public static void main(String[] args) {
//            int n = 4;
//            int m = 5;
//
//            for (int i=1; i<=n; i++){
//                for ( int j =1; j<=m; j++ ){
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
//    }
//}
//

//*****
//*   *
//*   *
//***** rectangle
//class practice{
//    public static void main(String[] args) {
//        int n = 4;
//        int m = 5;
//
//        for (int i=1; i<=n; i++){
//            for ( int j =1; j<=m; j++ ){
//                if (i==1 || j==1 || i==n || j==m){
//                System.out.print("*");
//            }else{
//                    System.out.print(" ");
//                }
//                }
//            System.out.println();
//        }
//    }
//}


// Half pyramid
//class practice{
//    public static void main(String[] args) {
//        int n =6;
//
//        for (int i=1; i<=n; i--){
//            for (int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}


//inverted half pyramid
//class practice{
//    public static void main(String[] args) {
//        int n =6;
//
//        for (int i=n; i>=1; i--){
//            for (int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}


//Inverted Half Pyramid ( Rotated by 180 deg)
class practice{
    public static void main(String[] args) {
        int n =5;

        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
//                sum = sum +i;
                System.out.print(j);
            }
            System.out.println();
        }
    }
}