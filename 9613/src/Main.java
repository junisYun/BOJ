import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            long sum = 0;
            for(int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            for(int j = 0; j < n - 1; j++) {
                for(int k = j + 1; k < n; k++) {
                    sum += gcd(arr[j], arr[k]);
                }
            }
            System.out.println(sum);
        }
    }
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
