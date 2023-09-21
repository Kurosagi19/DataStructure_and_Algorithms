package LinkedList;

public class LinkedList {
    private Node head;
    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }
    // Thêm vào đầu LinkedList
    public void addFirst(int x) {
        // Bước 1: tạo node mới có data = x
        Node tmp = new Node(x);
        // Trỏ node mới -> node hiện tại
        tmp.setNext(head);
        // Gắn node hiện tại = tmp
        head = tmp;
        // Tăng size lên 1 đơn vị
        size ++;
    }
    // Thêm vào cuối LinkedList
    public void addLast(int x) {
        // Tạo node mới có data = x
        Node tmp = new Node(x);
        // Tạo ra node cuối -> cần tìm ra node cuối hiện tại
        // Node -> next = null
        Node lastNode = head;
        while(lastNode.getNext() != null) {
            lastNode = lastNode.getNext();
        }
        // Đã có node cuối
        lastNode.setNext(tmp);

        size++;
    }
    // Thêm vào giữa LinkedList
    public void add(int x, int position) {
        Node tmp = new Node(x);
        Node previousPositionNode = null;
        for (int i = 0; i <= position - 1; i++) {
            if (previousPositionNode == null) {
                previousPositionNode = head;
            } else {
                previousPositionNode = previousPositionNode.getNext();
            }
        }
        Node positionNode = previousPositionNode.getNext();
        previousPositionNode.setNext(tmp);
        tmp.setNext(positionNode);
        size++;
    }
    // Kiểm tra xem LinkedList có rỗng hay không
    public boolean isEmpty() {
        if(size == 0) return true;
        return false;
    }
    // Xoá ở đầu LinkedList
    public void removeFirst() {
        if(isEmpty()) {
            throw new RuntimeException("LinkedList is empty!");
        }
        // Lấy head hiện tại
        Node tmp = head.getNext();
        head.setNext(null);
        head = tmp;
        size--;
    }
    // Xoá ở cuối LinkedList
    public void removeLast() {
        if(isEmpty()) {
            throw new RuntimeException("LinkedList is empty!");
        }
        // Lấy ra vị trí gần cuối
        // Node.getNext().getNext() == null
        Node nearLastNode = head;
        while(nearLastNode.getNext().getNext() != null) {
            nearLastNode = nearLastNode.getNext();
        }
        nearLastNode.setNext(null);
        size--;
    }
    // Xoá ở giữa LinkedList
    public void remove(int position) {
        if(isEmpty()) {
            throw new RuntimeException("LinkedList is empty!");
        }
        if(position == 0) {
            removeFirst();
        } else if (position == size - 1) {
            removeLast();
        } else {
            Node previousNode = null;
            for(int j = 0; j <= position; j++) {
                if(previousNode == null) {
                    previousNode = head;
                } else {
                    previousNode = previousNode.getNext();
                }
            }
            Node currentNode = previousNode.getNext();
            Node nextNode = currentNode.getNext();

            previousNode.setNext(nextNode);
            currentNode.setNext(null);
            size--;
        }
    }

    // Hiển thị
    public void display() {
        Node tmp = null;
        System.out.println("LinkedList: ");
        for(int i = 0; i < size; i++) {
            if(tmp == null) {
                tmp = head;
            }
            System.out.print(tmp + "->");
            tmp = tmp.getNext();
        }
    }
}
