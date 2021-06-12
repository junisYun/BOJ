import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int size = Integer.MAX_VALUE;
        String[] word = new String[n];
        for(int i = 0; i < n; i++) {
            word[i] = sc.next();
            size = Math.min(size, word[i].length());
        }
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < word[0].length(); i++) {
            boolean flag = true;
            char ch = word[0].charAt(i);
            for(int j = 1; j < n; j++) {
                if(ch != word[j].charAt(i)) {
                    flag = false;
                    break;
                }
            }
            if(flag) answer.append(ch);
            else answer.append("?");
        }
        System.out.println(answer);
    }
}
