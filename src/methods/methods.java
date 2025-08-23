package methods;

public class methods {
    public static void main(String[] kuchbhi) {
        int avg = average(3,5,true);
        System.out.println(avg);
        /*for (String arg:kuchbhi){
            System.out.println(arg);
        }*/
        // args ki jagah kuch bhi likh skte hai kyuki yeh ek variable ka name haii

        // methods.methods ko functions ke naam se bhi jante hai, interchangeably yeh terms ko use kar sakte haii
        // functions ko hum use karte hai to reuse the code
        // functions kuch specific tasks ko perform krte haii
        // functions ke kuch components hote haii

        // Access Specifier :-
        // private : Accessible only within the same class. Not visible outside the class, even to subclasses.
        // public : Accessible from anywhere in the program — inside the same class, same package, subclasses, and other packages.
        // aur bhi types ke access specifier hote hai badme pdege

        // return type :- koi bhi ek chij return hogi aur uska data type kya hoga yeh specified kara jata hai
        // method name :- jese variable ka name declare krte hai vese he method ka name declaration hota hai
        // parameter List: can be more than one, bahut saare parameters pass hoge aur ek aayga output as a return type
        // Method header ke andar aata hai yeh sab kuch, access specifier, return type, method name, parameter list
        // method body contain krta hai ki function ya method kya kaam karega


       /* greet();
        average(12,14);
        }


    public static void greet(){
        System.out.println("Hello World!");
    }
    // ek class ke andar kitne bhi methods bana sakte haii
    // static main vale method ke andar call krne ke liye method ko static banana jruri hai
    // agar non- static hai toh method ke liye instance banana pdta hai
    // if no access specifier, Default Access (Package-Private)


    public static void average(int a, int b){
        int avg = (a+b)/2;
        System.out.println("The average is "+avg);*/
    }
    public static int average(int a, int b,boolean shouldAvg){
        if (shouldAvg == false){
            return -1;
        }
        int avg = (a+b)/2;
        System.out.println("Returning the average");
        return avg;
    }
    // agar return hit ho jata hai toh uske baad kuch bhi nahi consider kara jata haiii.. sbko ignore kr dete hai
    // last line of method by default return hoti hai usey likho ya na likho doesn't matter
}
