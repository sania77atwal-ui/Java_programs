import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number:");
        int num= sc.nextInt();
        System.out.println("Enter how far want to print");
        int n=sc.nextInt();

        System.out.println("Table is given: ");
        for(int i=1;i<=n;i++){
            System.out.println(num+"x"+i+"="+num*i);
        }

    }
}
