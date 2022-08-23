package day3_13_2022;

public class SimpleCalculatorSwitch {

    public static void main(String[] args) {
        /*
        task1: get two numbers and operator

        create a simple calculator
        case 1 +
        case 2*
        case 3-
        case 4/
        default:
         */

        int num1 = 10;
        int num2 = 14;
        char ch = '+';
        int result = 0;

        switch (ch) {

            case '+':
                result = num1 + num2;
                break;

            case '*':
                result = num1 + num2;
                break;

            case '-':
                result = num1 + num2;
                break;
            case '/':
                result = num1 + num2;
                break;

            default:
                result=0;
                System.err.println("invalid operator");
                break;

        }
        System.out.println("result = " + result);
    }

    }

