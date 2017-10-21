package solutions.loops;

/**
 * Created by pruiz on 10/8/17.
 */
public class ArraysFillAndRead {

    public static void main(String[] args) {

        int size = 10;

        int[] array = new int[10];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;

        for ( int i= 0; i < size ; i++ ){
            array[i] = i+10;
        }

        for ( int i= 0; i <size ; i++ ){
            System.out.println( "array value on index " + i + ":" + array[i] );
        }

    }
}


//
//[1,2,3,4,5]
//
//array[0] => 1
//array[1] => 2
//array[2] => 3
//array[3] => 4
//array[4] => 5