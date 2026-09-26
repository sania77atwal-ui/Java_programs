import java.util.Scanner;

public class EvenCount {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num= sc.nextInt();

        int count=0;
        while (num>0) {
            int digit= num%10;      //12345%10= 5
            if(digit%2==0){           //5%2=2.5    
                count++;
            }
            num=num/10;               //12345/10=1234
        }
        System.out.println("Count: "+ count);        
    }
}
