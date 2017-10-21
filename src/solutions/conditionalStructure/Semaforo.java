package solutions.conditionalStructure;

import java.util.Scanner;

/**
 * Created by pruiz on 9/24/17.
 */
public class Semaforo {

    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);

        System.out.println("Give me the color:");

        String color = scan.next();

        if ( color.equals("verde") ){
            System.out.println("You can pass");
        }

        if ( color.equals("rojo") ){
            System.out.println("STOP!");
        }

        if ( color.equals("amarillo") ){
            System.out.println("You should slow down");
        }


        switch (color){

            case "verde":
                System.out.println("You can pass");
                break;
            case "rojo":
                System.out.println("STOP!");
                break;
            default:
                System.out.println("You should slow down");

        }


    }

}
