import java.util.Scanner;

public class SumDigit {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num= sc.nextInt();

        int sum=0;
        while (num>0) {
            int temp=num%10; //12345%10=5
            num=num/10;  //12345/10=1234.5 in the int =1234
            sum=temp+sum;
        }
        System.out.println("The sum is: "+sum);
    }
}
