package solutions.selectStructure;

import java.util.Scanner;

/**
 * Created by pruiz on 9/24/17.
 */
public class DaysOfWeek {

    public static void main(String[] args) {

        Scanner scann = new Scanner( System.in );

        System.out.println("Number of the day");

        String day = scann.next();

        switch ( day ){
            case "1":
                System.out.println("Monday");
                break;
            case "2":
                System.out.println("Tuesday");
                break;
            case "3":
                System.out.println("Wednesday");
                break;
            case "4":
                System.out.println("Thursday");
                break;
            case "5":
                System.out.println("Friday");
                break;
            case "6":
                System.out.println("Saturday");
                break;
            case "7":
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Is not a valid day");

        }

    }

}
