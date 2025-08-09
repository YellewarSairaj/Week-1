package Lab_2;

import java.util.*;

public class StringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        System.out.println(a.equals(b));
        System.out.println(a == b);
    }
}
