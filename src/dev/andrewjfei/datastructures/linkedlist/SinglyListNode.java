package dev.andrewjfei.datastructures.linkedlist;

public class SinglyListNode<T> {
    private T data;
    private SinglyListNode next;

    public SinglyListNode(T data) {
        this.data = data;
    }

    public SinglyListNode(T data, SinglyListNode next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public SinglyListNode getNext() {
        return next;
    }

    public void setNext(SinglyListNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "SinglyListNode{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
