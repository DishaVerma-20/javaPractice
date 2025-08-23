package Loops;

public class breakStatement {
    public static void main(String[] args){
        for (int count = 0; count < 10; count++) {
            System.out.println(count);
            if (count==4) break;
        }
    }
}
