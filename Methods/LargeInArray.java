import java.util.Scanner;

public class LargeInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("How many:");
        int size=sc.nextInt();
        int [] array1=new int[size];
    
        //input
        for(int i=0;i<size;i++){
            System.out.print("Enter number:");
            array1[i]=sc.nextInt();
        }
        int largest=findLargeNum(array1);
        System.out.println("The largest number is: "+largest);
        
    }
    static int findLargeNum(int []array){
        int largest1=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]>largest1){
                largest1=array[i];
            }
        }
        return largest1;
    }
}
