import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;


public class Main {
    static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        Stack<Integer> stk = new Stack<>();
        for(int i = 0; i < N; i++) {
            String s = sc.nextLine();
            String cmd[] = s.split(" ");
            switch(cmd[0]) {
                case "push" :
                    stk.push(Integer.parseInt(cmd[1]));
                    break;
                case "pop" :
                    try {
                        System.out.println(stk.pop());
                    } catch(EmptyStackException e) {
                        System.out.println(-1);
                    }
                    break;
                case "size" :
                    System.out.println(stk.size());
                    break;
                case "empty" :
                    System.out.println(stk.isEmpty() ? 1 : 0);
                    break;
                case "top" :
                    try {
                        System.out.println(stk.peek());
                    } catch(EmptyStackException e) {
                        System.out.println(-1);
                    }
                    break;
            }
        }

    }
}
