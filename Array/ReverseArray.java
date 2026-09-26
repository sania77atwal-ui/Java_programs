import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("How many  numbers: ");
        int size=sc.nextInt();

        
        int reverse[]=new int[size];
        //input
        for(int i=0;i<reverse.length;i++){
           
            System.out.print("Enter the number:");                        
             reverse[i]=sc.nextInt();                            //1,2,3,4,5
        }
        for(int i=0;i<size/2;i++){

            int temp=reverse[i];
            reverse[i]=reverse[size-1-i];   
            reverse[size-1-i]=temp;   
               
        }
        System.out.print("The reversed array: ");
        for(int i=0;i<size;i++){
            System.out.print(reverse[i]+" ");
        }
        
    }
}
