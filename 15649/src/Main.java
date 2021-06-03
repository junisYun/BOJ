import java.util.Scanner;

public class Main {
    static int n, m;
    static int[] arr, check;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[m];
        check = new int[n];
        dfs(0);
    }
    public static void dfs(int L) {
        if(L == m) {
            for(int x : arr) {
                System.out.print(x + " ");
            } System.out.println();
        } else {
            for(int i = 0; i < n; i++) {
                if(check[i] == 0) {
                    check[i] = 1;
                    arr[L] = i + 1;
                    dfs(L + 1);
                    check[i] = 0;
                }
            }
        }
    }
}
