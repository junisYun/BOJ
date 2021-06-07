import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int n, m, cnt;
    static int[][] graph;
    static boolean[] check;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new int[n + 1][n + 1];
        check = new boolean[n + 1];
        for(int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            graph[x][y] = graph[y][x] = 1;
        }
        cnt = 0;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(graph[i][j] == 1) {
                    cnt++;
                    bfs(i);
                }
            }
        }
        for(int i = 1; i <= n; i++) {
            if(!check[i]) {
                cnt++;
            }
        }
        System.out.println(n == 1 ? 1 : cnt);
    }
    public static void bfs(int a) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(a);
        check[a] = true;
        while(!q.isEmpty()) {
            int x = q.poll();
            for(int i = 1; i <= n; i++) {
                if(graph[x][i] == 1 ) {
                    check[i] = true;
                    graph[x][i] = 0;
                    q.offer(i);
                }
            }
        }
    }

}
