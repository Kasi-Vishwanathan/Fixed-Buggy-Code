public class BuggyJava {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i = 0; i <= 5; i++) { // Out-of-bounds
            sum += numbers[i];
        }
        System.out.println("Sum: " + sum);

        String s = null;
        System.out.println(s.length()); // NullPointerException

        int a = 10, b = 0;
        System.out.println("Division: " + (a/b)); // Division by zero

        int[] arr = {1,2,3};
        System.out.println(arr[3]); // Out-of-bounds

        for (int i = 0; i < 5; i++) // Missing braces
            System.out.println("i: " + i);
            System.out.println("End of loop"); // Outside loop

        int j = 0;
        while (j < 3)
            System.out.println("While loop: " + j);
            j++; // Infinite loop

        System.out.println("Program ends.");
    }
}
