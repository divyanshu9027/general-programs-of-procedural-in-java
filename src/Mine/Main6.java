//area of circle
package Mine;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double radius,area,pi=3.14;
        System.out.println("enter the radius:");
        radius=scanner.nextInt();
        area=pi*(radius*radius);
        System.out.println("area of the circle is:"+area);


    }
}
