//area of square
package Mine;
import java.util.Scanner;


public class Main4 {
    public static void main(String[] args) {
        double side,area;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the side of square:");
        side=scanner.nextDouble();
        area=side*side;
        System.out.println("area of square is:"+area);
    }
}
