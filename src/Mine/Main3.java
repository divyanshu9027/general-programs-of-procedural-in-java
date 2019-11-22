//area of rectangle
package Mine;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        double length,width,area;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the length:");
        length=scanner.nextDouble();
        System.out.println("enter the width:");
        width=scanner.nextDouble();
        area=length*width;
        System.out.println("area of rectangle is:"+area);

    }
}
