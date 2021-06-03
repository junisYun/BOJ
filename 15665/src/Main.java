import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static int n, m;
    static int[] arr, pm;
    static Set<String> mySet = new LinkedHashSet<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        pm = new int[m];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        permutation(0);
        for(String s : mySet) {
            System.out.println(s);
        }
    }
    public static void permutation(int L) {
        if(L == m) {
            StringBuilder pmList = new StringBuilder();
            for(int x : pm) {
                pmList.append(x).append(" ");
            }
            mySet.add(pmList.toString());
        } else {
            for(int i = 0; i < n; i++) {
                pm[L] = arr[i];
                permutation(L + 1);
            }
        }
    }
}
