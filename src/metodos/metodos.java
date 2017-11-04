package metodos;

/**
 * Created by pruiz on 10/28/17.
 */
public class metodos {


    public static void main(String[] args) {
        metodo1(1);

        String test = "arreglo1";

        System.out.println(test.charAt(5));

        test.toCharArray();

        char[] array1 =  new char[5];
        char[] array1_ordenado = metodo6(array1, 4.5f);

    }

    public static void metodo1( int a ){

    }

    public static int metod2( int a, float b ){
        return 1;
    }

    public static float metod3( int a, float b ){
        return 1.2f;
    }

    public static char metod4( int a, float b ){
        return 'a';
    }

    public static boolean metod5( int a, float[] b ){
        return false;
    }

    public static char[] metodo6( char[] a, float b ){
        char[] array = new char[0];
        return array;
    }
}
