import java.util.Scanner;

public class SmallestinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many  numbers: ");
        int size = sc.nextInt();

        int small[]=new int[size];
        //input
        for(int i=0; i<size;i++){
            System.out.print("Enter the number:");
            small[i]=sc.nextInt();                         //54321
        }
        int smallest=small[0];
        for(int i=1;i<size;i++){
            if(small[i]<smallest){
                smallest=small[i];
            }
        }
        System.out.println("The smallest number is: "+smallest);
    }
}
