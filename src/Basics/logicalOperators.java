package Basics;

public class logicalOperators {
    public static void main(String[] args){
        // logical operators combine multiple boolean conditions ya we can say expressions
        // results of relational operators
        /*logical and && expression1 && expression2 and matlab multiply
        logical or || expression1 || expression2 or mtlb addition
        logical Not ! !expression*/
        int a = 15;
        int b = 88;
        boolean firstExpression = a > b;
        boolean secondExpression = true;
        System.out.println(firstExpression && secondExpression);
        System.out.println(firstExpression || secondExpression);
        System.out.println(!firstExpression);

    }
}
