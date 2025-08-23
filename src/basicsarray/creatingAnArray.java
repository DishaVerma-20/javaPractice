package basicsarray;

public class creatingAnArray {
    public static void main(String[] args){
        int age[] = new int[7];
        age[3] = 46;
        System.out.println(age[3]);
        System.out.println(age[4]); // by default 0 store hoga as int
        System.out.println(age.length);
        int marks[] = {23,45,66,87,24};
        System.out.println(marks[0]);
//        System.out.println(age[8]); Index 8 out of bounds for length 7
    }
}
//address of zero + index * size of data type(int ka 4 size hai)
// address of zero is vo address jaha se memory ka allocation hona start hua ho.. like ek array usko allocation 1000 address se mila haiii
// array is of static or fixed size

//length of an array

//Direct Initialisation of array jab we already know the data..


