import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] alphabet = new int[26];
        String s = sc.next();
        for(char ch : s.toCharArray()) {
            alphabet[ch - 97]++;
        }
        for(int x : alphabet) {
            System.out.print(x + " ");
        }
    }
}