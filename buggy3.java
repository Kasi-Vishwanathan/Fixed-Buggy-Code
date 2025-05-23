import java.util.Scanner;

public class Buggy3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter 5 numbers:");

        for (int i = 0; i <= 5; i++) { // Bug: array index out of bounds
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];

        System.out.println("Sum is: " + sum);

        // Bug: poor practice — procedural code, no class abstraction
        sc.close();
    }
}