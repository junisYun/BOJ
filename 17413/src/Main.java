import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String word[] = str.split(" ");
        Stack<Character> stk = new Stack<>();
        for(String s : word) {
            String answer = "";
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '<') {
                    
                }
                stk.push(s.charAt(i));
            }
            while(!stk.isEmpty()) {
                answer += stk.pop();
            }
            System.out.print(answer + " ");
        }
    }
}
