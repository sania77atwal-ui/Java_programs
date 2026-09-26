import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2=sc.nextInt();
        //System.out.println("Sum is : "+add(num1, num2));
        add(num1, num2);
    }
    static int add(int x, int y){
        System.out.println(x+y);
        return 0;
        //return x+y;
    }
}
