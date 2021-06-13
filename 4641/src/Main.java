import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            ArrayList<Integer> arr = new ArrayList<>();
            String s = sc.next();
            String[] temp = s.split(" ");
            if(temp.length == 1) break;
            for(String x : temp) System.out.println(x);

            for(int i = 0; i < temp.length; i++) {
                arr.add(Integer.parseInt(temp[i]));
            }
            int cnt = 0;
            Collections.sort(arr);
            for(int i = 1; i < arr.size(); i++) {
                for(int j = i + 1; j < arr.size(); j++) {
                    if(arr.get(j) / 2.0 == (double)arr.get(i)) {
                        cnt++;
                        break;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}
