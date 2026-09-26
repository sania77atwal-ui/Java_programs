import java.util.Scanner;

public class NumType {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
         int num= sc.nextInt();
        
         if(num>0){
            System.out.println(num+" is positive");
         }else if(num==0){
            System.out.println(num+" is Zero");
         }else{
            System.out.println(num+" is negative");
         }

    }
}
