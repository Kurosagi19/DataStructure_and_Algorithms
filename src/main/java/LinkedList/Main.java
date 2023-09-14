package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(8);
        linkedList.addFirst(10);
        linkedList.display();
        // Thêm giá trị 30 vào position 1
        linkedList.add(30, 1);
        linkedList.display();
        // Xoá
        linkedList.removeFirst();
        linkedList.display();
    }
}
