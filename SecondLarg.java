import java.util.Scanner;

public class SecondLarg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int largest = 0;
        int secondlarg=0;
        while (num > 0) {
            int digit = num % 10; // 84561%10=1 , 8456%10=6
            if (digit > largest) {    
                secondlarg=largest;   
                largest = digit;        
            }else if(digit<largest && digit>secondlarg){
                secondlarg=digit;
            }
            num = num / 10; 
            
        }
        System.out.println("The largest digit is: " + largest);
        System.out.println("The secondlargest digit is: "+secondlarg);
    }
}
