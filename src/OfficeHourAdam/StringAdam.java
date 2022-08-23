package OfficeHourAdam;

public class StringAdam {
    public static void main(String[] args) {


        String result = "";
        int n = 15;
        if (n % 2 == 0) {
            result = result + " even number";
        } else {
            result = result + " odd number";
        }
        if (n % 3 == 0) {
            result = result + " even number";

        } else {
            result = result + " odd number";

            if (n % 5 == 0) {
                result = result + " even number";

            } else {
                result = result + " odd number";

                System.out.println(result);


            }
        }
    }
}
