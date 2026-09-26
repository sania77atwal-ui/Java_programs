import java.util.Scanner;

public class LargestDigit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int largest=0;
        while (num>0) {
            int digit = num%10;  //12345%10=5  , 1234%10=4
            if(digit>largest){                               //5>0 , 4>5:false
                largest=digit;
            }
            num=num/10;                   //12345/10=1234
        }
        System.out.println("The largest digit is: "+largest);
    }
}
