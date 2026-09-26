import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int num = sc.nextInt();

        if (num >= 90 && num <= 100) {
            System.out.println("Grade: A");
        } else if (num >= 80 && num <= 89) {
            System.out.println("Grade: B");
        } else if (num >= 70 && num <= 79) {
            System.out.println("Grade: C");
        } else if (num >= 60 && num <= 69) {
            System.out.println("Grade: D");
        } else if (num < 60 && num>=0) {
            System.out.println("Grade: F");
        }else{
            System.out.println("invalid marks");
        }

    }
}
