package string;

public class createString {
    public static void main(String[] args) {
        // by string literal.. preferred tareeka kyuki optimize way hai yeh
        // by new keyword.. object vala tareeka haii
        // heap memory mai store hota haii sb kuch.. literal vale way se string constant pool mai
        // if value same hai 2 string var ki toh same jgh point out kr lege variables
        // new keyword se iss area ke bahar.. chahe value same ho but alag space allign ki jaygi uss string ko
        String name = "John";
        String name2 = new String("Anuj");
    }
}
