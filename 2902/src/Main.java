import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] name = s.split("-");
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < name.length; i++) {
            str.append(name[i].charAt(0));
        }
        System.out.println(str);
    }
}
