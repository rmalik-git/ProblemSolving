package tree.heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MaxHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(2);
        pq.add(3);
        pq.add(15);

        System.out.println("Priority queue size is " + pq.size());


        Integer searchKey = 2;

        if (pq.contains(searchKey)) {
            System.out.println("Priority queue contains " + searchKey + "\n");
        }


        pq.clear();

        if (pq.isEmpty()) {
            System.out.println("The queue is empty");
        }

        System.out.println("\nCalling remove operation on an empty heap");
        System.out.println("The element with the highest priority is " + pq.poll());

        System.out.println("\nCalling peek operation on an empty heap");
        System.out.println("The element with the highest priority is " + pq.peek() +
                System.lineSeparator());

        // again insert three integers
        pq.add(5);
        pq.add(4);
        pq.add(45);

        // construct an array containing all elements present in the queue
        Integer[] I = (Integer[]) pq.toArray();
        System.out.println("Printing array: " + Arrays.toString(I));

        System.out.println("\nThe element with the highest priority is " + pq.poll());
        System.out.println("The element with the highest priority is " + pq.peek());


    }
}
