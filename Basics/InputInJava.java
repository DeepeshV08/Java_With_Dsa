
import java.util.Scanner;

public class InputInJava {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Byte Value: ");
        byte b = sc.nextByte();
        System.out.println("Short Value: ");
        short s = sc.nextShort();
        System.out.println("Int Value: ");
        int i = sc.nextInt();
        System.out.println("Long Value: ");
        long l = sc.nextLong();

        System.out.println("Float Value: ");
        float f = sc.nextFloat();
        System.out.println("Double Value: ");
        double d = sc.nextDouble();

        sc.nextLine();
        System.out.println("String Value: ");
        String name = sc.nextLine();
        System.out.println("String Value: ");
        String first = sc.next();

        System.out.println("Char Value: ");
        char ch = sc.next().charAt(0);
        System.out.println("Boolean Value: ");
        boolean flag = sc.nextBoolean();

        sc.close();
    }
}
