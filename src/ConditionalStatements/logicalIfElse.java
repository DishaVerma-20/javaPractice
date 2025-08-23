package ConditionalStatements;

import java.util.Scanner;

public class logicalIfElse {
    public static void main(String[] args) {
        // office timing using nested if else
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time according to 24 hour format:- ");
        int time = sc.nextInt();

        /*if (time>=10){
            if (time<=20){
                System.out.println("Office is Open!");
            } else{
                System.out.println("Office is Closed!");
            }
        }
        else{
            System.out.println("Office is Closed!");
        }*/
        // here we have used nested loops.. we can also use logical operators here..
        if (time >= 10 && time <= 20){
            System.out.println("Office is open!");
        } else{
            System.out.println("Office is closed!");
        }
    }
}
