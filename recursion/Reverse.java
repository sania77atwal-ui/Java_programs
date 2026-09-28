public class Reverse{
    static int numReverse(int n, int reverse){
        int div;
        if(n==0){
            return reverse;
        }
        div=n%10;
        reverse=reverse*10+div;
        return numReverse(n/10, reverse);
    }
public static void main(String[] args) {
    System.out.println(numReverse(12345,0));
}
}