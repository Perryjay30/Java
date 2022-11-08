package Exercise16_18;

import java.util.Collections;

public class PriorityQueue {
    public static void main(String[] args) {
        java.util.PriorityQueue<Double> queue = new java.util.PriorityQueue<>(Collections.reverseOrder());

        queue.offer(9.8);
        queue.offer(5.4);
        queue.offer(3.2);


        System.out.println("Polling from queue: ");
        while(queue.size() > 0) {
            System.out.printf("%.1f ", queue.peek());
            queue.poll();

        }
    }
}
