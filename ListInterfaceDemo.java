package program1;

import java.util.*;

public class ListInterfaceDemo {
    public static void main(String[] args) {

        // Creating Lists
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        System.out.println("=== ArrayList Demonstrations ===");

        // 1. Adding elements
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        System.out.println("After adding elements: " + arrayList);

        // 2. Add at specific index
        arrayList.add(1, "Mango");
        System.out.println("After adding Mango at index 1: " + arrayList);

        // 3. Add multiple elements
        arrayList.addAll(Arrays.asList("Grape", "Pineapple"));
        System.out.println("After adding multiple elements: " + arrayList);

        // 4. Access element
        System.out.println("First fruit: " + arrayList.get(0));

        // 5. Update element
        arrayList.set(1, "Kiwi");
        System.out.println("After updating index 1 to Kiwi: " + arrayList);

        // 6. Remove elements
        arrayList.remove("Orange");
        arrayList.remove(0);
        System.out.println("After removing elements: " + arrayList);

        // 7. Search
        System.out.println("Contains Kiwi? " + arrayList.contains("Kiwi"));
        System.out.println("Index of Grape: " + arrayList.indexOf("Grape"));

        // 8. Size
        System.out.println("List size: " + arrayList.size());

        // 9. For-each loop
        System.out.println("\nIterating using for-each loop:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        // 10. Iterator
        System.out.println("\nIterating using Iterator:");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 11. Sorting
        Collections.sort(arrayList);
        System.out.println("After sorting: " + arrayList);

        // 12. SubList
        List<String> subList = arrayList.subList(0, 2);
        System.out.println("Sublist (0-2): " + subList);

        // 13. Clear
        arrayList.clear();
        System.out.println("After clearing: " + arrayList);

        // ================= LinkedList =================
        System.out.println("\n=== LinkedList Demonstrations ===");

        LinkedList<String> fruits = new LinkedList<>();
        fruits.addFirst("Apple");
        fruits.addLast("Banana");
        fruits.add("Orange");

        System.out.println("LinkedList: " + fruits);
        System.out.println("First element: " + fruits.getFirst());
        System.out.println("Last element: " + fruits.getLast());

        fruits.removeFirst();
        fruits.removeLast();

        System.out.println("After removing first and last: " + fruits);
    }
}