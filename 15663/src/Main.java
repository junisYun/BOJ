import java.util.*;

public class Main {
    static int n, m;
    static int[] pm, arr, check;
    static Set<String> set = new LinkedHashSet<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        pm = new int[m];
        check = new int[n];
        Arrays.sort(arr);


        dfs(0);
        for (String s : set) {
            System.out.println(s);
        }
    }
    public static void dfs(int L) {
        if(L == m) {
            StringBuilder str = new StringBuilder();
            for(int x : pm) {
                str.append(x).append(" ");
            }
            set.add(str.toString());
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
