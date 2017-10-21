package solutions.loops;

import java.util.Scanner;

/**
 * Created by pruiz on 10/8/17.
 */
public class ProductsCalculator {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numProducts = 5;

        String[] arrayProducts = new String[numProducts];
        float[] arrayPrices = new float[numProducts];

        for (int i = 0 ; i < 5 ; i++){

            System.out.println("Introduce el nombre del producto:");
            String producto = entrada.next();
            arrayProducts[i] = producto;

            System.out.println("Introduce el precio por unidad:");
            float precio = entrada.nextFloat();
            arrayPrices[i] = precio;
        }

        System.out.println("Imprimiendo precios");

        for (int i = 0; i < numProducts ; i++){
            System.out.print("Producto: " + arrayProducts[i]);
            System.out.println(" -- Precio: " + arrayPrices[i]);
        }

    }

}
