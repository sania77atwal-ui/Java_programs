import java.util.Scanner;

public class Evennum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n= sc.nextInt();

//even num
      // int count=0;
      // System.out.print("Even number: ");
      //  for(int i=1;i<=n;i++){
      //      if(i%2==0){
      //          System.out.print(i+" ");
      //          count+=1;
      //      }
      //  }
      //  System.out.println();
      //  System.out.println("Count: "+count);

//odd num
        int count=0;
        System.out.print("Odd number: ");
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                System.out.print(i+" ");
                count+=1;
            }
        }
        System.out.println();
        System.out.println("Count: "+count);
       
    }
}
