package Loops;

public class Pattern1 {
    public static void main(String[] args){
        for (int i=1; i<=10; i++){
            for (int j=1; j<=i; j++){
                // j < 10 krege toh uppr ek space aa raha hoga kyuki 1 = 1.
                // System.out.print(j);
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
