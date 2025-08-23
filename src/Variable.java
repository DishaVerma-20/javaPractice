public class Variable {
    public static void main(String[] args) {
        byte _age = 4; // 1byte = 8 bits
        boolean isValid = true; // by default value is false
        float $num = 5.67f; // agar hum f nhi then by default double
        double num1 = 123.56754264896534365767;
        // ctrl + shift + / for multiline comment shortcut
        // ctrl + / for single line commemt shortcut

        // Java uppr se niche run karta haii

        System.out.println(_age);
        System.out.println($num);
        System.out.println(num1);
        System.out.println(isValid);

        char myLetter = 'a'; // Single quotes only.. otherwise string ban jayga
        System.out.println(myLetter);
        // only one character at a time
        // single quote is character literal

        int num2 = 789;
        long numLong = num2; // Implicit type of conversion.. small buckets to large buckets easily

        long num3 = 12;
        int numInt = (int)num3; // Explicit type of conversion.. data can be lost
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(numLong);
        System.out.println(numInt);

        int age1 = 128;
        byte newAge1 = (byte)age1;
        System.out.println(newAge1);

        // forward slash

        // Implicit simply means direct or widening
        // multiline comments /*.....*/
    }
}
