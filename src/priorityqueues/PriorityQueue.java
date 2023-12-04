package priorityqueues;

import java.util.ArrayList;
import java.util.Collections;

import static java.util.Collections.reverseOrder;

public class PriorityQueue<E extends Comparable<E>> implements AbstractQueue<E>{
    private final ArrayList<E> priQueue;

    public PriorityQueue() {
        this.priQueue = new ArrayList<>();
    }

    private boolean isEmpty() {
        return priQueue.isEmpty();
    }

    @Override
    public int size() {
        return priQueue.size();
    }

    @Override
    public void add(E element) {
        priQueue.add(element);
        priQueue.sort(reverseOrder());
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return priQueue.get(0);
    }

    @Override
    public E poll() {
        if (isEmpty()) {
            return null;
        }

        E maxElement = priQueue.get(0);
        int lastIndex = priQueue.size() - 1;
        Collections.swap(priQueue, 0, lastIndex);
        priQueue.remove(lastIndex);
        priQueue.sort(reverseOrder());

        return maxElement;
    }
}
