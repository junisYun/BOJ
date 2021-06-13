import java.util.ArrayList;
import java.util.Scanner;

class Person {
    int weight, height;
    public Person(int w, int h) {
        weight = w;
        height = h;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Person> arr = new ArrayList<>();
        int[] answer = new int[n];
        for(int i = 0; i < n; i++) {
            int weight = sc.nextInt();
            int height = sc.nextInt();
            arr.add(new Person(weight, height));
        }
        for(int i = 0; i < n; i++) {
            int rank = 1;
            Person p1 = arr.get(i);
            for(int j = 0; j < n; j++) {
                if(i == j) continue;
                Person p2 = arr.get(j);
                if(p1.height < p2.height &&  p1.weight < p2.weight) {
                    rank++;
                }
            }
            answer[i] = rank;
        }
        for(int x : answer) {
            System.out.print(x + " ");
        }
    }
}
