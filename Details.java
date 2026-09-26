import java.util.Scanner;

public class Details {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //input
        System.out.print("Name: ");
        String name= sc.next();
        System.out.print("Age: ");
        int age=sc.nextInt();
        System.out.print("City: ");
        String city=sc.next();
        System.out.print("Course: ");
        String course=sc.next();

        //output
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("City: "+city);
        System.out.println("Course: "+course);
    }
}
