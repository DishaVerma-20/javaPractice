package string;

import java.sql.SQLOutput;

public class stringMethods {
    public static void main(String[] args) {

        // Java ke andar strings immutable hoti hai, toh saari new strings he form ho rahi haii


        /*String name = "     ILoveDI123@"    ;
        System.out.println("UpperCase:- "+name.toUpperCase());
        System.out.println("LowerCase:- " + name.toLowerCase());
        System.out.println("Trim:- "+ name.trim());
        // trim aage picche se whitespaces remove karta haii
        System.out.println("disha".startsWith("Dis") +" disha strats with Dis"); // case sensitivity
        System.out.println("Carpet".endsWith("pet") + " Carpet ends with pet");*/
        // character value return karta hai at particular index :- charAt()
        /*char temp = "DishaVerma".charAt(7) ;
        System.out.println("This is the value at index 7th of DishaVerma:- " + temp);

        // valueOf convert the int double values to String
        int age = 123;
        String stringAge = String.valueOf(age);
        System.out.println(age + 2 + " this is an integer value");
        System.out.println(stringAge + 2 + " this is a string value mai addition.. toh concatenation hoga");*/


        /*// replace method ko use krna
        String sentence = "I love Java, Java loves me!";
        String newSentence = sentence.replace("Java", "Python");
        System.out.println("old sentence is "+sentence);
        System.out.println("New sentence is "+newSentence);*/

        /*String sentence = "I love Java, Java loves me!";
        System.out.println("is love present in the sentence?:- "+sentence.contains("love"));
        System.out.println("is python present in the sentence?:- "+sentence.contains("python"));

        // substring method
        System.out.println(sentence.substring(2,7));*/
        // 2 inclusive rehta hai aur 7 exclusive rahega
        // spaces bhi as a part of string count kari jaygii
        // srf beginner index bhi bata skte hai aur by default puri string ko maan lega yehh end tak last index


       /* String sentence = "I love Java, Java loves me!";
        String words[]= sentence.split("a");
        for (String word : words){
            System.out.println(word);
        }*/
/*
        String sentence = "I love Java, Java loves me!";
        char letters[] = sentence.toCharArray();
        for (char letter : letters){
            System.out.println(letter);
        }*/

//        String name = ""; // empty
//        String name = " "; // blank
        String name = "DishaVerma"; // not empty, not blank
        if (name.isEmpty()){
            System.out.println("String is empty!"); // empty mtlb kuch bhi character nhi hona, remember blank space is a char
        } else if(name.isBlank()){
            System.out.println("String is Blank!");
        } else{
            System.out.println("String contains!");
        }


    }
}
