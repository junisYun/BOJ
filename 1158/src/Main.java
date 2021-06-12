import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();
        solution(n, k);
    }
    public static void solution(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i <= n; i++) {
            q.offer(i);
        }
        ArrayList<Integer> answer = new ArrayList<>();
        int cnt = 1;
        while(!q.isEmpty()) {
            if(cnt == k) {
                answer.add(q.poll());
                cnt = 1;
            } else {
                q.offer(q.poll());
                cnt++;
            }
        }
        System.out.print("<");
        for(int i = 0; i  < answer.size(); i++) {
            if(i == answer.size() - 1) {
                System.out.print(answer.get(i));
            } else {
                System.out.print(answer.get(i) + ", ");
            }
        } System.out.println(">");
    }
}
