package Basics;

public class arithmeticOperators {
    public static void main(String[] args) {
        int a = 12;
        int b = 7;
        int c = a+b;
        System.out.println("The sum is" + " " + c);

        // Division Operator part of arithmetic operators

        int p = 45;
        int q = 8;
        int r = p/q;
        System.out.println("Quotient is" + " " + r);
        // p is dividend and q is divisor
        double w = p/q;
        System.out.println("Quotient is" + " " + w);
        // yaha par srf result ko convert kara hai in double.. this is implicit type of conversion
        // If we want answer in points, then use Explicit Conversion
        double x = (double)p/q;
        // p or q any variable explicit kar dena hai..
        System.out.println("Quotient is " + x);

        // Ctrl + D krne se line double ho jaygi uss line pr selection karna hoga

        // MODULO Operator
        int num1 = 12;
        int num2 = 7;
        int modulo = num1 % num2;
        System.out.println("Remainder after division is " + modulo);
    }
}
