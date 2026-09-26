import java.util.*;
public class Overloading {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("The multiply of numbers: "+multiply(2,4));
        System.out.println("The multiply of numbers: "+multiply(2.5,2.5));
    }
    static int multiply(int x, int y){
        return x*y;
    }
    static double multiply(double x, double y){
        return x*y;
    }
}
