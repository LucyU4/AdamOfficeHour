package day3_13_2022;

public class RepeatOfString {

    public static void main(String[] args) {
        /*
        1.Create a method return a new string made of 3 copies of the last 2 chars of the oroginal tring. The string lenght wil be at least 2.

        Input: "Hello" -> "lololo"
        Input: "ab" -> "ababab"
        Input: "Hi " -> "HiHiHi"
        ====================
        (substring -length-isEmpty)
         */
                    //01234
        String word ="Hellos";// if you want to  get one character you can use charAT()

        char l=word.charAt(2);// if you want to get length of String length()

        int length = word.length();
         if(length<2);
        System.out.println(word + "length can not be smaller than 2");

        char lastCh =word.charAt(length-1);
        char secondLastCh = word.charAt(length);

                                      //01234
                                      //Hello
        // if you want to get some part of your string you can use substring()

        String el=word.substring(1,3);//el
        String lo=word.substring(3,5);//lo
        String lo2=word.substring(3);//lo make it more dynamic, instead of 3 can I ype 2 instead of 3?  //length-2
        String lo3=word.substring(length-2);

        System.out.println(lo3+lo3+lo3);
        System.out.println(lo3.repeat(3));

    }
}
