package exercices;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * Created by pruiz on 9/24/17.
 */
public class Semaforo {

    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);

        System.out.println("Give me the color:");

        String color = scan.next();

        if ( color.equals( "rojo" ) ){
            System.out.println("detente");
        }else{

            if ( color.equals("verde") ){
                System.out.println("avanza");
            }else{

                System.out.println("se precabido");
            }

        }

    }

}
