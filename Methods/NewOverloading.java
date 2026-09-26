public class NewOverloading {
    public static void main(String[] args) {
        System.out.println(show(5+2));
         System.out.println(show(5.2+3));
          System.out.println(show("Hello"));
          System.out.println(show('A'));
    }
    static int show(int x){
        return x;
    }
    static String show(String x){
        return x;
    }
    static double show(double x){
        return x;
    }

}
