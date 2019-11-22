//odd even program
package Mine;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number :");
        int num=scanner.nextInt();
        if(num%2==0) {
            System.out.println(num +"is even number");
        }
        else {
            System.out.println(num +"is odd number");
        }

    }
}