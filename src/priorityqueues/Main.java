package priorityqueues;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Adding elements in PriorityQueue
        priorityQueue.add(10);
        priorityQueue.add(5);
        priorityQueue.add(20);
        priorityQueue.add(8);

        // Getting and Removing Items
        System.out.println("Peek: " + priorityQueue.peek()); // Expected result: 20
        System.out.println("Poll: " + priorityQueue.poll()); // Expected result: 20
        System.out.println("Peek after poll: " + priorityQueue.peek()); // Expected result: 10

        // Adding new elements
        priorityQueue.add(3);
        priorityQueue.add(15);

        // Get and remove elements with priority after adding new elements
        System.out.println("Poll: " + priorityQueue.poll());
        System.out.println("Poll: " + priorityQueue.poll());

        // Checking queue size
        System.out.println("Size: " + priorityQueue.size());
    }
}
