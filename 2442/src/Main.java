import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 1;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - k; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < k + i; j++) {
                System.out.print("*");
            }
            k++;
            System.out.println();
        }
    }
}
