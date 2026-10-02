public class SumGreaterthanfive {
    static int sum(int n){
        if(n==0){
            return n;
        }
        int div=n%10;
        int result=sum(n/10);
        if(div>5){
            return div+result;
        }else{
            return result;
        }
    }
    public static void main(String[] args) {
        System.out.println(sum(14586));
    }
}
