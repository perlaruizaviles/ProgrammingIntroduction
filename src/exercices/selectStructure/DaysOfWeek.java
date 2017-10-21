package exercices.selectStructure;

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
                System.out.println("este dia es lunes");
                break;
            case "2":
                System.out.println("este dia es martes");
                break;
            case "3":
                System.out.println("este dia es miercoles");
                break;
            case "4":
                System.out.println("este dia es jueveves");
                break;
            case "5":
                System.out.println("este dia es viernes");
                break;
            case "6":
                System.out.println("este dia es fin de semana");
                break;
            case "7":
                System.out.println("este dia es fin de semana");
                break;

            default:
                System.out.println("este no es un dia de la semana");

        }

    }

}
