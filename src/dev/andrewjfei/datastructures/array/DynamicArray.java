package dev.andrewjfei.datastructures.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DynamicArray<T> {
    private Class<T> classT;
    private T[] dynamicArray;
    private int size; // Size of array

    public DynamicArray(Class<T> classT) {
        this.classT = classT;
        dynamicArray = (T[]) Array.newInstance(classT, 2);
        size = 0;
    }

    // Access O(1)
    public T get(int index) {
        validateIndex(index);
        return dynamicArray[index];
    }

    public int size() {
        return size;
    }

    // Search O(n)
    public boolean contains(T t) {
        for (int i = 0; i < size; i++) {
            if (dynamicArray[i].equals(t)) {
                return true;
            }
        }

        return false;
    }

    // Insert O(n)
    public void insert(int index, T t) {
        validateIndex(index);

        for (int i = size; i > index; i--) {
            dynamicArray[i] = dynamicArray[i - 1];
        }
        dynamicArray[index] = t;
        size++;

        validateArraySize();
    }

    // Append O(1), however, occasionally more work will need to be done
    public void add(T t) {
        dynamicArray[size] = t;
        size++;

        validateArraySize();
    }

    // Delete O(n)
    public void remove(int index) {
        validateIndex(index);

        for (int i = index; i < size - 1; i++) {
            dynamicArray[i] = dynamicArray[i + 1];
        }

        dynamicArray[size - 1] = null;
        size--;
    }

    @Override
    public String toString() {
        return "DynamicArray{" +
                "classT=" + classT +
                ", dynamicArray=" + Arrays.toString(dynamicArray) +
                ", size=" + size +
                '}';
    }

    private void validateIndex(int index) {
        if (index >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    private void validateArraySize() {
        if (size >= dynamicArray.length) {
            doubleArraySize();
        }
    }

    private void doubleArraySize() {
        T[] newDynamicArray = (T[]) Array.newInstance(classT, dynamicArray.length * 2);

        for (int i = 0; i < dynamicArray.length; i++) {
            newDynamicArray[i] = dynamicArray[i];
        }

        dynamicArray = newDynamicArray;
    }
}
