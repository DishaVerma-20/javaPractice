package basicsarray;
import java.util.Arrays;

public class MultidimensionalArray {
    public static void main(String[] args) {
        // 2-D array : jisey hum Matrix ke naam se bhi jante haii
        // jo data hota hai vo line ma he store hota hai but hum usey depict kar paate hai as matrix
        int matrix[][] = new int[2][3];
        matrix[0][0] = 12;
        matrix[0][1] = 45;
        matrix[0][2] = 67;
        matrix[1][0] = 21;
        matrix[1][1] = 17;
        matrix[1][2] = 80;
        // System.out.println(matrix);
        // Printing an array directly prints its reference (hashcode), not its contents.
        // To print the elements, you need to loop over the array
        /*import java.util.Arrays;
        System.out.println(Arrays.deepToString(matrix));*/


        System.out.println(Arrays.deepToString(matrix));
        // it is array of array
        // array ke andar aur arrays.. like rows ke liye ek array..
        // aur phir row ki hrr ek location ke andar dusra array jo show krta hai columns ko


    }
}
