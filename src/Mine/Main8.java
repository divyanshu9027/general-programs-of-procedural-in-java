//fibonacci series by user
package Mine;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the n value:");
        int n=scanner.nextInt();
        int t1=0,t2=1;
        System.out.print("first" + n + "terms:");
        for(int i=1;i<=n;i++) {
            System.out.print(t1 + "+");
            int sum=t1+t2;
            t1=t2;
            t2=sum;
        }
    }
}
