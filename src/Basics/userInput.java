package Basics;

import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter your AGE:- ");
        int age = sc.nextInt();
        System.out.println("Your age is "+ age);*/

        // Sum of two numbers
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :- ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter second number :- ");
        int secondNumber = sc.nextInt();
        int result = firstNumber + secondNumber;
        System.out.println("The SUM is " + result);
        sc.close();*/

        // Sum of two numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 :- ");
        float num1 = sc.nextFloat();
        System.out.println("Enter number 2 :- ");
        int num2 = sc.nextInt();
        float result = (float)(num1 + num2);
        System.out.println("Sum is "+result );

        // Explicitly we need to change the numbers...

    }
}
