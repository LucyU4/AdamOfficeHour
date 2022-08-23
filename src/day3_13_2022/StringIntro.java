package day3_13_2022;

public class StringIntro {

    public static void main(String[] args) {

        String str1="Cydeo";
        String str2="Cydeo";
        String str3=new String("Cydeo");//inside the string pool
        String str4=new String("Cydeo");//inside the string heap

// == for String pool
        // equals() equalIgnoreCae();


        System.out.println(str1==str2);// true this inside string pool
        System.out.println(str1==str3);//false  this inside string pool
        System.out.println(str3==str3);//false this inside string pool

        System.out.println(str1.equals(3));// true  this inside heap
        System.out.println(str3.equals(4));//true this inside heap
        System.out.println(str3==str2);//true this inside heap


    }
}
