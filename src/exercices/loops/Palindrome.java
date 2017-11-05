package exercices.loops;

import java.util.Scanner;

/**
 * Created by pruiz on 11/4/17.
 */
public class Palindrome {

    public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        System.out.println("Escribe la palabra:");
        String word = input.next();
        char[] palabraArray = word.toCharArray();
        int sizeWord = palabraArray.length;
        int middleIndex = sizeWord / 2 - 1;

        for (int i = 0; i <= middleIndex; i++) {
            char startIndex = palabraArray[i];
            char endIndex = palabraArray[sizeWord - 1 - i];
            if (startIndex != endIndex) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);

        String newWord = "";
        for( int i = sizeWord ; i >= 0 ; i-- ){
            newWord+= word.charAt(i);
        }
        if ( word.equals(newWord) ){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }

}
