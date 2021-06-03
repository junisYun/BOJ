import java.util.Scanner;

public class Main {
    static int n, m;
    static int[] cb;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        cb = new int[m];
        dfs(0, 1);
    }
    public static void dfs(int L, int s) {
        if(L == m) {
            for(int x : cb) {
                System.out.print(x + " ");
            } System.out.println();
        } else {
            for(int i = s; i <= n; i++) {
                cb[L] = i;
                dfs(L + 1, i);
            }
        }
    }
}
