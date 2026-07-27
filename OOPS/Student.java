public class Student {
    
    // Attributes / State
    private int id;
    private int age;
    private String name;
    private int nos;
    private String gf;

    // default constructor
    public Student(){
        System.out.println("Student Default Constructor Called.");
    }

    // paramterised constructor
    public Student(int id , int age , String name , int nos, String gf){
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
        this.gf = gf;
    }

    // Copy constructor
    public Student(Student scrob){
        this.id = scrob.id;
        this.age = scrob.age;
        this.name = scrob.name;
        this.nos = scrob.nos;
    }

    // public method to access private data
    public String getName(){
        return this.name;
    }
    public int getId(){
        return this.id;
    }
    public int getAge(){
        return this.age;
    }
    public int getNOS(){
        return this.nos;
    }

    // public mehtod used to set data
    public void setAge(int age){
        this.age = age;
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
    private void gfChatting(){
        System.out.println(name + " Chatting");
    }
}
