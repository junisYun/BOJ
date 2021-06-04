import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int n = sc.nextInt();
            if(n == 0) break;
            boolean flag = true;
            ArrayList<Integer> primeNumList = new ArrayList<>();

            boolean[] primeNum = new boolean[n + 1];
            for(int i = 2; i <= n; i++) {
                int cnt = 0;
                if(!primeNum[i]) {
                    for(int j = 1; j <= i; j++) {
                        if(i % j == 0) cnt++;
                    }
                    if(cnt == 2) {
                        primeNumList.add(i);
                        int k = i;
                        while(k <= n) {
                            primeNum[k] = true;
                            k += k;
                        }
                    }
                }
            }
            for (int i = 0; i < primeNumList.size() - 1; i++) {
                for (int j = i; j < primeNumList.size(); j++) {
                    if (primeNumList.get(i) + primeNumList.get(j) == n) {
                        System.out.println(n + " = " + primeNumList.get(i) + " + " + primeNumList.get(j));
                        flag = false;
                        break;
                    }
                }
                if(!flag) break;
            }
            if (flag) {
                System.out.println("Goldbach's conjecture is wrong.");
            }
        }
    }
}
