interface  Bird{
     void fly();

     void eat();
}

class Sparrow implements  Bird{

    public void fly(){
        System.out.println("sparrow flying");
    }
    public void eat(){
        System.out.println("sparrow eating");
    }
}
class Crow implements  Bird{

    public void fly(){
        System.out.println("Crow flying");
    }
    public void eat(){
        System.out.println("Crow eating");
    }
}
public class Main{

    public static void main(String[] args) {
        
        Bird b = new Sparrow();
        b.eat();
        b.fly();

        b = new Crow();
        b.eat();
        b.fly();;
    }
}