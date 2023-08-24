import java.math.BigInteger;
import java.util.Scanner;

public class giaiThua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Nhap n: ");
            int n = Integer.parseInt(sc.nextLine());
            if(n < 0 | n > 1000) {
                throw new Exception("Sai dieu kien !");
            }
            BigInteger t = BigInteger.ONE;
//            long t = 1;
            for (int i = 1; i <= n; i++) {
                t = t.multiply(BigInteger.valueOf(i));
//                t = t * i;
            }
            System.out.println("Giai thua cua " + n + " la: " + t.toString());
        } catch(Exception e) {
            System.out.println("Loi" + e);
        }
        sc.close();
    }
}
