public class Construct {
    int age;
    int marks;
    String name;

    Construct(){
        //  System.out.println("Default constructor called");
          this.age=0;
          this.marks=0;
          this.name="Unknown";
    }
    Construct( int age,int marks,String name){
        this.age=age;
        this.marks=marks;
        this.name=name;

    }
    public static void main(String[] args) {
        Construct c1= new Construct();
        Construct c2=new Construct(21,67,"Muskan");
        c1.display();
        c2.display();
        
    }
    void display(){
        System.out.println("The name is: " + name);
        System.out.println("The age is: " + age);
        System.out.println("The marks are: " + marks);
    }
}
