import java.util.Scanner;

public class BuggyCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i <= size; i++) { // Bug: should be i < size
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Enter a number to find its index: ");
        int target = scanner.nextInt();
        int index = findIndex(numbers, target);

        if (index == -1) {
            System.out.println("Number not found.");
        } else {
            System.out.println("Number found at index: " + index);
        }

        System.out.println("Sum of all elements: " + calculateSum(numbers));

        System.out.println("Reversing the array...");
        reverseArray(numbers);

        System.out.println("Reversed array: ");
        for (int i = 0; i <= size; i++) { // Bug: should be i < size
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.println("Exiting program...");

        scanner.close(); // Bug: Closing scanner here may cause issues later
    }

    public static int findIndex(int[] arr, int target) {
        for (int i = 0; i <= arr.length; i++) { // Bug: should be i < arr.length
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i <= arr.length; i++) { // Bug: should be i < arr.length
            sum += arr[i];
        }
        return sum;
    }

    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right]; // Bug: ArrayIndexOutOfBoundsException
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
