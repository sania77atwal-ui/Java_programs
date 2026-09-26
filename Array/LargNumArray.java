import java.util.Scanner;

public class LargNumArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("How many numbers: ");
        int size= sc.nextInt();

        int largeNum[]=new int[size];
        int large=0;
        //input 
        for(int i=0;i<size;i++){
            System.out.print("Enter the number: ");
            largeNum[i]=sc.nextInt();
            if(largeNum[i]>large){
                large=largeNum[i];
            }
        }
        System.out.println("The largest number is: "+large);
        
    }
}
