import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        for (int n = 1; n <= 10; n++) {
            int size = n * 100000;

            // ArrayList add and access
            long startTimeArrayListAdd = System.nanoTime();
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                arrayList.add(i);
            }
            long endTimeArrayListAdd = System.nanoTime();
            long durationArrayListAdd = endTimeArrayListAdd - startTimeArrayListAdd;

            long startTimeArrayListAccess = System.nanoTime();
            for (int i = 0; i < size; i++) {
                int element = arrayList.get(i);
            }
            long endTimeArrayListAccess = System.nanoTime();
            long durationArrayListAccess = endTimeArrayListAccess - startTimeArrayListAccess;

            // LinkedList add and access
            long startTimeLinkedListAdd = System.nanoTime();
            LinkedList<Integer> linkedList = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                linkedList.add(i);
            }
            long endTimeLinkedListAdd = System.nanoTime();
            long durationLinkedListAdd = endTimeLinkedListAdd - startTimeLinkedListAdd;

            long startTimeLinkedListAccess = System.nanoTime();
            for (int i = 0; i < size; i++) {
                int element = linkedList.get(i);
            }
            long endTimeLinkedListAccess = System.nanoTime();
            long durationLinkedListAccess = endTimeLinkedListAccess - startTimeLinkedListAccess;

            // HashSet add and access
            long startTimeHashSetAdd = System.nanoTime();
            HashSet<Integer> hashSet = new HashSet<>();
            for (int i = 0; i < size; i++) {
                hashSet.add(i);
            }
            long endTimeHashSetAdd = System.nanoTime();
            long durationHashSetAdd = endTimeHashSetAdd - startTimeHashSetAdd;

            long startTimeHashSetAccess = System.nanoTime();
            for (int i = 0; i < size; i++) {
                boolean contains = hashSet.contains(i);
            }
            long endTimeHashSetAccess = System.nanoTime();
            long durationHashSetAccess = endTimeHashSetAccess - startTimeHashSetAccess;

            // HashMap add and access
            long startTimeHashMapAdd = System.nanoTime();
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            for (int i = 0; i < size; i++) {
                hashMap.put(i, i);
            }
            long endTimeHashMapAdd = System.nanoTime();
            long durationHashMapAdd = endTimeHashMapAdd - startTimeHashMapAdd;

            long startTimeHashMapAccess = System.nanoTime();
            for (int i = 0; i < size; i++) {
                int value = hashMap.get(i);
            }
            long endTimeHashMapAccess = System.nanoTime();
            long durationHashMapAccess = endTimeHashMapAccess - startTimeHashMapAccess;

            // Output results
            System.out.println("Size: " + size);
            System.out.println("ArrayList add time: " + durationArrayListAdd + " ns");
            System.out.println("ArrayList access time: " + durationArrayListAccess + " ns");
            System.out.println("LinkedList add time: " + durationLinkedListAdd + " ns");
            System.out.println("LinkedList access time: " + durationLinkedListAccess + " ns");
            System.out.println("HashSet add time: " + durationHashSetAdd + " ns");
            System.out.println("HashSet access time: " + durationHashSetAccess + " ns");
            System.out.println("HashMap add time: " + durationHashMapAdd + " ns");
            System.out.println("HashMap access time: " + durationHashMapAccess + " ns");
            System.out.println();
        }
    }
}
