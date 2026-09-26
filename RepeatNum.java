import java.util.Scanner;

public class RepeatNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num= sc.nextInt();

        int temp=num;
        int reverse=0;
        int array[] = new int[10];
        while (temp>0) {
            int digit=temp%10; //1234535%10=5
          
            reverse=reverse*10+digit;          //5354321
              temp=temp/10;
        }
        while (reverse>0) {

            int digit1=reverse%10;
            reverse=reverse/10;

            if(array[digit1]==1){                 //{1,2,3,4,5,3,5}
                System.out.println(digit1);
                break;
            }else{
                array[digit1]=1;
            }
        }
    }
}
