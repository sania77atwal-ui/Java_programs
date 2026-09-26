import java.util.Scanner;

public class Primenum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num= sc.nextInt();

         boolean isprime=true;        
           
         if(num==1 || num==0 ){
            isprime=false;
         }
        for(int i=2;i<num;i++){
            if(num%i==0){                    
                isprime=false;
                break;
            }
        }
        if(isprime){
            System.out.println(num+" is prime");
        }else{
            System.out.println(num+" is not prime");
        }
    }
}
