import java.util.Scanner;

public class EvenNuArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("How many:");
        int size=sc.nextInt();

        int []array2=new int[size];
        //input 
        for(int i=0;i<size;i++){
            System.out.print("Enter the number: ");
            array2[i]=sc.nextInt();
        }
        int Result=evenNumInArray(array2);
        System.out.println("The count of even numbers is: "+Result);
    }
    static int evenNumInArray(int []arra){
        int count=0;
            for(int i=0;i<arra.length;i++){
                if(arra[i]%2==0){
                    
                    count++;
                }
            }
        return count;    
    }
}
