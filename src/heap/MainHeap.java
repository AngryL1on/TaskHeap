package heap;

public class MainHeap {
    public static void main(String[] args) {
        MaxHeap<Integer> maxHeap = new MaxHeap<>();

        maxHeap.add(5);
        maxHeap.add(10);
        maxHeap.add(7);

        System.out.println("Size of the heap: " + maxHeap.size());
        System.out.println("Max element in the heap: " + maxHeap.peek());
    }
}
