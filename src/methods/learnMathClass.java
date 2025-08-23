package methods;

import java.sql.SQLOutput;

public class learnMathClass {
    public static void main(String[] args) {
        int a = 34;
        int b = 56;
        System.out.println(Math.min(a,b));
        System.out.println(Math.abs(-56));
        // abs returns positive value
        System.out.println(Math.random());
        System.out.println(getRandom());
        System.out.println(getRan());
        System.out.println(generalFormula(20,40));
        // 0 and 1 ke bich mai return krta hai always a random value
        // o inclusive hota hai aur 1 exclusive hota hai
        // chances ki hame 0 mil jaye lekin 1 kbhi nahi mil payga


        // kuch aur functions
        System.out.println(Math.floor(6.7)); // hmesha niche vali value return krta hai
        System.out.println(Math.ceil(5.6)); // hamesha uppr vali value ko return krega yeh vala function
        System.out.println(Math.round(7.8)); // no. round off krega yeh
        }

    public static int getRandom(){
        return (int) (Math.random()*6);
        // yeh 0.0 se 5.9999...(exclusive) tak return krega
    }

    // if we want 1 se 6 tak print ho.. 6 inclusive aur 1.. then
    public static int getRan(){
        return (int) (Math.random()*6) +1;
        // recommended version, pehle isme conversion ho jayga uske baad +1 hoga
        // return (int) (Math.random()*6 +1);
    }

    public static int generalFormula(int a, int b){
        return (int) (Math.random()*(b-a+1)) + a;

    }
}
