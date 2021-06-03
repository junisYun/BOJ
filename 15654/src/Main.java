import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n, m;
    static int[] pm, check, arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        pm = new int[m];
        check = new int[n];
        arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        dfs(0);
    }
    public static void dfs(int L) {
        if(L == m) {
            for(int x : pm) {
                System.out.print(x + " ");
            } System.out.println();
        } else {
            for(int i = 0; i < n; i++) {
                if(check[i] == 0) {
                    check[i] = 1;
                    pm[L] = arr[i];
                    dfs(L + 1);
                    check[i] = 0;
                }
            }
        }
    }
}
