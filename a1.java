import java.util.Scanner;

public class BuggyJava {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            // Bug: Recursive call has wrong indices
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Error: Negative number entered");
        } else if (num == 0) {
            System.out.println("Fibonacci of 0 is 1");  // Bug: Fibonacci(0) = 0, not 1
        } else {
            int fib = fibonacci(num);
            System.out.println("Fibonacci of " + num + " is " + fib);
        }

        // Bug: Index out of bounds
        int[] array = {10, 20, 30, 40, 50};
        for (int i = 0; i <= array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
