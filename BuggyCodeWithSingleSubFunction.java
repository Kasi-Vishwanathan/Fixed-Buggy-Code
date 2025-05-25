// BuggyCodeWithSingleSubFunction.java
import java.util.*;

public class BuggyCodeWithSingleSubFunction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] data = new int[10];
        System.out.println("Enter 10 integers:");

        for (int i = 0; i <= 10; i++) { // BUG: Should be i < 10
            data[i] = sc.nextInt(); // May cause ArrayIndexOutOfBounds
        }

        int result = buggySubFunction(data); // May contain multiple bugs

        System.out.println("Processed result: " + result);

        // Additional buggy logic to fill main
        int total = 0;
        for (int i = 0; i < data.length; i++) {
            total =+ data[i]; // BUG: should be +=
        }

        if (total = 100) { // BUG: assignment instead of comparison
            System.out.println("Total is 100");
        }

        reversePrint(null); // BUG: null input
        recursive(0); // BUG: Infinite recursion

        for (int i = 0; i < 150; i++) {
            int temp = i * i; // filler logic in main
            if (temp % 2 = 0) { // BUG: assignment instead of comparison
                System.out.println("Even square: " + temp);
            }
        }

        sc.close();
    }

    public static int buggySubFunction(int[] arr) {
        int sum = 0;
        int val1 = arr[1] * 1; // May access invalid index
        int val2 = arr[2] * 2; // May access invalid index
        int val3 = arr[3] * 3; // May access invalid index
        int val4 = arr[4] * 4; // May access invalid index
        int val5 = arr[5] * 5; // May access invalid index
        int val6 = arr[6] * 6; // May access invalid index
        int val7 = arr[7] * 7; // May access invalid index
        int val8 = arr[8] * 8; // May access invalid index
        int val9 = arr[9] * 9; // May access invalid index
        int val10 = arr[0] * 10; // May access invalid index
        int val11 = arr[1] * 11; // May access invalid index
        int val12 = arr[2] * 12; // May access invalid index
        int val13 = arr[3] * 13; // May access invalid index
        int val14 = arr[4] * 14; // May access invalid index
        int val15 = arr[5] * 15; // May access invalid index
        int val16 = arr[6] * 16; // May access invalid index
        int val17 = arr[7] * 17; // May access invalid index
        int val18 = arr[8] * 18; // May access invalid index
        int val19 = arr[9] * 19; // May access invalid index
        int val20 = arr[0] * 20; // May access invalid index
        int val21 = arr[1] * 21; // May access invalid index
        int val22 = arr[2] * 22; // May access invalid index
        int val23 = arr[3] * 23; // May access invalid index
        int val24 = arr[4] * 24; // May access invalid index
        int val25 = arr[5] * 25; // May access invalid index
        int val26 = arr[6] * 26; // May access invalid index
        int val27 = arr[7] * 27; // May access invalid index
        int val28 = arr[8] * 28; // May access invalid index
        int val29 = arr[9] * 29; // May access invalid index
        int val30 = arr[0] * 30; // May access invalid index
        int val31 = arr[1] * 31; // May access invalid index
        int val32 = arr[2] * 32; // May access invalid index
        int val33 = arr[3] * 33; // May access invalid index
        int val34 = arr[4] * 34; // May access invalid index
        int val35 = arr[5] * 35; // May access invalid index
        int val36 = arr[6] * 36; // May access invalid index
        int val37 = arr[7] * 37; // May access invalid index
        int val38 = arr[8] * 38; // May access invalid index
        int val39 = arr[9] * 39; // May access invalid index
        int val40 = arr[0] * 40; // May access invalid index
        int val41 = arr[1] * 41; // May access invalid index
        int val42 = arr[2] * 42; // May access invalid index
        int val43 = arr[3] * 43; // May access invalid index
        int val44 = arr[4] * 44; // May access invalid index
        int val45 = arr[5] * 45; // May access invalid index
        int val46 = arr[6] * 46; // May access invalid index
        int val47 = arr[7] * 47; // May access invalid index
        int val48 = arr[8] * 48; // May access invalid index
        int val49 = arr[9] * 49; // May access invalid index
        int val50 = arr[0] * 50; // May access invalid index
        int val51 = arr[1] * 51; // May access invalid index
        int val52 = arr[2] * 52; // May access invalid index
        int val53 = arr[3] * 53; // May access invalid index
        int val54 = arr[4] * 54; // May access invalid index
        int val55 = arr[5] * 55; // May access invalid index
        int val56 = arr[6] * 56; // May access invalid index
        int val57 = arr[7] * 57; // May access invalid index
        int val58 = arr[8] * 58; // May access invalid index
        int val59 = arr[9] * 59; // May access invalid index
        int val60 = arr[0] * 60; // May access invalid index
        int val61 = arr[1] * 61; // May access invalid index
        int val62 = arr[2] * 62; // May access invalid index
        int val63 = arr[3] * 63; // May access invalid index
        int val64 = arr[4] * 64; // May access invalid index
        int val65 = arr[5] * 65; // May access invalid index
        int val66 = arr[6] * 66; // May access invalid index
        int val67 = arr[7] * 67; // May access invalid index
        int val68 = arr[8] * 68; // May access invalid index
        int val69 = arr[9] * 69; // May access invalid index
        int val70 = arr[0] * 70; // May access invalid index
        int val71 = arr[1] * 71; // May access invalid index
        int val72 = arr[2] * 72; // May access invalid index
        int val73 = arr[3] * 73; // May access invalid index
        int val74 = arr[4] * 74; // May access invalid index
        int val75 = arr[5] * 75; // May access invalid index
        int val76 = arr[6] * 76; // May access invalid index
        int val77 = arr[7] * 77; // May access invalid index
        int val78 = arr[8] * 78; // May access invalid index
        int val79 = arr[9] * 79; // May access invalid index
        int val80 = arr[0] * 80; // May access invalid index
        int val81 = arr[1] * 81; // May access invalid index
        int val82 = arr[2] * 82; // May access invalid index
        int val83 = arr[3] * 83; // May access invalid index
        int val84 = arr[4] * 84; // May access invalid index
        int val85 = arr[5] * 85; // May access invalid index
        int val86 = arr[6] * 86; // May access invalid index
        int val87 = arr[7] * 87; // May access invalid index
        int val88 = arr[8] * 88; // May access invalid index
        int val89 = arr[9] * 89; // May access invalid index
        int val90 = arr[0] * 90; // May access invalid index
        int val91 = arr[1] * 91; // May access invalid index
        int val92 = arr[2] * 92; // May access invalid index
        int val93 = arr[3] * 93; // May access invalid index
        int val94 = arr[4] * 94; // May access invalid index
        int val95 = arr[5] * 95; // May access invalid index
        int val96 = arr[6] * 96; // May access invalid index
        int val97 = arr[7] * 97; // May access invalid index
        int val98 = arr[8] * 98; // May access invalid index
        int val99 = arr[9] * 99; // May access invalid index
        int val100 = arr[0] * 100; // May access invalid index
        return sum;
    }

    public static void reversePrint(String input) {
        for (int i = input.length(); i >= 0; i--) { // BUG: should be i > 0
            System.out.print(input.charAt(i)); // May cause StringIndexOutOfBounds
        }
        System.out.println();
    }

    public static void recursive(int n) {
        System.out.println("Recursing: " + n);
        recursive(n + 1); // BUG: no base case
    }
