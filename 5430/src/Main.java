import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t = 0; t < T; t++) {
            String cmd = sc.next();
            int size = sc.nextInt();
            String arr = sc.next();
            int[] num = new int[size];
            int index = 0;

            StringBuilder str = new StringBuilder();
            for(int i = 1; i < arr.length() - 1; i++) {
                if(arr.charAt(i) == ',') {
                    num[index] = Integer.parseInt(str.toString());
                    index++;
                    str = new StringBuilder();
                } else {
                    str.append(arr.charAt(i));
                }
            }
            for(int x : num) System.out.println(x);


            index = 0;
            for(char ch : cmd.toCharArray()) {
                if(ch == 'R') reverseNum(num);
                else if(ch == 'D') {
                    try {
                        num[index] = 0;
                        index++;
                    } catch(ArrayIndexOutOfBoundsException e) {
                        System.out.println("error");
                    }
                }
            }


            if(index > size) {
                System.out.println("error");
            } else {
                ArrayList<Integer> answer = new ArrayList<>();
                for(int i = 0; i < size; i++) {
                    if(num[i] != 0) answer.add(num[i]);
                }
                System.out.println(answer);
            }

        }
    }
    public static void reverseNum(int[] num) {
        for(int i = 0; i <= num.length / 2 - 1; i++) {
            int temp = num[i];
            num[i] = num[num.length - 1 - i];
            num[num.length - 1 - i] = temp;
        }
    }
}
