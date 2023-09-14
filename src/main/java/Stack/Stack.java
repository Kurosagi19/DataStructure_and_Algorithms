package Stack;

public class Stack {
    private int arr[];
    private int top;
    private int capacity;

    // Khai báo constructor
    public Stack(int capacity) {
        this.arr = new int[capacity];
        this.top = -1;
        this.capacity = capacity;
    }

    // Kiểm tra xem Stack có rỗng hay không
    public boolean isEmpty() {
        if(top == -1) return true;
        return false;
    }

    // Kiểm tra xem Stack có đầy hay không
    public boolean isFull() {
        if(top == capacity - 1) {
            return true;
        }
        return false;
    }

    // Push ?
    public void push(int x) {
        if(isFull()) {
            throw new RuntimeException("Stack is full!");
        }
        top = top + 1;
        arr[top] = x;
    }

    // Pop ?
    public int pop() {
        if(isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        int t = arr[top];
        top = top - 1;
        return t;
    }

    // Peek
    public int peek() {
        if(isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return arr[top];
    }

    // Print Stack
    public void printStack() {
        System.out.println("Stack: ");
        for(int i = top; i >= 0; i--) {
            System.out.println(arr[i] + "\t");
        }
        System.out.println();
    }
}
