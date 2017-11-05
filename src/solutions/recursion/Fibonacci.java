package solutions.recursion;

/**
 * Created by pruiz on 11/4/17.
 */
public class Fibonacci {
    public static void main(String args[])
    {
        int primerElementoDelPatron=0;
        int segundoElementoDelPatron=1;
        int count=10;

        System.out.print(primerElementoDelPatron+" "+segundoElementoDelPatron);//printing 0 and 1
        int siguienteValor;
        for(int i = 2 ; i < count; ++i)//loop starts from 2 because 0 and 1 are already printed
        {
            siguienteValor= primerElementoDelPatron + segundoElementoDelPatron;

            System.out.print(" "+siguienteValor);

            primerElementoDelPatron= segundoElementoDelPatron;

            segundoElementoDelPatron = siguienteValor;
        }

        int [][] m = new int[3][];
        int [][] m2 = new int[3][3];
        int [][] m3;


    }
}
