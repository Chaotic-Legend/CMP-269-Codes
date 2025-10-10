// CMP 269: Programming Methods III - Homework 3 - @author Isaac D. Hoyos

// This class implements the ListInterface using a singly linked list.
// It uses LinkedListNode objects to store data and maintain connections.
public class LinkedList<I extends Comparable<? super I>> implements ListInterface<I> {
    private LinkedListNode<I> head;
    private int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    @Override
    public ListInterface<I> copy() {
        LinkedList<I> newList = new LinkedList<>();
        LinkedListNode<I> current = head;
        while (current != null) {
            newList.add(current.getElement());
            current = current.getNext();
        }
        return newList;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(I element) {
        if (element == null) throw new IllegalArgumentException("Error: Null Element.");
        LinkedListNode<I> newNode = new LinkedListNode<>(element);
        if (head == null) {
            head = newNode;
        } else {
            LinkedListNode<I> current = head;
            while (current.getNext() != null) current = current.getNext();
            current.setNext(newNode);
        }
        size++;
    }

    @Override
    public void add(I element, int index) throws IndexOutOfBoundsException {
        if (element == null) throw new IllegalArgumentException("Error: Null Element.");
        if (index < 0 || index > size) throw new IndexOutOfBoundsException("Error: Invalid Index: " + index);
        LinkedListNode<I> newNode = new LinkedListNode<>(element);
        if (index == 0) {
            newNode.setNext(head);
            head = newNode;
        } else {
            LinkedListNode<I> current = head;
            for (int i = 0; i < index - 1; i++) current = current.getNext();
            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }
        size++;
    }

    @Override
    public I get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Error: Invalid Index: " + index);
        LinkedListNode<I> current = head;
        for (int i = 0; i < index; i++) current = current.getNext();
        return current.getElement();
    }

    @Override
    public I replace(I element, int index) throws IndexOutOfBoundsException {
        if (element == null) throw new IllegalArgumentException("Error: Null Element.");
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Error: Invalid Index: " + index);
        LinkedListNode<I> current = head;
        for (int i = 0; i < index; i++) current = current.getNext();
        I oldElement = current.getElement();
        current.setElement(element);
        return oldElement;
    }

    @Override
    public I remove(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Error: Invalid Index: " + index);
        I removedElement;
        if (index == 0) {
            removedElement = head.getElement();
            head = head.getNext();
        } else {
            LinkedListNode<I> current = head;
            for (int i = 0; i < index - 1; i++) current = current.getNext();
            removedElement = current.getNext().getElement();
            current.setNext(current.getNext().getNext());
        }
        size--;
        return removedElement;
    }

    @Override
    public void removeAll() {
        head = null;
        size = 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        LinkedListNode<I> current = head;
        while (current != null) {
            sb.append(current.getElement());
            if (current.getNext() != null) sb.append(", ");
            current = current.getNext();
        }
        sb.append("]");
        return sb.toString();
    }
}