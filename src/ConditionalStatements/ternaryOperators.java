package ConditionalStatements;

import java.util.Scanner;

public class ternaryOperators {
    public static void main(String[] args){
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Find maximum of two numbers!");
        System.out.println("Enter first number:- ");
        int a = sc.nextInt();
        System.out.println("Enter second number:- ");
        int b = sc.nextInt();

        int max = 0;
        max= a>b ? a : b;
        System.out.println("Maximum number is "+ max);*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Find maximum of three numbers:- ");
        System.out.print("Enter first number:- ");
        int a = sc.nextInt();
        System.out.print("Enter second number:- ");
        int b = sc.nextInt();
        System.out.print("Enter third number:- ");
        int c = sc.nextInt();

        int max;
        // nested way ma use kara haiii
        max = a>b ? a>c ? a:c : b>c ? b:c;
        System.out.println("Maximum number is "+ max);
    }

}
