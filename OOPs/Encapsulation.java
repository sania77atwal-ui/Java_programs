public class Encapsulation {
    private String name;
    private int age; 
    private int marks;

    // to set value
    void setName(String name) {
    this.name = name;
    }
    //to get value
    String getName(){
        return name;
    }
    void setAge(int age){
        if (age>=0 && age<=100) {
             this.age=age;
        }else{
            System.out.println("Invaild age");
        }
       
    }
    int getAge(){
        return age;
    }
    

    void setMarks(int marks){
        if (marks>=0 && marks<=100) {
           this.marks=marks;
        }else{
            System.out.println("Invaild marks");
        }
    }
    int getMarks(){
        return marks;
    }

    public static void main(String[] args) {
        Encapsulation e1= new Encapsulation();
        e1.setName("Sania");
        e1.setAge(-11);
        e1.setMarks(105);
       System.out.println(e1.getName());
       System.out.println(e1.getAge());
       System.out.println(e1.getMarks());
    }
}
