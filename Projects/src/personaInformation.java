import java.util.Scanner;

public class personaInformation {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the personal information");
        System.out.print("Enter the name : ");
        String name = sc.nextLine();
        System.out.print("Enter the surname: ");
        String surname = sc.nextLine();
        System.out.print("Enter the email: ");
        String email = sc.nextLine();
        System.out.print("Enter the phone number: ");
        String phone = sc.nextLine();
        System.out.print("Enter the address: ");
        String address = sc.nextLine();

        System.out.println("Name : " + name);
        System.out.println("Surname : " + surname);
        System.out.println("Email : " + email);
        System.out.println("Phone : " + phone);
        System.out.println("Address : " + address);
    }
}
