// 50‑line Buggy Java: Reverse string CLI
import java.util.Scanner;

public class Buggy {
    static String reverse(String s) {
        String r = "";
        for (int i = 0; i <= s.length(); i++)     // BUG: i < length
            r += s.charAt(i);                     // BUG: String concat in loop
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")) {           // BUG: .equalsIgnoreCase?
            System.out.print("Enter text (quit to stop): ");
            input = sc.nextLine();                // BUG: no trim
            if (!input.equals("quit")) {
                String rev = reverse(input);
                System.out.println("Reversed: " + rev);
            }
        }
        sc.close();
        reverse(null);                            // BUG: NPE test
    }
}
