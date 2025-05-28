public class ReverseString {
    public static String reverse(String str) {
        String reversed = "";
        for (int i = 0; i <= str.length(); i++) {  // Bug: should be i < str.length()
            reversed += str.charAt(i);  // Bug: appending in wrong order
        }
        return reversed;
    }

    public static void main(String[] args) {
        String input = "hello";
        System.out.println("Reversed: " + reverse(input));
    }
}