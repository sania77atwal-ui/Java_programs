import java.util.Scanner;

public class SecondLarArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("how many:");
        int size=sc.nextInt();

        int second[]= new int[size];
        
        //input 
        for(int i=0;i<size;i++){
            System.out.print("Enter the number: ");      //12345
            second[i]=sc.nextInt();
        }
        int largest=second[0];
        int secondLarge=second[0];
        for(int i=1;i<size;i++){
            if(second[i]>largest){
                secondLarge=largest;
                largest=second[i];
            }else if(second[i]<largest && second[i]>secondLarge){
                secondLarge=second[i];
            }
        }
        System.out.println("The Largest: "+largest+" and the secondlargest: "+secondLarge);
    }
}
