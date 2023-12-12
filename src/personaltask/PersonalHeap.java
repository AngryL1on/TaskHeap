package personaltask;

import java.util.Arrays;
import java.util.Collections;

public class PersonalHeap<E>{
    private Object[] heap;
    private int size;
    private static final int DEFAULT_CAPACITY = 1;

    public PersonalHeap() {
        heap = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public void add( E element ) {
        ensureCapacity();
        heap[size] = element;
        size++;
        Arrays.sort(heap);
        Collections.reverse(Arrays.asList(heap));
    }

    public void ensureCapacity() {
        if (size == heap.length) {
            heap = Arrays.copyOf(heap, heap.length + 1);
        }
    }

    public E peek() {
        if (heap.length == 0) {
            return null;
        }
        return (E) heap[0];
    }

    public int size() {
        return size;
    }

    public boolean contains(E element) {
        for(var i: heap) {
            if (i.equals(element)) {
                return true;
            }
        }
        return false;
    }
}
