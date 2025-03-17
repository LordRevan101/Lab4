import java.util.Scanner;
/**
 * This program will ask the user for tha maximum width of an arrangement of stars, and the
 * program will print it out
 * @author Alan Doughman
 * @version v1.0
 * @since 3/13/25
 */
public class Flashback {
    public static void main (String[] args){
        int width, space, stars=1;

        Scanner input = new Scanner(System.in);
        System.out.print("What is the maximum width you want your star to be? ");
        width = input.nextInt();
        if (width%2==0){
            width++;
        }
        space = (width-1)/2;
        for (int i=0;i<=(width/2);i++){
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            space--;
            for(int k=0;k<stars;k++){
                System.out.print("*");
            }
            System.out.print("\n");
            stars+=2;
        }
        stars-=4;
        space+=2;
        for (int i=0;i<=(width/2);i++){
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            space++;
            for(int k=0;k<stars;k++){
                System.out.print("*");
            }
            System.out.print("\n");
            stars-=2;
        }
    }

}
