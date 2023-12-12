package personaltask;

import java.util.Random;

public class ClassComparisons{
    public static void main(String[] args) {
        PersonalHeap<Integer> personalHeap = new PersonalHeap<>();
        HeapOnTree<Integer> heapOnTree = new HeapOnTree<>();

        var random = new Random();

        // Recording metering
        var timeArrayStart = System.currentTimeMillis();
        for (int i = 0; i < 30000; i++) {
            personalHeap.add(random.nextInt(100));
        }
        System.out.println(System.currentTimeMillis() - timeArrayStart);

        var timeTreeStart = System.currentTimeMillis();
        for (int i = 0; i < 30000; i++) {
            heapOnTree.add(random.nextInt(100));
        }
        System.out.println(System.currentTimeMillis() - timeTreeStart);

        // Checking metering
        timeArrayStart = System.currentTimeMillis();
        System.out.println(personalHeap.contains(3000));
        System.out.println(System.currentTimeMillis() - timeArrayStart);

        timeTreeStart = System.currentTimeMillis();
        System.out.println(heapOnTree.contains(3000));
        System.out.println(System.currentTimeMillis() - timeTreeStart);
    }
}
