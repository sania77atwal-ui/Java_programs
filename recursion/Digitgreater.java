public class Digitgreater {
    static int greaterthanfive(int n){
        if(n==0){
            return n;
        }
        int div=n%10;
        int result=greaterthanfive(n/10);
        if(div>5){
            return 1+result;
        }else{
            return result;
        }
    }
    public static void main(String[] args) {
        System.out.println(greaterthanfive(1425));
    }
}
