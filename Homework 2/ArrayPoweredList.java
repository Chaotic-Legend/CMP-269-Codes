// CMP 269: Programming Methods III - Homework 2 - @author Isaac D. Hoyos

import java.util.Arrays;

public class ArrayPoweredList<I extends Comparable<? super I>> implements ListInterface<I> {

    private I[] array;
    private int size;
    private static final int INITIAL_CAPACITY = 10;
    @SuppressWarnings("unchecked")
    public ArrayPoweredList() {
        array = (I[]) new Comparable[INITIAL_CAPACITY];
        size = 0;
    }

    @SuppressWarnings("unchecked")
    private void ensureCapacity() {
        if (size >= array.length) {
            I[] newArray = (I[]) new Comparable[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
    }

    @Override
    public ListInterface<I> copy() {
        ArrayPoweredList<I> copy = new ArrayPoweredList<>();
        for (int i = 0; i < size; i++) {copy.add(array[i]);}
        return copy;
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
        ensureCapacity();
        array[size++] = element;
    }

    @Override
    public void add(I element, int index) throws IndexOutOfBoundsException {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException("Error: Invalid Index.");
        ensureCapacity();
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = element;
        size++;
    }

    @Override
    public I get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Error: Invalid Index.");
        return array[index];
    }

    @Override
    public I replace(I element, int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Error: Invalid Index.");
        I old = array[index];
        array[index] = element;
        return old;
    }

    @Override
    public I remove(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Error: Invalid Index.");
        I removed = array[index];
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        array[--size] = null;
        return removed;
    }

    @Override
    public void removeAll() {
        Arrays.fill(array, 0, size, null);
        size = 0;
    }
}