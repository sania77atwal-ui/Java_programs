import java.util.Scanner;

public class MethodOverloading {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number:");
        int num1=sc.nextInt();
        System.out.print("Enter the number:");
        int num2=sc.nextInt();
        System.out.print("Enter the number:");
        int num3=sc.nextInt();

        System.out.println("The sum is: "+add(num1, num2));
        System.out.println("The sum is: "+add(num1, num2, num3));
    }
    static int add(int x, int y){
        int sum=x+y;
        return sum;
    }
    static int add(int x, int y, int z){
        int sum=x+y+z;
        return sum;
    }
}
