import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Map<String, String> color = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dataSave();
        String firstColor = sc.next();
        String secondColor = sc.next();
        String thirdColor = sc.next();
        System.out.println(Long.parseLong(color.get(firstColor).split("_")[0] +
                color.get(secondColor).split("_")[0]) * Long.parseLong(color.get(thirdColor).split("_")[1]));

    }
    public static void dataSave() {
        color.put("black", "0_1");
        color.put("brown", "1_10");
        color.put("red", "2_100");
        color.put("orange", "3_1000");
        color.put("yellow", "4_10000");
        color.put("green", "5_100000");
        color.put("blue", "6_1000000");
        color.put("violet", "7_10000000");
        color.put("grey", "8_100000000");
        color.put("white", "9_1000000000");
    }
}
