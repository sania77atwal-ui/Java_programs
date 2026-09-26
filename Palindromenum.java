import java.util.Scanner;

public class Palindromenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int reverse = 0;
        int original = num;

        while (num > 0) {
            int digit = num % 10;
            num = num / 10;
            reverse = reverse * 10 + digit;
        }
        if (original == reverse) {
            System.out.print(original + " is a palindrome");
        }else{
            System.out.println(original+" is not palindrome");
        }

    }
}
