package Loops;

public class doWhileLoop {
    public static void main(String[] args){
        /*
        chahe condition false ho ya true loop ek baar toh run jarur karne vala haii.. irrespective of this fact
         */
        // int i = 8; ek baar jarur execute hoga
        int i = 8;
        do{
            System.out.println(i);
            i++;
        } while(i<=5);

        System.out.println("Out of the Loop!");
    }
}
