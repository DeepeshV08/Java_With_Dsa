public class Student {
    
    // Attributes / State
    public int id;
    public int age;
    public String name;
    public int nos;

    // default constructor
    public Student(){
        System.out.println("Student Default Constructor Called.");
    }

    // paramterised constructor
    public Student(int id , int age , String name , int nos){
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
    }

    // Copy constructor
    public Student(Student scrob){
        this.id = scrob.id;
        this.age = scrob.age;
        this.name = scrob.name;
        this.nos = scrob.nos;
    }
    // methods / behaviours
    public void study(){
        System.out.println(name + " is Studing");
    }
    public void sleep(){
        System.out.println(name + " is Sleeping");
    }
    public void bunk(){
        System.out.println(name + " is Bunking");
    }
}
