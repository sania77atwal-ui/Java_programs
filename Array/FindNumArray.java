import java.util.Scanner;

public class FindNumArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("How many:");
        int size=sc.nextInt();

        int findnum[] =new int[size];
        int x;
        boolean found=false;
        for(int i=0;i<size;i++){
            System.out.print("Enter the number: ");
             findnum[i]=sc.nextInt();
        }
         System.out.print("enter the number you want to find: ");
         x=sc.nextInt();

        for(int i=0;i<size;i++){
            if(x==findnum[i]){
              System.out.println(findnum[i]+" at index: "+i);
              found=true;
            }
        }
        if(found==false){
            System.out.println("The number is not found");
        }
    }   
 }

