package Loops;

public class continueStatement {
    public static void main(String[] args){
        for (int i = 0; i < 20; i++) {
            if (i==4 || i==10 || i>=15) continue;
            System.out.println("Gave toffee to "+i);
        }
    }
}
