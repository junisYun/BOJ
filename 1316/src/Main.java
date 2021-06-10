import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int answer = 0;
        for(int i = 0; i < n; i++) {
            boolean[] check = new boolean[26];
            String s = sc.next();
            check[s.charAt(0) - 97] = true;
            boolean sw = true;
            for(int j = 1; j < s.length(); j++) {
                if(s.charAt(j) != s.charAt(j - 1)) {
                    if(!check[s.charAt(j) - 97]) {
                        check[s.charAt(j) - 97] = true;
                    } else {
                        sw = false;
                        break;
                    }
                }
                else {
                    check[s.charAt(j) - 97] = true;
                }
            }
            if(sw) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
