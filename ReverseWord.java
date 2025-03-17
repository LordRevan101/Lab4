import java.util.Scanner;
/**
 * This program will ask the user for a series of words, and will check each word if it is
 * a palindrome, until the word quit is used.
 * @author Alan Doughman
 * @version v1.1
 * @since 3/13/25
 */
public class ReverseWord{
    public static void main (String[] args){
        String word, remaining, combined, flipped;
        char firstLetter;

        Scanner keyboard = new Scanner (System.in);
        do{
            System.out.println("Enter a series of words to test as palindromes, end with quit");
            word = keyboard.next().toLowerCase();
            while(!word.equals("quit")){
                firstLetter = word.charAt(0);
                remaining = word.substring(1);
                combined = remaining + firstLetter;
                flipped = "";
                for (int i=combined.length()-1;i>=0;i--){
                    flipped+=combined.charAt(i);
                }
                if (word.equals(flipped)) {
                    System.out.println(word + " works");
                }
                else {
                    System.out.println(word + " does not work");
                }
                word = keyboard.next().toLowerCase();
            }
            System.out.println("Enter yes to process another line?");
        } while(keyboard.next().equalsIgnoreCase("yes"));
    }
}