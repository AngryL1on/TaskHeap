package priorityqueues;

/**
 * intsize() – возвращает количество элементов в структуре
 * void add(E element) – добавляет элемент
 * E peek() – возвращает max элемент без удаления его
 * E poll() – возвращает max элемент с удалением его
 * @param <E>
 */
public interface AbstractQueue<E extends Comparable<E>>{
    int size();

    void add(E element);

    E peek();

    E poll();
}
