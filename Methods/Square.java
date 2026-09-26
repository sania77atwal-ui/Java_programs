import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        int square=SquareNum(num);
        System.out.println("The square of "+num+" is: "+square);
    }
    static  int SquareNum(int n){
        return n*n;
    }
}
