package Loops;

import java.util.Scanner;
public class whileLoop {
    public static void main(String[] args){
        /* we uses while loop jab hume nahi pata hota hai ki hamara loop how many times
        execute hoga.. what we knows we only knew about the condition- test condition
         */
        // initialize ham loop se bahar krte hai
        // updation loop body ke andar he hota haii
        /*int i = 0;
        while(i<=5){
            System.out.println("Hello World!" + i);
            i++;*/

        // program.. jab tak school jana hai tab tak samajh nahi aata..
        Scanner sc = new Scanner(System.in);

        // has not understood jbtk false hai tab tak loop chalega
        // confusion hai isme...

        boolean hasUnderstood = false;
        while(!hasUnderstood){ //jbtk true nahi ho jata
            System.out.println("Understood or not??");
            hasUnderstood= sc.nextBoolean();
        }
    }
}
