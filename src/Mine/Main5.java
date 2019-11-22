//reverse of a number
package Mine;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        int num=0,reverse=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number:");
        num=scanner.nextInt();
        while(num!=0) {
            reverse=reverse*10;
            reverse=reverse+num%10;
            num=num/10;
        }
        System.out.println("reverse of a number is"+reverse);


    }
}
