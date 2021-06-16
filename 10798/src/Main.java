import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] word = new char[5][15];
        int maxLen = Integer.MIN_VALUE;
        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < 5; i++) {
            String s = sc.next();
            maxLen = Math.max(maxLen, s.length());
            for(int j = 0; j < s.length(); j++) {
                word[i][j] = s.charAt(j);
            }
        }
        for(int i = 0; i < maxLen; i++) {
            for(int j = 0; j < 5; j++) {
                if(word[j][i] == '\0') continue;
                answer.append(word[j][i]);
            }
        }
        System.out.println(answer);
    }
}
