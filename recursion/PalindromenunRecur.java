
public class PalindromenunRecur {
    static boolean palindro(int n){

    int original = n;

    int reverse = Reverse.numReverse(n, 0);

    if (original==reverse) {
        return true;
    } else {
        return false;
    }
        
    }
    public static void main(String[] args) {
        System.out.println(palindro(12321));
    }
}
