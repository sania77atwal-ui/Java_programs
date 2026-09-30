public class Counteven {
    static int evenCount(int n){
        int div;
        int count;
        if(n<10){
            if(n%2==0){
                return 1;
            }else{
                return 0;
            }
        }
        div=n%10;
        int result=evenCount(n/10);
        if(div%2==0){
            return 1+ result;
        }else{
            return result;
        }
    }
    public static void main(String[] args) {
        System.out.println(evenCount(1234));
    }
}
