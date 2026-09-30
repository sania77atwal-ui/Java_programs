public class ProductofDigit {
    static int digitProduct(int n){
        int div;
        if(n==0){
            return 1;
        }
        div=n%10;
        return div*digitProduct(n/10);
    }
    public static void main(String[] args) {
        System.out.println(digitProduct(123));
    }
}
