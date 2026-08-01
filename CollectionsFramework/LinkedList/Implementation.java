package LinkedList;
import java.util.*;
class Implementation {
    
    public static void main(String[] args) {
        
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        System.out.println(list.contains(20));


        // iterator 
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
           System.out.println("Element : "+it.next());
        }

    }
}
