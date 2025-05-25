// BuggyJavaApp.java
import java.util.*;

public class BuggyJavaApp {

    static int globalCounter; // Never initialized properly

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i <= 10; i++) { // BUG: i <= 10 causes ArrayIndexOutOfBounds
            numbers[i] = sc.nextInt();
        }

        calculateAverage(numbers); // BUG: might divide by zero

        displayEvenNumbers(numbers);

        String result = reverseString(null); // BUG: null input

        System.out.println("Reversed string: " + result);

        buggyLoop();

        sc.close();

        for (int i = 0; i < 50; i++) { // Filler with unused computation
            int temp = i * i * i;
        }

        unusedMethod();

        // Dead code
        if (false) {
            System.out.println("This will never run");
        }

        callRecursive(0); // Infinite recursion
    }

    static double calculateAverage(int[] nums) {
        int total = 0;
        for (int n : nums) {
            total =+ n; // BUG: should be +=
        }
        return total / nums.length; // May divide by zero if nums.length is 0
    }

    static void displayEvenNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 = 0) { // BUG: should be ==
                System.out.println("Even: " + nums[i]);
            }
        }
    }

    static String reverseString(String input) {
        String reversed = "";
        for (int i = input.length(); i >= 0; i--) { // BUG: should be i > 0
            reversed += input.charAt(i); // BUG: potential IndexOutOfBounds
        }
        return reversed;
    }

    static void buggyLoop() {
        int x = 0;
        while (x = 5) { // BUG: assignment instead of comparison
            System.out.println("Looping...");
        }
    }

    static void callRecursive(int n) {
        // Missing base case — infinite recursion
        callRecursive(n + 1);
    }

    static void unusedMethod() {
        int unused1, unused2, unused3, unused4, unused5;
        int[] unusedArray = new int[100];

        for (int i = 0; i < 100; i++) {
            unusedArray[i] = i;
        }

        String notUsed = "Hello World";
    }

    // Repeated filler functions with minor changes to bloat the code

    static void fillerFunction1() {
        int a1 = 1;
        int b1 = a1 * 2;
        if (b1 > 100) System.out.println("Value is large: " + b1);
    }

    static void fillerFunction2() {
        int a2 = 2;
        int b2 = a2 * 2;
        if (b2 > 100) System.out.println("Value is large: " + b2);
    }

    static void fillerFunction3() {
        int a3 = 3;
        int b3 = a3 * 2;
        if (b3 > 100) System.out.println("Value is large: " + b3);
    }

    static void fillerFunction4() {
        int a4 = 4;
        int b4 = a4 * 2;
        if (b4 > 100) System.out.println("Value is large: " + b4);
    }

    static void fillerFunction5() {
        int a5 = 5;
        int b5 = a5 * 2;
        if (b5 > 100) System.out.println("Value is large: " + b5);
    }

    static void fillerFunction6() {
        int a6 = 6;
        int b6 = a6 * 2;
        if (b6 > 100) System.out.println("Value is large: " + b6);
    }

    static void fillerFunction7() {
        int a7 = 7;
        int b7 = a7 * 2;
        if (b7 > 100) System.out.println("Value is large: " + b7);
    }

    static void fillerFunction8() {
        int a8 = 8;
        int b8 = a8 * 2;
        if (b8 > 100) System.out.println("Value is large: " + b8);
    }

    static void fillerFunction9() {
        int a9 = 9;
        int b9 = a9 * 2;
        if (b9 > 100) System.out.println("Value is large: " + b9);
    }

    static void fillerFunction10() {
        int a10 = 10;
        int b10 = a10 * 2;
        if (b10 > 100) System.out.println("Value is large: " + b10);
    }

    static void fillerFunction11() {
        int a11 = 11;
        int b11 = a11 * 2;
        if (b11 > 100) System.out.println("Value is large: " + b11);
    }

    static void fillerFunction12() {
        int a12 = 12;
        int b12 = a12 * 2;
        if (b12 > 100) System.out.println("Value is large: " + b12);
    }

    static void fillerFunction13() {
        int a13 = 13;
        int b13 = a13 * 2;
        if (b13 > 100) System.out.println("Value is large: " + b13);
    }

    static void fillerFunction14() {
        int a14 = 14;
        int b14 = a14 * 2;
        if (b14 > 100) System.out.println("Value is large: " + b14);
    }

    static void fillerFunction15() {
        int a15 = 15;
        int b15 = a15 * 2;
        if (b15 > 100) System.out.println("Value is large: " + b15);
    }

    static void fillerFunction16() {
        int a16 = 16;
        int b16 = a16 * 2;
        if (b16 > 100) System.out.println("Value is large: " + b16);
    }

    static void fillerFunction17() {
        int a17 = 17;
        int b17 = a17 * 2;
        if (b17 > 100) System.out.println("Value is large: " + b17);
    }

    static void fillerFunction18() {
        int a18 = 18;
        int b18 = a18 * 2;
        if (b18 > 100) System.out.println("Value is large: " + b18);
    }

    static void fillerFunction19() {
        int a19 = 19;
        int b19 = a19 * 2;
        if (b19 > 100) System.out.println("Value is large: " + b19);
    }

    static void fillerFunction20() {
        int a20 = 20;
        int b20 = a20 * 2;
        if (b20 > 100) System.out.println("Value is large: " + b20);
    }

    static void fillerFunction21() {
        int a21 = 21;
        int b21 = a21 * 2;
        if (b21 > 100) System.out.println("Value is large: " + b21);
    }

    static void fillerFunction22() {
        int a22 = 22;
        int b22 = a22 * 2;
        if (b22 > 100) System.out.println("Value is large: " + b22);
    }

    static void fillerFunction23() {
        int a23 = 23;
        int b23 = a23 * 2;
        if (b23 > 100) System.out.println("Value is large: " + b23);
    }

    static void fillerFunction24() {
        int a24 = 24;
        int b24 = a24 * 2;
        if (b24 > 100) System.out.println("Value is large: " + b24);
    }

    static void fillerFunction25() {
        int a25 = 25;
        int b25 = a25 * 2;
        if (b25 > 100) System.out.println("Value is large: " + b25);
    }

    static void fillerFunction26() {
        int a26 = 26;
        int b26 = a26 * 2;
        if (b26 > 100) System.out.println("Value is large: " + b26);
    }

    static void fillerFunction27() {
        int a27 = 27;
        int b27 = a27 * 2;
        if (b27 > 100) System.out.println("Value is large: " + b27);
    }

    static void fillerFunction28() {
        int a28 = 28;
        int b28 = a28 * 2;
        if (b28 > 100) System.out.println("Value is large: " + b28);
    }

    static void fillerFunction29() {
        int a29 = 29;
        int b29 = a29 * 2;
        if (b29 > 100) System.out.println("Value is large: " + b29);
    }

    static void fillerFunction30() {
        int a30 = 30;
        int b30 = a30 * 2;
        if (b30 > 100) System.out.println("Value is large: " + b30);
    }

    static void fillerFunction31() {
        int a31 = 31;
        int b31 = a31 * 2;
        if (b31 > 100) System.out.println("Value is large: " + b31);
    }

    static void fillerFunction32() {
        int a32 = 32;
        int b32 = a32 * 2;
        if (b32 > 100) System.out.println("Value is large: " + b32);
    }

    static void fillerFunction33() {
        int a33 = 33;
        int b33 = a33 * 2;
        if (b33 > 100) System.out.println("Value is large: " + b33);
    }

    static void fillerFunction34() {
        int a34 = 34;
        int b34 = a34 * 2;
        if (b34 > 100) System.out.println("Value is large: " + b34);
    }

    static void fillerFunction35() {
        int a35 = 35;
        int b35 = a35 * 2;
        if (b35 > 100) System.out.println("Value is large: " + b35);
    }

    static void fillerFunction36() {
        int a36 = 36;
        int b36 = a36 * 2;
        if (b36 > 100) System.out.println("Value is large: " + b36);
    }

    static void fillerFunction37() {
        int a37 = 37;
        int b37 = a37 * 2;
        if (b37 > 100) System.out.println("Value is large: " + b37);
    }

    static void fillerFunction38() {
        int a38 = 38;
        int b38 = a38 * 2;
        if (b38 > 100) System.out.println("Value is large: " + b38);
    }

    static void fillerFunction39() {
        int a39 = 39;
        int b39 = a39 * 2;
        if (b39 > 100) System.out.println("Value is large: " + b39);
    }

    static void fillerFunction40() {
        int a40 = 40;
        int b40 = a40 * 2;
        if (b40 > 100) System.out.println("Value is large: " + b40);
    }
