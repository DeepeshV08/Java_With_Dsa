public class MathApi {
    
    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;
        System.out.println("MAX value");
        System.out.println(Math.max(a,b));
        System.out.println("Min Value");
        System.out.println(Math.min(a, b));

        float f = 10.44f;
        System.out.println("Floor");
        System.out.println(Math.floor(f));
        System.out.println("Ceil");
        System.out.println(Math.ceil(f));

        double d = 19.8999999;
        System.out.println("Rounded Value");
        System.out.println(Math.round(d));

        int i = 25;
        System.out.println("SQRT");
        System.out.println(Math.sqrt(i));

        int j = 10;
        int k = 3;
        System.out.println("Power");
        System.out.println(Math.pow(j, k));

        int l = -20;
        System.out.println("ABS value");
        System.out.println(Math.abs(l));
    }
}
