import java.util.Scanner;

public class SmallestInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.print("How many:");
       int size=sc.nextInt();
       int []array4=new int[size];
       //input 
     for(int i=0;i<size;i++){
         System.out.print("Enter the number: ");
         array4[i]=sc.nextInt();
        }

        int result=smallestNum(array4);
        System.out.println("The smallest number is: "+result);
    }
      static int smallestNum(int []arra){

            int small=arra[0];
            for(int i=1;i<arra.length;i++){
                if(arra[i]<small){
                    small=arra[i];
                }
            }
            return small;
        }
    
}
