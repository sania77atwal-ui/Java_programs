import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter the opreator: ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                int sum = num1 + num2;
                System.out.println("Result: " + sum);
                break;
            case '-':
                int diff = num1 - num2;
                System.out.println("Result: " + diff);
                break;
            case '*':
                int mul = num1 * num2;
                System.out.println("Result: " + mul);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero");
                }else{
                System.out.println("Result: " + num1 / num2);
            }
                break;
            case '%':
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero");
                }else{
                System.out.println("Result: " + num1 % num2);
                 }
                break;
            default:
                System.out.println("Invalid ");
                break;
        }
    }
}
