import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<String> name = new HashSet<>();
        int m = sc.nextInt();

        for(int i = 0; i < n; i++) {
            String s = sc.next();
            name.add(s);
        }
        ArrayList<String> answer = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            String s = sc.next();
            if(name.contains(s)) {
                answer.add(s);
            }
        }
        Collections.sort(answer);
        System.out.println(answer.size());
        for(String x : answer) {
            System.out.println(x);
        }
    }
}
