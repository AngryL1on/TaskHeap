package heap;

/**
 * int size() – возвращает количество элементов в структуре
 * void add(E element) – добавляет элемент (внутри вызывайте вами рализованныйheapifyUp
 * E peek() – возвращает max элемент без удаления его
 * @param <E>
 */
public interface Heap<E extends Comparable<E>>{
    int size();

    void add(E element);

    E peek();
}
