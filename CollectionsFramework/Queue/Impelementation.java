package Queue;

import java.util.*;
public class Impelementation {
    
    public static void main(String[] args) {
        

        Queue<Integer> q1 = new ArrayDeque<>();
        Queue<Integer> q2 = new LinkedList<>();
        Queue<Integer> q3 = new PriorityQueue<>();

        q1.offer(10);
        q1.offer(20);
        q1.offer(30);
        System.out.println(q1);
        System.out.println(q1.poll());
        System.out.println(q1);
        System.out.println(q1.peek());
        
    }
}
