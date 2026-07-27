public class OOPS_Day_2 {
    
    public static void main(String[] args) {
        
        Student s1 = new Student(1, 20, "Deepesh", 5);
        System.out.println(s1.id);
        System.out.println(s1.age);
        System.out.println(s1.name);
        System.out.println(s1.nos);

        s1.study();
        s1.sleep();
        s1.bunk();


        Student s2 = new Student(s1);
        System.out.println( s2.id);
        System.out.println(s2.age);
        System.out.println(s2.name);
        System.out.println(s2.nos);

        s2.study();
    }
}
