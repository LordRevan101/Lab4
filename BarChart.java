import java.util.Random;
/**
 * This program will ask the user for tha maximum width of an arrangement of stars, and the
 * program will print it out
 * @author Alan Doughman
 * @version v1.0
 * @since 3/16/25
 */
public class BarChart {
    public static void main (String[] args){
        int num1, num2, num3;
        String str1=" ", str2=" ", str3=" ";

        Random random = new Random();

        num1 = random.nextInt(1000);
        num2 = random.nextInt(1000);
        num3 = random.nextInt(1000);

        if (num1<100){
            str1=" <100 no stars";
        } else {
            for (int i=0;i<(num1/100);i++){
                str1=str1+"*";
            }
        }
        if (num2<100){
            str2=" <100 no stars";
        } else {
            for (int i=0;i<(num2/100);i++){
                str2=str2+"*";
            }
        }
        if (num3<100){
            str3=" <100 no stars";
        } else {
            for (int i=0;i<(num3/100);i++){
                str3=str3+"*";
            }
        }

        System.out.println("Number 1 is: " + num1);
        System.out.println("Number 2 is: " + num2);
        System.out.println("Number 3 is: " + num3);
        System.out.println("\nNumber Bar Chart");
        System.out.println("Number 1:" + str1);
        System.out.println("Number 2:" + str2);
        System.out.println("Number 3:" + str3);
    }
}