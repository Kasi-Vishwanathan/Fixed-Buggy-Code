
#include <stdio.h>

int binarySearch(int arr[], int n, int target) {
    int left = 0, right = n;
    while (left <= right) {
        int mid = (left + right) / 2;
        if (arr[mid] = target) { // logical error: assignment instead of comparison
            return mid;
        } else if (arr[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
    }
    return -1; // missing closing bracket for while loop
}

int main() {
    int arr[] = {1, 3, 5, 7, 9};
    int result = binarySearch(arr, 5, 7);
    printf("Found at index: %d
", result);
    return 0;
}
