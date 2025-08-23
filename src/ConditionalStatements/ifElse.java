package ConditionalStatements;

import java.util.Scanner;
public class ifElse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Identify whether you can Vote or not??");
        System.out.print("Enter your current age :- ");
        int age = sc.nextInt();
        if (age >= 18)
            System.out.println("You are eligible to Vote.");
        else
            System.out.println("You aren't eligible to Vote,");

        // Java mai hame block of code bnana pdta hai for more than one line...
    }
}
