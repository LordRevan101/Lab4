import javax.swing.JOptionPane;
/**
 * This program will ask the user for a phrase, then a character to be assessed.
 * The program will then search for the number of times that sentence has that character.
 * @author Alan Doughman
 * @version v1.0
 * @since 3/13/25
 */
public class Challenge5 {
    public static void main (String[] args){
        String phrase, characterinput;
        char character, checkchar;
        int n, z=0, a=0;
        
        phrase = JOptionPane.showInputDialog("Please enter a phrase");
        characterinput = JOptionPane.showInputDialog("Please enter a single character");
        character = characterinput.charAt(0);
        
        n = phrase.length();
        
        for (int i=0;i<=(n-1);i++){
            checkchar = phrase.charAt(z);
            if (checkchar==character){
                a++;
            }
            z++;
        }
        JOptionPane.showMessageDialog(null,"The phrase: " + phrase + "\nThe character " + character + " appears " + a + " times.");
        System.exit(0);
    }
}
