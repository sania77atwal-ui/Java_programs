import java.util.Scanner;

public class Largenum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2=sc.nextInt();

        // greater num
        if(num1>num2){
            System.out.println(num1+" is larger");
        }else if (num1==num2){
            System.out.println("both number are equal");
        }else{
            System.out.println(num2+" is larger");
        }
    }
}
