package Array;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter how many numbers: ");
        int size=sc.nextInt();

        int array[]= new int[size];

        int sum=0;
        //for input
        for(int i=0; i<array.length;i++){
            System.out.print("Enter the number: ");
             array[i]=sc.nextInt();
             sum=sum+array[i];
        }
        System.out.print("sum of all array items: "+sum);


        //for output
      //for(int i=0;i<size;i++){
      //    System.out.print(array[i]+" ");
      //
      // }

    }
}
