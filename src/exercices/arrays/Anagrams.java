package exercices.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by pruiz on 10/28/17.
 */
public class Anagrams {

    public static void main(String[] args) {

        Scanner entrada = new Scanner( System.in );
        //TOdo: pedir la primer palabra
        System.out.println("Primer palabra:");
        String palabra1 = entrada.next();
        System.out.println("Segunda palabra:");
        String palabra2 = entrada.next();

        //todo: validar tamaños
        if ( palabra1.length() != palabra2.length() ){
            System.out.println("no son anagramas");
            return;
        }

        char[] arreglo1 = palabra1.toCharArray();
        char[] arreglo2 = palabra2.toCharArray();

//        // refactor esto es lo mismo que crear los arreglos y mandarlos a la funcion
//        char[] arreglo1_ordenado = bubbleSort( palabra1.toCharArray() );
//        char[] arreglo2_ordenado = bubbleSort( palabra2.toCharArray() );

        char[] arreglo1_ordenado = bubbleSort(arreglo1);
        char[] arreglo2_ordenado = bubbleSort(arreglo2);

        //todo comparar arreglos
//        if ( compararArreglos(arreglo1_ordenado, arreglo2_ordenado)){ linea 36 y 37 hacen lo mismo
        if ( compararArreglos(arreglo1_ordenado, arreglo2_ordenado) == true){
            System.out.println("yeiii son anagramas");
        }else{
            System.out.println("no son anagramas");
        }


    }

    public static boolean compararArreglos(char[] array1, char[] array2) {

        for ( int i = 0 ; i < array1.length; i++ ){

            if ( array1[i] != array2[i] ){
                return false;
            }

        }
        return true;
    }

    public static char[] bubbleSort(char[] arreglo1) {
        //todo implementar bubble sort
        return new char[0];
    }

}
