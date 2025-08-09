package Lab_2;

import java.util.*;

public class StringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(s.charAt(0));
        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.substring(1));
        System.out.println(s.contains("a"));
        System.out.println(s.replace('a', 'x'));
    }
}