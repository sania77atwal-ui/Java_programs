
import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("how many:");
        int size = sc.nextInt();
        
        int SumOf[]=new int[size];
        // input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the number: ");
            SumOf[i] = sc.nextInt();
        }
        int Sum=arraySum(SumOf);
        System.out.println("The sum of array is: "+Sum);
    }
    static int arraySum(int []array){
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum=sum+array[i];
        }
        return sum;
    }
}
