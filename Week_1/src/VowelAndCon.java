import java.util.Scanner;
public class VowelAndCon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            c = Character.toLowerCase(c);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                System.out.println("Vowel");
            else
                System.out.println("Consonant");
        } else {
            System.out.println("Not Alphabet");
        }
    }
}