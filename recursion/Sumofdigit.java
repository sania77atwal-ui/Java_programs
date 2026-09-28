public class Sumofdigit{
    static int digitSum(int n){
        int div;
        if(n==0){
            return n;
        }
        div=n%10;
        return div +digitSum(n/10);
    }
    public static void main(String [] args){
        System.out.println(digitSum(12345));
    }
}