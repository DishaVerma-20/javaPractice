package basicsarray;

public class sumArray {
    public static void main(String[] args){
        int numbers[] = {45, 67, 78, 89, 34, 25, 24, 67, 35, 78};
        int sum = 0;
        for (int number : numbers){
            sum = sum + number;
        }
        System.out.println(sum);
    }
}
