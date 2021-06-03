import java.util.Scanner;

public class Main {
    static int n, m;
    static int[] pm;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        pm = new int[m];
        dfs(0);
        System.out.println(sb);

    }
    public static void dfs(int L) {
        if(L == m) {
            // println사용 : 출력량이 많을경우 계속 출력스트림을 비워줘야 하기때문에 시간 소요가 많아 시간 초과
            // StringBuilder 를 사용하여 값 저장 후 한번에 출력하는 방법 사용
            for(int i = 0; i < m; i++) {
                sb.append(pm[i] + " ");
            } sb.append('\n');
        } else {
            for(int i = 0; i < n; i++) {
                pm[L] = i + 1;
                dfs(L + 1);
            }
        }
    }
}