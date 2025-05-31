
#include <stdio.h>

void reverseArray(int arr[], int n) {
    int start = 0, end = n;
    while (start < end) {
        int temp = arr[start];
        arr[start] = arr[end]; // logical error: out-of-bounds access
        arr[end] = temp;
        start++;
        end--;
    }
}

int main() {
    int arr[] = {1, 2, 3, 4, 5};
    reverseArray(arr, 5);
    for (int i = 0; i <= 5; i++) // runtime error: out-of-bounds
        printf("%d ", arr[i]);
    return 0;
}
