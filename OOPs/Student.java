public class Student{
    String name;
    int age;
    int marks;

    
    public static void main(String []args){
        Student s1= new Student();
        s1.name="Sania";
        s1.age=20;
        s1.marks=95;
        s1.display();
        
        Student s2= new Student();
        s2.name="Muskan";
        s2.age=21;
        s2.marks=85;
        s2.display();
       
    }
     void display(){
         System.out.println("The name is: " + name);
         System.out.println("The age is: " + age);
         System.out.println("The marks are: " + marks);
    }
}