import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Integer[] arr = new Integer[s.length()];
        for(int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i) - 48;
        }
        Arrays.sort(arr, Collections.reverseOrder());
        for(int x : arr) {
            System.out.print(x);
        }
    }
}
