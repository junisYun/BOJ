import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int F, S, G, U, D;
    static int[] floor;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        F = sc.nextInt();
        S = sc.nextInt();
        G = sc.nextInt();
        U = sc.nextInt();
        D = sc.nextInt();
        floor = new int[F + 1];
        if(U == 0) {
            if()
        }
        bfs(S, G);
    }
    public static void bfs(int s, int e) {
        Queue<Integer> Q = new LinkedList<>();
        Q.offer(s);
        while(!Q.isEmpty()) {
            int x = Q.poll();
            int nx = 0;
            for(int i = 0; i < 2; i++) {
                if(i == 0) {
                    nx = x + U;
                } else if(i == 1) {
                    nx = x - D;
                }
                if(nx >= 1 && nx <= F) {
                    floor[nx] = floor[x] + 1;
                    Q.offer(nx);
                    if(nx == e) {
                        System.out.println(floor[nx]);
                        return;
                    }
                }
            }
        }
        System.out.println("use the stairs");
    }
}
