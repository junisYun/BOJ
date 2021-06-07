import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Pos {
    int x, y;
    public Pos(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Main {
    static int h, w;
    static int[][] land;
    static int[] dx = {0, 1, 1, 1, 0, -1, -1, -1};
    static int[] dy = {1, 1, 0, -1, -1, -1, 0, 1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            w = sc.nextInt();
            h = sc.nextInt();
            if(w == 0 && h == 0) break;
            land = new int[h][w];
            for(int i = 0; i < h; i++) {
                for(int j = 0; j < w; j++) {
                    land[i][j] = sc.nextInt();
                }
            }
            int cnt = 0;
            for(int i = 0; i < h; i++) {
                for(int j = 0; j < w; j++) {
                    if(land[i][j] == 1) {
                        cnt++;
                        bfs(i, j);
                    }
                }
            }
            System.out.println(cnt);
        }
    }
    public static void bfs(int a, int b) {
        Queue<Pos> Q = new LinkedList<>();
        Q.offer(new Pos(a, b));
        land[a][b] = 0;

        while(!Q.isEmpty()) {
            Pos p = Q.poll();
            int x = p.x;
            int y = p.y;
            for(int i = 0; i < 8; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if(nx >= 0 && nx < h && ny >= 0 && ny < w) {
                    if(land[nx][ny] == 1) {
                        land[nx][ny] = 0;
                        Q.offer(new Pos(nx, ny));
                    }
                }
            }
        }
    }
}
