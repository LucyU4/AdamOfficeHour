package day07_08_17_2022;

public class MergeArrayClass {

    public static int[] mergeArray(int[] a, int[] b,int [] c) {
        //I need to create one dummy array
        int [] dummy=new int[a.length+b.length];

        // I need to put my first array into dummy
        int index=0;
        for (int each:a) {
            dummy[index++]=each;
        }
        //int [] dummy={1,2,3}

        //I need to put my second array into dummy

        for (int each:b) {
            dummy[index++]=each;
        }
        //int [] dummy={1,2,3,4,5,6}
        //I need to return dummy
        //I need to put my third array into dummy

        for (int each:c) {
            dummy[index++]=each;
        }


        return dummy;
    }
}
