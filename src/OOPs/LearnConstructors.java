package OOPs;

public class LearnConstructors {
    public static void main(String[] args) {
        complex num1 = new complex(2,5);
        complex num2 = new complex(56, 89);
        complex num3 = new complex(4);
        num1.complexNu();
        num2.complexNu();
        num3.complexNu();
    }
}

class complex{
    int a, b;
// Default class:- java apne aap create kar deta hai isko
//    public complex(){
//        a = 0;
//        b = 0;
//
//    }
//    public complex(){
//        a = 5;
//        b = 9;
//        System.out.println("Creating a new object");
//    }


    // method overloading
    public complex(int real){
        a = real;
        b = 12;
    }

    public complex(int real, int imag){
        a = real;
        b = imag;
    }

    void complexNu(){
        System.out.println(a + "+" +b +"i");
    }


}
