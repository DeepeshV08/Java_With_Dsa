public class main {
    public static void main(String[] args) {
        
        Circle c = new Circle();
        c.draw();
        doDrawingStuff(c);
        Rect r = new Rect();
        r.draw();
        Shape s = new Shape();
        doDrawingStuff(s);
    }
    public static void doDrawingStuff(Shape s){
        s.draw();
    }
}
