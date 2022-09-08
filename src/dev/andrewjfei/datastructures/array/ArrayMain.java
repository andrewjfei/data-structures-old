package dev.andrewjfei.datastructures.array;

public class ArrayMain {

    public static void main(String[] args) {
        DynamicArray<Integer> dynamicArray = new DynamicArray<>(Integer.class);

        System.out.println("Initial dynamic array: " + dynamicArray);

        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);
        dynamicArray.add(4);
        dynamicArray.add(5);

        System.out.println("Added dynamic array: " + dynamicArray);
        System.out.println("Added dynamic array size: " + dynamicArray.size());
        System.out.println("Added dynamic array index 3: " + dynamicArray.get(3));

        dynamicArray.insert(3, 40);

        System.out.println("Inserted dynamic array: " + dynamicArray);
        System.out.println("Inserted dynamic array size: " + dynamicArray.size());

        dynamicArray.remove(1);

        System.out.println("Deleted dynamic array: " + dynamicArray);
        System.out.println("Deleted dynamic array size: " + dynamicArray.size());

        try {
            dynamicArray.remove(5);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        }

    }
}
