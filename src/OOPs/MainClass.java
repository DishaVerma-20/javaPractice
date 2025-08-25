package OOPs;

public class MainClass {
    public static void main(String[] args) {
        Dog d1= new Dog(); //new keyword ke baad constructor haii
        d1.name = "Tommy";
        d1.bark();

        Dog d2 = new Dog();
        d2.name = "Leo";
        d2.walk();

        ComplexNumber num1 = new ComplexNumber();
        num1.a = 56;
        num1.b = 45;
        num1.print();

    }
}

class Dog {
//    properties
    String name;
    int Age;
    String color;

//    behaviour
    void walk(){
        System.out.println(name + " is walking.");
    }
    void bark(){
        System.out.println(name + " is barking.");
    }

}

class Cat {

}

class ComplexNumber{
    int a, b;

    void print(){
        System.out.println(a + " + " + b +"i");
    }
}
