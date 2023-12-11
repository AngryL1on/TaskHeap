package heap;

import java.util.Stack;

import static java.util.Collections.reverseOrder;

public class MaxHeap <E extends Comparable<E>> implements Heap<E> {
    private Stack<E> heap;

    public MaxHeap() {
        this.heap = new Stack<>();
    }
    private boolean isEmpty() {
        return heap.isEmpty();
    }

    @Override
    public int size() {
        return heap.size();
    }

    @Override
    public void add(E element) {
        heap.add(element);
        heap.sort(reverseOrder());
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return heap.get(0);
    }
}
