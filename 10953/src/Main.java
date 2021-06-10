import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            String s = sc.next();
            String[] num = s.split(",");
            int sum = 0;
            for(String x : num) {
                sum += Integer.parseInt(x);
            }
            System.out.println(sum);
        }
    }
}
