import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n;
    static boolean flag;
    static int[] pm, check, compare;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        compare = new int[n];
        for(int i = 0; i < n; i++) {
            compare[i] = sc.nextInt();
        }
        pm = new int[n];
        check = new int[n];
        permutation(0);
        if(flag) System.out.println(-1);
    }
    public static void permutation(int L) {
        if(L == n) {
            if(flag) {
                flag = false;
                for(int x : pm) {
                    System.out.print(x + " ");
                } System.out.println();
            }
            if(Arrays.equals(pm, compare)) {
                flag = true;
            }
        } else {
            for(int i = 0; i < n; i++) {
                if(check[i] == 0) {
                    check[i] = 1;
                    pm[L] = i + 1;
                    permutation(L + 1);
                    check[i] = 0;
                }
            }
        }
    }
}
