package Loops;

import java.util.Scanner;
public class forLoop {
    public static void main(String[] args){
        /*for (int i = 0; i<=100; i++){
            System.out.println("Hello World!");*/
            // Elements of JAVA Loops
            /*Initialization Expression
            Test Expression (Condition)
            Update Expression
            Body of Loop*/
            // Initialisation Expression srf 1 baar execute hoti haii


        /*for (int i=0; i<=5; i++){
            System.out.println(i);*/
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which you want table:- ");
        int n = sc.nextInt();
        for (int i = 1; i<=10; i++){
            System.out.println(n + " * " +i + " = "+n*i);*/


        System.out.println("Sum of n natural numbers");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till you want the sum of numbers:- ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i=1; i<=n; i++){
            sum = sum +i;
        }
        System.out.println(sum);
        int average = sum / n;
        System.out.println(average);
        // formula to find the sum is n(n+1)/2


        /* for (int i=0, sum=0; i<=10; i++, sum++)*/

        // scope ki dikkat ho sakti hai.. jo elements humne loop ke andar banaye hai vo srf vahi tak valid haii

        // initialisation aur updation mai we can write multiple expressions using commas aur
        // test condition mai we can use logical operators and realtional operators or shyd kuch aur bhi
        // i need to explore

        // multiples of any number ka sum print karna hai..
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;*/

        // even numbers ka sum
        for (int i=1; i<=n; i++){
            sum = sum + 2*i;
        }
        System.out.println(sum);

    }
}
