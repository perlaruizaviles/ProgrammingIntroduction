package exercices;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * Created by pruiz on 9/27/17.
 */
public class MultiplicateTwoNumbers {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // piden el numero, guardan el numero, imprimen el numero
        System.out.print("Input first number: ");
        int num1 = entrada.nextInt();
        System.out.println( "num1: " + num1 );

        // piden el numero, guardan el numero, imprimen el numero
        System.out.print("Input second number: ");
        int num2 = entrada.nextInt();
        System.out.println( "num2: " + num2 );

        // esta linea es la buena
        int result = num1 * num2;
        System.out.println("El resultado de la multiplicacion es:"
                + result );

//        //print the result
//        System.out.println("Input the operator:");
//        String operador = entrada.next();
//        int result =0;
//        if ( operador.equals("-") ){
//
//            result = num1 - num2;
//        }
//
//        if ( operador.equals("+") ){
//
//            result = num1 + num2;
//        }
//
//        if ( operador.equals("*") ){
//
//            result = num1 * num2;
//        }
//
//        if ( operador.equals("/") ){
//
//            result = num1 / num2;
//        }
//        System.out.println( "El resultado de la operacion es:" + result );

    }

}
