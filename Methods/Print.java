
import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      // System.out.print("How many numbers want to print: ");
      // int num=sc.nextInt();
        printNumber(5);
    }
     static  void printNumber(int n){
     for(int i=1;i<=n;i++){
     System.out.println(i);
     }
 }
}
