// CMP 269: Programming Methods III - Homework 2 - @author Isaac D. Hoyos

import java.util.Arrays;

@SuppressWarnings("unchecked")
public class StatisticsCalculator<I extends Number & Comparable<I>> implements StatisticsCalculatorInterface<I> {

    private I[] data;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public StatisticsCalculator() {
        data = (I[]) new Number[INITIAL_CAPACITY];
        size = 0;
    }

    private void ensureCapacity() {
        if (size >= data.length) {
            I[] newData = (I[]) new Number[data.length * 2];
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
    }

    @Override
    public void enter(I item) throws IllegalArgumentException {
        if (item == null) throw new IllegalArgumentException("Error: Null Item.");
        ensureCapacity();
        data[size++] = item;
    }

    @Override
    public void enter(I item, int index) throws IndexOutOfBoundsException, IllegalArgumentException {
        if (item == null) throw new IllegalArgumentException("Error: Null Item.");
        if (index < 0 || index > size) throw new IndexOutOfBoundsException("Error: Invalid Index.");
        ensureCapacity();
        System.arraycopy(data, index, data, index + 1, size - index);
        data[index] = item;
        size++;
    }

    @Override
    public void enterd(Object[] items) throws IllegalArgumentException {
        for (Object obj : items) {
            try {
                I item = (I) obj;
                enter(item);
            } 
            catch (ClassCastException e) {
                throw new IllegalArgumentException("Error: Invalid Item Type.");
            }
        }
    }

    @Override
    public I get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Error: Invalid Index.");
        return data[index];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int getCount() {
        return size;
    }

    @Override
    public I getSum() {
        if (size == 0) return null;
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += data[i].doubleValue();
        }
        return (I) Double.valueOf(sum);
    }

    @Override
    public double getMean() throws ArithmeticException {
        if (size == 0) throw new ArithmeticException("Error: Empty Dataset.");
        return getSum().doubleValue() / size;
    }

    @Override
    public double getStandardDeviation() throws ArithmeticException {
        if (size < 2) throw new ArithmeticException("Error: Samll Dataset.");
        double mean = getMean();
        double sumSquares = 0;
        for (int i = 0; i < size; i++) {
            double diff = data[i].doubleValue() - mean;
            sumSquares += diff * diff;
        }
        return Math.sqrt(sumSquares / (size - 1));
    }

    @Override
    public Object[] getData() {
        return Arrays.copyOf(data, size);
    }

    @Override
    public I remove(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Error: Invalid Index.");
        I removed = data[index];
        System.arraycopy(data, index + 1, data, index, size - index - 1);
        data[--size] = null;
        return removed;
    }

    @Override
    public I remove(I item) throws IllegalArgumentException {
        if (item == null) throw new IllegalArgumentException("Error: Null Item.");
        for (int i = 0; i < size; i++) {
            if (data[i].equals(item)) {
                return remove(i);
            }
        }
        return null;
    }

    @Override
    public void clear() {
        Arrays.fill(data, 0, size, null);
        size = 0;
    }

    @Override
    public I getMin() throws IllegalArgumentException {
        if (size == 0) throw new IllegalArgumentException("Error: Empty Dataset.");
        I min = data[0];
        for (int i = 1; i < size; i++) {
            if (data[i].compareTo(min) < 0) min = data[i];
        }
        return min;
    }

    @Override
    public I getMax() throws IllegalArgumentException {
        if (size == 0) throw new IllegalArgumentException("Error: Empty Dataset.");
        I max = data[0];
        for (int i = 1; i < size; i++) {
            if (data[i].compareTo(max) > 0) max = data[i];
        }
        return max;
    }

    @Override
    public double getRange() throws IllegalArgumentException {
        if (size == 0) throw new IllegalArgumentException("Error: Empty Dataset.");
        return getMax().doubleValue() - getMin().doubleValue();
    }
}