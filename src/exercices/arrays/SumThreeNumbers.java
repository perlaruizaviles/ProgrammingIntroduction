package exercices.arrays;

import java.util.Scanner;

/**
 * Created by pruiz on 10/21/17.
 */
public class SumThreeNumbers {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Dame el tamaño del arreglo: ");
        int arraySize = entrada.nextInt();

        int[] array = new int[arraySize];

//        inicializa arreglo
        for( int i = 0 ; i < arraySize ; i++){
            System.out.println("Dame el elemento: ");
            int valor = entrada.nextInt();
            array[i] = valor;
        }

//        todo:
//        implementar suma de los 3 elementos


        System.out.println("Imprime la matriz");
//        imprime arreglo
//        for( int i = 0 ; i < array.length ; i++){  linea 27 y linea 28, hacen lo mismo
        for( int i = 0 ; i < arraySize ; i++){
            System.out.println( array[i] );
        }

    }

}
