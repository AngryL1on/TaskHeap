package personaltask;

public class PersonalMain{
    public static void main(String[] args) {
        PersonalHeap<Integer> personalHeap = new PersonalHeap<>();

        personalHeap.add(10);
        personalHeap.add(5);
        personalHeap.add(20);
        personalHeap.add(8);

        System.out.println("Peek: " + personalHeap.peek());
        System.out.println("Size of heap: " + personalHeap.size());
    }
}
