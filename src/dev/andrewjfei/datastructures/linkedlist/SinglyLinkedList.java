package dev.andrewjfei.datastructures.linkedlist;

public class SinglyLinkedList<T> {
    private SinglyListNode<T> head;
    private SinglyListNode<T> tail;
    private int size;

    public SinglyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    // Access O(n)
    public SinglyListNode get(T t) {
        SinglyListNode<T> current = head;

        while (current != null) {
            if (current.getData().equals(t)) {
                return current;
            }
            current = current.getNext();
        }

        return null;
    }

    // Search O(n)
    public boolean contains(T t) {
        SinglyListNode<T> current = head;

        while (current != null) {
            if (current.getData().equals(t)) {
                return true;
            }
            current = current.getNext();
        }

        return false;
    }

    // Insert O(n)
    public void insert(int index, T t) { // 1 -> 2 -> 3 -> 4
        SinglyListNode node = new SinglyListNode(t);

        if (index == 0) {
            node.setNext(head);
            head = node;
            size++;
            return;
        }

        int count = 0;
        SinglyListNode<T> current = head;

        while (current != null) {
            if (count + 1 >= size) {
                break;
            }

            if (count + 1 == index) {
                node.setNext(current.getNext());
                current.setNext(node);
                size++;
                return;
            }

            current = current.getNext();
            count++;
        }

        System.out.println("Outside of linked list length");
    }

    // Append O(1)
    public void add(T t) {
        SinglyListNode node = new SinglyListNode(t);

        if (head == null) {
            head = node;
        } else {
            tail.setNext(node);
        }

        tail = node;
        size++;
    }

    // Delete O(n)
    public void remove(T t) {
        SinglyListNode<T> current = head;
        SinglyListNode<T> previous = null;

        while (current != null) {
            if (current.getData().equals(t)) {
                if (previous == null) {
                    head = current.getNext();
                    size--;
                    return;
                }
                previous.setNext(current.getNext());
                size--;
                return;
            }
            previous = current;
            current = current.getNext();
        }

        System.out.println("No node found in list to delete");
    }

    @Override
    public String toString() {
        return "SinglyLinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                ", size=" + size +
                '}';
    }
}
