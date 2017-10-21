package solutions.conditionalStructure;

/**
 * Created by pruiz on 9/24/17.
 */
public class isPair {

    public static void main(String[] args) {

        int number = 2;

        float result = number%2;

        if ( result == 0 ){
            System.out.println("True, The number is pair.");
        }else{
            System.out.println("False, The number is odd.");
        }

    }
}
