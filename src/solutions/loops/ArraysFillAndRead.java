package solutions;

/**
 * Created by pruiz on 10/8/17.
 */
public class ArraysFillAndRead {

    public static void main(String[] args) {

        int size = 10;

        int[] array = new int[10];

        for ( int i= 0; i < size ; i++ ){
            array[i] = i+10;
        }

        for ( int i= 0; i < size ; i++ ){
            System.out.println( "array value on index " + i + ":" + array[i] );
        }

    }
}
