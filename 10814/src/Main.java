import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Member implements Comparable<Member> {
    int age;
    String name;
    Member(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public int compareTo(Member o) {
        return this.age - o.age;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Member> myList = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int age = sc.nextInt();
            String name = sc.next();
            myList.add(new Member(age, name));
        }
        Collections.sort(myList);
        for(Member x : myList) {
            System.out.println(x.age + " " + x.name);
        }
    }
}
