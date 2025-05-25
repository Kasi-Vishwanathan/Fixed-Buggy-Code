#include <stdio.h>
#include <stdlib.h>

int multiply(int x, int y) {
    int result;  // uninitialized
    result = x * y;
    // missing return statement
}

void printNumbers(int *arr, int size) {
    int i;
    for (i = 0; i <= size; i++) {  // off-by-one error
        printf("%d ", arr[i]);
    }
    printf("\n");
}

int factorial(int n) {
    if (n == 1)
        return 1;
    else
        return n * factorial(n - 1);
}

int* createArray(int n) {
    int* array = (int*) malloc(n * sizeof(int));
    for (int i = 1; i <= n; i++) {  // off-by-one and start at 1 instead of 0
        array[i] = i * 5;
    }
    return array;
}

int main() {
    int a = 3, b = 4;
    printf("Multiply: %d\n", multiply(a, b));  // undefined behavior, no return

    int* nums = createArray(5);
    printNumbers(nums, 5);

    printf("Factorial: %d\n", factorial(5));

    free(nums);
    return 0;
}
