package personaltask;

import java.util.TreeSet;

public class HeapOnTree<E>{
    private TreeSet<E> heap;

    public HeapOnTree() {
        this.heap = new TreeSet<>();
    }
    private boolean isEmpty() {
        return heap.isEmpty();
    }

    public int size() {
        return heap.size();
    }

    public void add(E element) {
        heap.add(element);
    }

    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return heap.last();
    }

    public boolean contains(E element) {
        return heap.contains(element);
    }
}
