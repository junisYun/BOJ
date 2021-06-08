import java.util.Scanner;

public class Main {
    public static int[][] graph;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++) {
            int V = sc.nextInt();
            int E = sc.nextInt();
            graph = new int[V + 1][V + 1];
            for(int j = 0; j < E; j++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                graph[x][y] = graph[y][x] = 1;
            }

        }
    }
}
