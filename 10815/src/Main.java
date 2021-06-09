import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[] card;
    static int n, m;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        card = new int[n];
        for(int i = 0; i < n; i++) {
            card[i] = sc.nextInt();
        }
        Arrays.sort(card);

        m = sc.nextInt();
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < m; i++) {
            int num = sc.nextInt();
            if(binarySearch(num)) {
                answer.append(1).append(" ");
            } else answer.append(0).append(" ");
        }
        System.out.println(answer);
    }
    public static boolean binarySearch(int a) {
        int pl = 0;
        int pr = n - 1;
        while(pl <= pr) {
            int pc = (pl + pr) / 2;
            if(card[pc] < a) {
                pl = pc + 1;
            } else if(card[pc] > a) {
                pr = pc - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
