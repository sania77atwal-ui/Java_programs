public class Countdown{
    static void printdown(int n){
        if(n==0){
            return;
        }
       // System.out.println(n);
        printdown(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        printdown(5);
    }
}