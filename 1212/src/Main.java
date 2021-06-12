import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solution(n);
    }
    public static void solution(int num) {
        int sum = 0;
        int m = 0;
        while(num > 0) {
            int digit = num % 10;
            sum += digit * Math.pow(8, m);
            m++;
            num /= 10;
        }
        String binaryString = Integer.toBinaryString(sum);
        System.out.println(binaryString);
    }
}
