import java.util.HashSet;
import java.util.Scanner;

public class Main {
    static int[] check;
    static char[] arr, pm;
    static HashSet<Integer> mySet = new HashSet<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        pm = new char[s.length()];
        arr = new char[s.length()];
        check = new int[s.length()];

        for(int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        permutation(0);
        long answer = -1;

        for(int x : mySet) {
            if(x % 30 == 0 && answer < x) {
                answer = x;
            }
        }
        System.out.println(answer);
    }
    public static void permutation(int L) {
        if(L == pm.length) {
            StringBuilder str = new StringBuilder();
            for(char ch : pm) {
                str.append(ch);
            }
            mySet.add(Integer.parseInt(str.toString()));
        } else {
            for(int i = 0; i < pm.length; i++) {
                if(check[i] == 0) {
                    check[i] = 1;
                    pm[L] = arr[i];
                    permutation(L + 1);
                    check[i] = 0;
                }
            }
        }
    }
}
