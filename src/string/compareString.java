package string;

public class compareString {
    public static void main(String[] args) {
        String name = "Disha";
        String sameName = "Disha";
        // " " double quotes ko string literal kehte haii
        String newName = new String("Disha");
        String newName2 = new String("DISHA");
        /*if (name == sameName){
            System.out.println("Both are equal.");
        }
        System.out.println("yeh bhi string he hai, but yeh variable ko assign nahi hai toh kaam khtm hone ke baad gyb ho jaygi yeh");
        if (name == newName){
            System.out.println("Both are same!");
        }else{
            System.out.println("Both are not equal!");
        }*/
    // == (objects) ke case ma references check kare jaate hai.. unki values nahi
        // references ko stack memory ma store karte haiii
        // refernces example haiii.. name, newName, sameName, etc
//        if (name.equals(newName)){
       /* if (name.equals(newName2)){ //JAVA is Case- Sensitive
            System.out.println("both values are same!");
        }else{
            System.out.println("not same!");
        }*/
        if (name.equalsIgnoreCase(newName2)){
            System.out.println("Both values are same!");
        }else{
            System.out.println("values are not same!");
        }
    }
}
