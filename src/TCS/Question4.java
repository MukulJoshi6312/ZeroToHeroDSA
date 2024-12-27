package TCS;

import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Set<String> set = new LinkedHashSet<>();
        String[] tokens = s.split("\\s+");
        for (String token : tokens) {
           set.add(token);
        }
        System.out.println(String.join(" ", set));

    }
}
