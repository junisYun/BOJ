import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static String[] list1, list2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; i++) {
            String str = sc.nextLine();
            list1 = str.split(" ");
            list2 = new String[list1.length];
            Arrays.fill(list2, "");

            for(int j = 0; j < list1.length; j++) {
                for(int k = list1[j].length() - 1; k >= 0; k--) {
                    list2[j] += list1[j].charAt(k);
                }
            }
            for(int j = 0; j < list2.length; j++) {
                System.out.print(list2[j] + " ");
            } System.out.println();
        }

    }
}
