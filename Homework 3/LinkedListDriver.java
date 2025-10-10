// CMP 269: Programming Methods III - Homework 3 - @author Isaac D. Hoyos

public class LinkedListDriver {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        System.out.println("=== LINKED LIST TEST PROGRAM ===\n");

        System.out.println("Initial List: " + list);
        System.out.println("Is Empty? ➞ " + list.isEmpty());
        System.out.println();

        System.out.println("--- Adding Elements ---");
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("After adding 10, 20, 30: " + list);
        System.out.println();

        System.out.println("--- Inserting By Index ---");
        list.add(5, 0);
        list.add(25, 3);
        System.out.println("After adding 5 at index 0 and 25 at index 3: " + list);
        System.out.println();

        System.out.println("--- Accessing Elements ---");
        System.out.println("Element at index 2: " + list.get(2));
        System.out.println();

        System.out.println("--- Replacing Elements ---");
        System.out.println("Replacing element at index 1 with 15...");
        list.replace(15, 1);
        System.out.println("After Replacement: " + list);
        System.out.println();

        System.out.println("--- Removing Elements ---");
        System.out.println("Removing element at index 3...");
        list.remove(3);
        System.out.println("After Removal: " + list);
        System.out.println();

        System.out.println("--- Copying The List ---");
        ListInterface<Integer> copy = list.copy();
        System.out.println("Copy of current list: " + copy);
        System.out.println();

        System.out.println("--- Clearing The List ---");
        list.removeAll();
        System.out.println("After removing all elements: " + list);
        System.out.println("Is Empty? ➞ " + list.isEmpty());
        System.out.println();

        System.out.println("=== END OF TEST PROGRAM ===");
    }
}
