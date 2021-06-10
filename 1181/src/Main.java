// 객체를 만들어 정렬할 경우 //

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Word implements Comparable<Word> {
    String s;
    int len;
    public Word(String s, int len) {
        this.s = s;
        this.len = len;
    }
    @Override
    public int compareTo(Word o) {
        if(this.len == o.len) {
            return this.s.compareTo(o.s);
        } else {
            return this.len - o.len;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Word> myList = new ArrayList<>();
        ArrayList<String> check = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String s = sc.next();
            if(!check.contains(s)) {
                myList.add(new Word(s, s.length()));
            }
            check.add(s);
        }
        Collections.sort(myList);
        System.out.println(myList.get(0).s);
        for(int i = 1; i < myList.size(); i++) {
            if(!(myList.get(i).s.equals(myList.get(i - 1).s))) {
                System.out.println(myList.get(i).s);
            }
        }
    }
}
