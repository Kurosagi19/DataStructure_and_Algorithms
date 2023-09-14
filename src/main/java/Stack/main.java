package Stack;

public class main {
    public static void main(String[] args) {
        Stack s1 = new Stack(10);
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(6);
        s1.printStack();

        s1.push(5);
        s1.push(8);
        s1.printStack();
    }
}
