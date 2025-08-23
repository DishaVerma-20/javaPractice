package string;
import java.util.Scanner;

public class learnString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your First name:- ");
        String firstName = sc.nextLine();
// puri line ko as a input treat kara jata haiii

        System.out.println("Enter your Last name:- ");
        String lastName = sc.nextLine();

        System.out.println("Your full name is "+ firstName+" "+ lastName +".");
        // String name= sc.next();
        // iss vale method mai puri line ko input nahi consider kara jata..
        // srrff space se pehle vala strating ka ek word hoga input yaha pr

    }
}
