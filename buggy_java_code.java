public class Calculator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        int result;

        result = num1 / num2; // Division by zero error

        System.out.println("Result: " + result);

        for (int i = 0; i < 5; i++) // Missing braces
            System.out.println("Number: " + i);
        System.out.println("Loop finished.");

        int[] arr = {1, 2, 3};
        System.out.println(arr[3]); // ArrayIndexOutOfBoundsException
    }
}