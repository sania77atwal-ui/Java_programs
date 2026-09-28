public class Largestdigit {
    static int bigdigit(int n){
        int div;
        int largest;
        if(n==0){
            return n;
        }
        div=n%10;
        largest=bigdigit(n/10);  //12345/10=>1234
        if(largest<div){
            return div;
        }else{
            return largest;
        }
    }
    public static void main(String[] args) {
        System.out.println(bigdigit(12345));
    }
}
