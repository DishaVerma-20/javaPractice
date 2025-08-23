package basicsarray;

public class MinNumber {
    public static void main (String[] args){
        int MinNumber = Integer.MAX_VALUE;
        // yeh wrapper class hoti hai, iske baare ma badme pdege, integer ki sabse max value store hoti hai isme
        int[] numbers = {23, 45, 67, 28, 8, 9, 91};
        for (int number : numbers){
            if (number < MinNumber){
                MinNumber = number;
            }
        }
        System.out.println(MinNumber);
    }
}
