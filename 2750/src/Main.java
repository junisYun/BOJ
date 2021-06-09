import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> answer = new TreeSet<>();
        while(answer.size() < n) {
            int x = sc.nextInt();
            answer.add(x);
        }
        for(int x : answer) {
            System.out.println(x);
        }
    }
}
