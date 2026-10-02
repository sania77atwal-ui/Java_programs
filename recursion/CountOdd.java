public class CountOdd {
    static int digitodd(int n){
        int div;
        if(n<10){
            if(n%2!=0){
                return 1;
            }else{
                return 0;
            }
        }
        div=n%10;
        int result=digitodd(n/10);
        if(div%2!=0){
            return 1+result;
        }else{
            return result;
        }
    }
    public static void main(String[] args) {
        System.out.println(digitodd(12345));
    }
}
