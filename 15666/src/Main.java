import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static int n, m;
    static int[] cb, arr;
    static Set<String> mySet = new LinkedHashSet<>();
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
        combination(0, 0);
        for(String s : mySet) {
            System.out.println(s);
        }
    }
    public static void combination(int L, int s) {
        if(L == m) {
            StringBuilder cbList = new StringBuilder();
            for(int x : cb) {
                cbList.append(x).append(" ");
            }
            mySet.add(cbList.toString());
        } else {
            for(int i = s; i < n; i++) {
                cb[L] = arr[i];
                combination(L + 1, i);
            }
        }
    }
}
