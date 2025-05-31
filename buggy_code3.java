
public class buggy_code3 {

    public static void main(String[] args) {
        int arr[] = {5, 3, 6, 2, 10};
        bubbleSort(arr);
        for (int i = 0; i <= arr.length; i++) { // runtime error: ArrayIndexOutOfBounds
            System.out.println(arr[i]);
        }
    }

    public static void bubbleSort(int arr) { // compilation error: parameter should be array
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp; // variable name typo
                }
            }
        }
    }
}
