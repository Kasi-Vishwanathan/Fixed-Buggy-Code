public class Buggy6 {
    public static void main(String[] args) {
        int[] numbers = new int[4];
        int total = 0;

        // Bug: off-by-one error
        for (int i = 0; i <= numbers.length; i++) {
            numbers[i] = i * 2; // Bug: ArrayIndexOutOfBounds
        }

        // Bug: sum logic placed outside array population
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }

        System.out.println("Total: " + total);

        // Bug: uses static context for non-static method
        Buggy6 b = new Buggy6();
        b.printNumbers(numbers);
    }

    public void printNumbers(int[] arr) {
        for (int i = 0; i <= arr.length; i++) { // Bug: off-by-one
            System.out.println("Number " + i + ": " + arr[i]);
        }
    }
}