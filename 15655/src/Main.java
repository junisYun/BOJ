import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n, m;
    static int[] cb, arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        cb = new int[m];

        dfs(0, 0);
    }
    public static void dfs(int L, int s) {
        if(L == m) {
            for(int x : cb) {
                System.out.print(x + " ");
            } System.out.println();

        } else {
            for(int i = s; i < n; i++) {
                cb[L] = arr[i];
                dfs(L + 1, i + 1);
            }
        }
    }
}
