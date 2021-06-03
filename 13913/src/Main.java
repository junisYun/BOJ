import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int n, k;
    static int[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        visited = new int[100001];
        System.out.println(bfs(n, k));

    }

    public static int bfs(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        visited[n] = 1;
        q.offer(n);

        while(!q.isEmpty()) {
            int pos = q.poll();
            System.out.print(pos + " ");
            for(int i = 0; i < 3; i++) {
                int nPos;
                if(i == 0) {
                    nPos = pos - 1;
                } else if (i == 1) {
                    nPos = pos + 1;
                } else {
                    nPos = pos * 2;
                }
                if(nPos >= 0 && visited[nPos] == 0) {
                    q.offer(nPos);
                    visited[nPos] = visited[pos] + 1;
                    if(nPos == k) {
                        return visited[nPos] - 1;
                    }
                }
            }
        }
        return -1;
    }
}
