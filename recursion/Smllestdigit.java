public class Smllestdigit {
    static int digitSmallest(int n){
        int div;
        if(n<10){
            return n; 
        }
        div=n%10;
        int smallest=digitSmallest(n/10);
        if(smallest>div){
            return div;
        }else{
            return smallest;
        }
    }
    public static void main(String[] args) {
        System.out.println(digitSmallest(4527));
    }
}
