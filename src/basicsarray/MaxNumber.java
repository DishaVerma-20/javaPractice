package basicsarray;

public class MaxNumber {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int[] numbers = {78, 99, 45, 67, 90, 100, 56, 121};
        for (int number : numbers){
            if (number>max){
                max = number;
            }
        }
        System.out.println(max);
    }
}
