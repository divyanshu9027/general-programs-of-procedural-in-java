//check wheather a number is positive or negative
package Mine;
import java.util.Scanner;
public class Main9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number:");
        double num=scanner.nextDouble();
        if(num>0.0) {
            System.out.println("number is positive");
        }
        else if(num<0.0) {
            System.out.println("number is negative");
        }
        else {
            System.out.println("number is zero");
        }

    }
}