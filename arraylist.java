package arraylist1;
import java.util.*;
public class arraylist {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        addElements(arrayList);
        addElements(linkedList);
        System.out.println("Initial ArrayList: " + arrayList);
        System.out.print("Initial LinkedList: " + linkedList);
        // 2. Adding element at specific index
        arrayList.add(1, "Grapes");
        linkedList.add(1, "Grapes");
        // 3. Adding multiple elements
        List<String> moreFruits = Arrays.asList("Pineapple", "Mango");
        arrayList.addAll(moreFruits);
        linkedList.addAll(moreFruits);
        // 4. Accessing elements
        System.out.println("Element at index 2 in ArrayList: " + arrayList.get(2));
        System.out.println("Element at index 2 in LinkedList: " + linkedList.get(2));
        // 5. Updating elements
        arrayList.set(0, "Strawberry");
        linkedList.set(0, "Strawberry");
        // 6. Removing elements
        arrayList.remove("Banana");
        linkedList.remove("Banana");
        // 7. Searching elements
        System.out.println("ArrayList contains Mango: " + arrayList.contains("Mango"));
        System.out.print("LinkedList contains Mango: " + linkedList.contains("Mango"));
        // 8. List size
        System.out.println("ArrayList size: " + arrayList.size());
        System.out.println("LinkedList size: " + linkedList.size());

        // 9. Iterating over list
        System.out.println("\nIterating ArrayList with for-each:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        System.out.println("\nIterating LinkedList with for-each:");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }
        // 10. Using Iterator
        System.out.println("\nArrayList using Iterator:");
        Iterator<String> arrayIterator = arrayList.iterator();
        while (arrayIterator.hasNext()) {
            System.out.println(arrayIterator.next());
        }
        System.out.println("\nLinkedList using Iterator:");
        Iterator<String> linkIterator = linkedList.iterator();
        while (linkIterator.hasNext()) {
            System.out.println(linkIterator.next());
        }
        // 11. Sorting
        Collections.sort(arrayList);
        Collections.sort(linkedList);
        System.out.println("\nSorted ArrayList: " + arrayList);
        System.out.println("Sorted LinkedList: " + linkedList);
        // 12. Sublist
        List<String> arraySublist = arrayList.subList(1, 3);
        List<String> linkedSublist = linkedList.subList(1, 3);
        System.out.println("ArrayList sublist (1 to 3): " + arraySublist);
        System.out.println("LinkedList sublist (1 to 3): " + linkedSublist);
        // 13. Clearing the list
        arrayList.clear();
        linkedList.clear();
        System.out.println("Cleared ArrayList: " + arrayList);
        System.out.println("Cleared LinkedList: " + linkedList);
    }
    public static void addElements(List<String> list) {
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
    }
}
