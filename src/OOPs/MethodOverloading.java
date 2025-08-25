package OOPs;

import org.w3c.dom.ls.LSOutput;

public class MethodOverloading {
    public static void main(String[] args) {
        Greeting obj = new Greeting();
        obj.greetings();
        obj.greetings("Disha Verma");

    }
}
class Greeting {
    void greetings(){
        System.out.println("Hello, guten morgen!");
    }
    void greetings(String name){
        System.out.println("Hello, " + name +" Guten morgen!");
    }

    void greetings(String name, int age){
        System.out.println("My name is "+name+". I am "+age+" years old.");
    }
}