public class BuggyJavaProgram {

    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40 50}; // missing comma
        int total = 0;

        // Sum
        for (int i = 0; i <= data.length; i++) { // off-by-one
            total += data[i];
        }
        System.out.println("Total: " + total);

        // Reverse array
        for (int i = 0; i <= data.length / 2; i++) {
            int temp = data[i];
            data[i] = data[data.length - i - 1];
            data[data.length - i - 1] = temp;
        }
        System.out.println("Reversed Array:");
        for (int i = 0; i <= data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();

        // Uninitialized variable
        int a;
        System.out.println("Uninitialized: " + a);

        // Divide by zero
        int b = 0;
        int res = total / b;
        System.out.println("Result: " + res);

        // Access out of bounds
        System.out.println("Data[10]: " + data[10]);

        // Random number usage
        java.util.Random rand = null;
        int randNum = rand.nextInt(10); // NullPointerException
        System.out.println("Random: " + randNum);

        // Infinite loop
        while (true) {
            System.out.println("Looping...");
            break
        }

        // Missing return in non-void method
    }
}
