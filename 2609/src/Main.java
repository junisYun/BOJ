import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int gcd = gcd(n, m);
        int lcm = lcm(n, m, gcd);
        System.out.println(gcd);
        System.out.println(lcm);

    }
    public static int gcd(int n, int m) {
        int temp;
        do{
            temp = n % m;
            n = m;
            m = temp;
        } while(temp != 0);
        return n;
    }
    public static int lcm(int n, int m, int gcd) {
        return n * m / gcd;
    }
}
