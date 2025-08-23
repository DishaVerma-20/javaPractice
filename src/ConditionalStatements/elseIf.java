package ConditionalStatements;

import java.util.Scanner;
public class elseIf {
    public static void main(String[] args){
        // if.. else if.........else
        // if ke baad hmesha parenthesis lgao

        System.out.println("Where to Go?");
        System.out.print("Enter day :- ");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        if (day==1)
                System.out.println("Go to home");
        else if (day==2)
                System.out.println("Go to party");
        else if (day==3)
                System.out.println("Go to village");
        else
            System.out.println("Go to office");

    }
}
