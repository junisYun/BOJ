import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            pQ.add(x);
        }
        System.out.println(pQ.poll());
    }
}
