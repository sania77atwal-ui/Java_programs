public class Countdigit {
    static int digitCount(int n){
        if(n==0){
            return 0;
        }
      
        return 1 + digitCount(n/10);

    }
    public static void main(String[] args) {
        System.out.println(digitCount(254));
    }
}
