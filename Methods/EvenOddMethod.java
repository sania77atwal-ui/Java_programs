import java.util.Scanner;

public class EvenOddMethod {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();

        System.out.println("The number is: "+checkNumber(num));

    }
    static String checkNumber(int n){
       // String check;
        if(n>0){
           return "Positive";
        }else if(n<0){
            return "Negative";
        }else {
          return "Zero";
        }
    }
}
