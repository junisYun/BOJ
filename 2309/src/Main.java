import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[] cb, arr;
    static boolean flag = true;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arr = new int[9];
        cb = new int[7];
        for(int i = 0; i < 9; i++){
            arr[i] = sc.nextInt();
        }
        combination(0, 0, 0);
    }
    public static void combination(int L, int s, int sum) {
        if(L == 7 && sum == 100 && flag) {
            Arrays.sort(cb);
            flag = false;
            for(int x : cb) {
                System.out.print(x + " ");
            } System.out.println();
        }
        else if(L == 7 || sum > 100) return;
        else {
            for(int i = s; i < 9; i++) {
                cb[L] = arr[i];
                combination(L + 1, i + 1, sum + arr[i]);
            }
        }
    }
}