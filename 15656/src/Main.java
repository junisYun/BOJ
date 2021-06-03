import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n, m;
    static int[] pm, arr;
    static StringBuilder str = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        pm = new int[m];
        dfs(0);
        System.out.println(str);
    }
    public static void dfs(int L) {
        if(L == m) {
            for(int x : pm) {
                str.append(x).append(" ");
            } str.append("\n");
        } else {
            for(int i = 0; i < n; i++) {
                pm[L] = arr[i];
                dfs(L + 1);
            }
        }
    }
}
