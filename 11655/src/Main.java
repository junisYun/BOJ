import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(char ch : s.toCharArray()) {
            if(Character.isUpperCase(ch)) {
                int alpha = ch + 13;
                if(alpha > 90) {
                    System.out.print((char)(alpha - 26));
                } else {
                    System.out.print((char)(alpha));
                }
            } else if(Character.isLowerCase(ch)) {
                int alpha = ch + 13;
                if(alpha > 122) {
                    System.out.print((char)(alpha - 26));
                } else {
                    System.out.print((char)(alpha));
                }
            } else {
                System.out.print(ch);
            }
        }
    }
}
