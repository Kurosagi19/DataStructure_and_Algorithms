package LinkedList;

public class Node {
    private int data;
    private Node next; // tham chiếu

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return String.valueOf(this.data);
    }
}