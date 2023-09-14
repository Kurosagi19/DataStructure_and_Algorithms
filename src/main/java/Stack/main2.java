package Stack;

import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
    Stack s = new Stack(32);
    Scanner sc = new Scanner(System.in);
        System.out.println("n = ");
        int n = sc.nextInt();
        sc.close();
        int t; // Thương
        int r; // Số dư
        do {
            t = n /2;
            r = n % 2;
        } while (t != 0);

        // n sau khi đổi cơ số
        s.printStack();
    }
}
