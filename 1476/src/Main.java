import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int E, S, M;
        E = sc.nextInt();
        S = sc.nextInt();
        M = sc.nextInt();
        int e = 1, s = 1, m = 1;
        int year = 1;
        while (true) {
            if (E == e && S == s && M == m) {
                break;
            }
            year++;
            e++;
            s++;
            m++;

            if (e == 16) e = 1;
            if (s == 29) s = 1;
            if (m == 20) m = 1;
        }
        System.out.println(year);
    }
}
