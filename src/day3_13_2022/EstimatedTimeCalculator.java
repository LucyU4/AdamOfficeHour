package day3_13_2022;

import java.util.Scanner;

public class EstimatedTimeCalculator {

    public static void main(String[] args) {
        /*...*/

        int maxSpeed=80;
        int minSpeed=40;

        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter your speed");
        double speed = scanner.nextDouble();
        if(speed<minSpeed || speed >maxSpeed);
        speed = 60; // if you have one statement only you don't have to use{}
        /*
        if speed<minspeed || speed >maxspeed){
        speed =60;
         */
        System.out.println("please enter the distance ");
        double distance = scanner.nextDouble();
        System.out.println("please enter the starting point");
        String startingPoint =scanner.nextLine();// if you use the nextline()
        //check before and put one more nextLine() in order to catch Enter key

        System.out.println("please enter the ending point");
        String endingPoint = scanner.nextLine();

        double time = distance/ speed;

        System.out.println("Enter Estimated of Arrival is " + time + " hours from " + startingPoint + " endingPoint");





    }
}
