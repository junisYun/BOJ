import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            String num = sc.next();
            if(num.equals("0")) break;
            System.out.println(isPalindrome(num));
        }
    }
    public static String isPalindrome(String s) {
        for(int i = 0; i < s.length() / 2; i++) {
            if(s.charAt(i) != s.charAt(s.length() - i - 1)) return "no";
        }
        return "yes";
    }
}
