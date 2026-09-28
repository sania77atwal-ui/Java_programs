public class CountSpecificnum {
    static int countNum(int n, int num){
        int div;
        if(n==0){
            return n;
        }
        div=n%10;
        countNum(n/10, num);
        if(div==num){
            return div;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        System.out.println(countNum(12345, 4));

    }
}
