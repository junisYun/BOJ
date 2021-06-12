// 배열로 순차적으로 계산
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solution(arr, n, m));
    }
    public static int solution(int[] arr, int n, int m) {
        int answer = Integer.MIN_VALUE;
        for(int i = 0; i < n - 2; i++) {
            if(arr[i] > m) continue;
            for(int j = i + 1; j < n - 1; j++) {
                if(arr[i] + arr[j] > m) continue;
                for(int k = j + 1; k < n; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if(sum == m) {
                        return sum;
                    }
                    if(sum < m) {
                        answer = Math.max(answer, sum);
                    }
                }
            }
        }
        return answer;
    }
}
