public class SumofEven {
    static int evenSum(int n){
        if (n<10) {
            if(n%2==0){
                return n;
            }else{
                return 0;
            }
        }
        int div=n%10;
        int result=evenSum(n/10);
        if(div%2==0){
            return div+result;
        }else{
            return result;
        }
    }
    public static void main(String[] args) {
        System.out.println(evenSum(1245));
    }
}
