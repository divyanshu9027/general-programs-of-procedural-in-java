// calculator
package Mine;
import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double num1,num2,add,sub,mul,div;
        System.out.println("enter the first number:");
        num1=scanner.nextDouble();
        System.out.println("enter the second number:");
        num2=scanner.nextDouble();
        add=num1+num2;
        System.out.println("addition of two numbers is"+ " "+add);
        if(num1>num2) {
            sub=num1-num2;
            System.out.println("sub of two numbers is where num1 is greater than num2"+" "+sub);
        }
        else {
            sub=num2-num1;
            System.out.println("sub of two numbers is where num2 is greater than num1"+" "+sub);

        }
        mul=num1*num2;
        System.out.println("after mul answer becomes"+" "+mul);
        if(num1/num2==0) {
            System.out.println("error occurs in this operation");
        }
        else {
            div=num1/num2;
            System.out.println("the answer becomes"+" "+div);
        }


    }
}
