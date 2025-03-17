import java.util.Scanner;
/**
 * This program will ask for a number in either celcius or fahrenheit, then will calculate
 * and output the opposite temperature. It will then ask the user if they want to reinput
 * another temperature.
 * @author Alan Doughman
 * @version v1.0
 * @since 3/13/25
 */
public class Temperature{
    public static void main (String[] args){
        int inputTemp;
        double output;
        char inputUnit;

        Scanner keyboard = new Scanner(System.in);

        do{
            System.out.print("Enter a whole number, a space, and a C or F to convert to celsius: ");
            inputTemp = keyboard.nextInt();
            inputUnit = keyboard.next().toUpperCase().charAt(0);

            while(!(inputUnit=='C'||inputUnit=='F')){
                System.out.print("Invalid input, enter a C or F: ");
                inputUnit = keyboard.next().toUpperCase().charAt(0);
            }
            if(inputUnit=='F'){
                output = (inputTemp - 32)*(5.0/9.0);
                System.out.printf("%d %c converted is %.1f C\n", inputTemp,inputUnit,output);
            }

            else{
                output = inputTemp * 9.0/5.0 + 32;
                System.out.printf("%d %c converted is %.1f F\n", inputTemp,inputUnit,output);
            }
            System.out.print("Enter yes to calculate another temp: ");
        } while (keyboard.next().equalsIgnoreCase("yes"));
    }
}