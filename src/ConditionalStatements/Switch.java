package ConditionalStatements;

import java.util.Scanner;
public class Switch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Identify the Day!");
        System.out.println("Enter the day number:- ");
        int day = sc.nextInt();
        switch(day){
            case 1:
                System.out.println("Today is Sunday");
                // break lagana pdega uss particular block of code se bahar niklne ke liye
                break;
            case 2:
                System.out.println("Today is Monday");
                break;
            case 3:
                System.out.println("Today is Tuesday");
                break;
            case 4:
                System.out.println("Today is Wednesday");
                break;
            case 5:
                System.out.println("Today is Thursday");
                break;
                // shift + tab piche jane ke liye
            case 6:
                System.out.println("Today is Friday");
                break;
                // tab for aagey jane ke liye
            case 7:
            System.out.println("Today is Saturday");
                break;
            default:
                // its like else block
                System.out.println("Invalid day!");
                break;
        }
        // agar 2 cases ma same chje execute karni hai then..
        /*case 1: case 2:
            System.out.print("heHeeheeee!!");
            break;*/
    }
}
