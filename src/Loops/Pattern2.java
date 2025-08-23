package Loops;

public class Pattern2 {
    public static void main(String[] args){
        for (int i=1; i<6; i++){
            for (int j=i; j<i+2; j++){
                System.out.print(j + " ");
                j++;
            }
            System.out.println();
        }
    }
}
// updation for the loop happens after execution of initialisation, condition then body of the loop...
// and then at last updation..


