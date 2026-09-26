import java.util.Scanner;

public class ReverseNum {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num= sc.nextInt();

        int reverse=0;
        while(num>0){
            int digit=num%10; //5*10=50+4=>54*10=>540+3=>543*10=>5430+2=>5432*10=>54320+1=>54321
            num=num/10; 
            reverse=reverse*10+digit;  //0=0*10+5=>5*10+4
        }
        System.out.print(reverse);
    }
}