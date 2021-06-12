import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            String s = sc.nextLine();
            if(s.equals(".")) break;
            Stack<Character> stk = new Stack<>();
            ArrayList<Character> arr = new ArrayList<>();
            for(char ch : s.toCharArray()) {
                if(ch == '(' || ch == ')' || ch == '[' || ch == ']') {
                    arr.add(ch);
                }
            }
            for (char ch : arr) {
                if (ch == '(' || ch == '[') stk.push(ch);
                else if (ch == ')' && !stk.isEmpty()) {
                    if (stk.peek() != '(') {
                        break;
                    } else {
                        stk.pop();
                    }
                } else if (ch == ']' && !stk.isEmpty()) {
                    if (stk.peek() != '[') {
                        break;
                    } else {
                        stk.pop();
                    }
                } else {
                    stk.push(ch);
                }
            }
            System.out.println(stk.isEmpty() ? "yes" : "no");
        }
    }
}
