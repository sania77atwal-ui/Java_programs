import java.util.Scanner;

public class GreaternumArray {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.print("How many:");
          int size=sc.nextInt();
          int []array3=new int[size];

          //input 
        for(int i=0;i<size;i++){
            System.out.print("Enter the number: ");
            array3[i]=sc.nextInt();
        }
        System.out.print("Enter the value:");               //3
        int num=sc.nextInt();

        int result=CountGreater(array3, num);            //12345
        System.out.println("Result: "+result);

    }
    static int CountGreater(int []arrayy,int x){      //12345  ,3
        int count=0;
        for(int i=0;i<arrayy.length;i++){                   //5>3
            if(arrayy[i]>x){
                count++;
            }
        }
        return count;
    }
}
