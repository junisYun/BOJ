import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder answer = new StringBuilder();
        for(char ch : s.toCharArray()) {
            int length = ch;
            int sum = 0;
            while(length > 0) {
                sum += (length % 10);
                length /= 10;
            }
            for(int i = 0; i  < sum; i++) {
                answer.append(ch);
            }
            answer.append("\n");
        }
        System.out.println(answer);
    }
}
