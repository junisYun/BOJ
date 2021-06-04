import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, T;
        T = sc.nextInt();
        for(int i = 0; i < T; i++) {
            n = sc.nextInt();
            m = sc.nextInt();
            int gcd = gcd(n, m);
            int lcm = n * m / gcd;
            System.out.println(lcm);
        }
    }
    // 최대 공약수 (유클리드 호제법)
    public static int gcd(int n, int m) {
        int temp;
        do {
            temp = n % m;
            n = m;
            m = temp;
        } while(temp != 0);
        return n;
    }
}
