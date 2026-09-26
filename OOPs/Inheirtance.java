 class Animal {
    String name;
    void eat(){
        System.out.println("Animal eat");
    }
    void sleep(){
        System.out.println("animal sleep in open");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println(name+" Dog barks");
    }
}
public class Inheirtance {
  public static void main(String[] args) {
    Dog d1= new Dog();
    d1.name="Tommy";
    d1.bark();
    d1.eat();
    d1.sleep();
  }
    
}
