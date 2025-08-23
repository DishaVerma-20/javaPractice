package ConditionalStatements;

import java.util.Scanner;
public class nestedIfElse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // bahut dimag laga hai mera is question mai.. lots of confusion pata nahi kese kar liya hai maine
        System.out.println("Find the maximum number from provided four numbers!");
        System.out.print("Enter number 1:- ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2:- ");
        int num2 = sc.nextInt();
        System.out.print("Enter number 3:- ");
        int num3 = sc.nextInt();
        System.out.print("Enter number 4:- ");
        int num4 = sc.nextInt();

        if (num1 > num2){
            System.out.println("Number 1 is greater than number 2");
            if (num1 > num3){
                System.out.println("Number 1 is also greater than number 3");
                if (num1 > num4){
                    System.out.println("Number 1 is also greater than number 4");
                    System.out.println("Number 1 is largest!");
                } else{
                    System.out.println("Number 4 is greater than number 1");
                    if (num4 > num3){
                        System.out.println("Number 4 is largest");
                    } else {
                        System.out.println("Number 3 is largest");
                    }
                }
            }
        } else {
            System.out.println("Number 2 is greater than number 1");
            if (num2 > num3) {
                System.out.println("Number 2 is also greater than number 3");
                if (num2 > num4) {
                    System.out.println("Number 2 is also greater than number 4");
                    System.out.println("Number 2 is largest");
                } else{
                    System.out.println("Number 4 is greater than number 2");
                    System.out.println("Number 4 is also greater than number 1 automatically");
                    if (num4 > num3) {
                        System.out.println("Number 4 is greater than number 3");
                        System.out.println("Number 4 is largest");
                    } else {
                        System.out.println("Number 3 is greater than number 4");
                        System.out.println("Number 3 is largest");
                    }
                }
            }
        }
    }
}
