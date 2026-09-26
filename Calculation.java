import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //input
        System.out.print("First number: ");
        int num1= sc.nextInt();
        System.out.print("Second number: ");
        int num2= sc.nextInt();
        
        int sum, diff, mul, div, remain;
         sum= num1+num2;
        System.out.println("Sum: "+sum);
         diff=num1-num2;
        System.out.println("Difference: "+diff);
         mul= num1*num2;
        System.out.println("Product: "+mul);
         div=num1/num2;
        System.out.println("Quotient: "+div);
         remain=num1%num2;
        System.out.println("Remainder "+remain);

    }
}
