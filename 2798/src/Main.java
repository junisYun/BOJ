// 조합으로 풀이
import java.util.Scanner;

public class Main {
    static int[] card, cb;
    static int n, m;
    static int answer = Integer.MIN_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        card = new int[n];
        cb = new int[3];
        for(int i = 0; i < n; i++) {
            card[i] = sc.nextInt();
        }
        combination(0, 0);
        System.out.println(answer);
    }
    public static void combination(int L, int s) {
        if(L == 3) {
            int sum = 0;
            for(int x : cb) {
                sum += x;
            }
            if(sum > m) return;
            answer = Math.max(answer, sum);
        } else {
            for(int i = s; i < n; i++) {
                cb[L] = card[i];
                combination(L + 1, i + 1);
            }
        }
    }
}
