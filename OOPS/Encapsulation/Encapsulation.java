public class Encapsulation {
    
    public static void main(String[] args) {
        
        Student s1 = new Student(1, 20, "Deepesh", 5, "Pata nhi konn hai");
        
        System.out.println(s1.getName());
        s1.setAge(25);
        System.out.println(s1.getAge());
    }
}
