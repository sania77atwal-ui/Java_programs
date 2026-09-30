public class CountSpecificnum {
    static int countNum(int n, int num){
        int div;
        if(n==0){
            return n;
        }
        div=n%10;        
        int result=countNum(n/10, num);
        if(div==num){          
            return 1+result;
        }else{
            return 0+result;
        }
    }
    public static void main(String[] args) {
        System.out.println(countNum(22222, 2));

    }
}
