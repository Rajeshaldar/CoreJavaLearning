package queue.priorityQueue;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue<>();
        
        pq.add(10);
        pq.add(20);
        pq.add(5);
        pq.add(10);
        pq.add(5);
        pq.add(1);
        pq.add(100);
        pq.add(50);
       
        System.out.println(pq);
        
        pq.add(4);
        System.out.println(pq);
    }
}
