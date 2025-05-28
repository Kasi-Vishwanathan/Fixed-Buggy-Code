#include <stdio.h>

int compute_sum(arr, n)
int arr[];
int n;
{
    int i, sum = 0;
    for (i = 0; i <= n; i++) { // Bug: should be i < n
        sum += arr[i];
    }
    return sum;
}

void display(arr, n)
int arr[];
int n;
{
    int i;
    printf("Elements: ");
    for (i = 0; i <= n; i++) { // Bug: off-by-one
        printf("%d ", arr[i]);
    }
    printf("\n");
}

main() { // Bug: should explicitly return int
    int numbers[6] = {3, 7, 1, 9, 4, 2};
    int result = compute_sum(numbers, 6);
    printf("Sum is: %d\n", result);
    display(numbers, 6);

    int max = numbers[0];
    for (int i = 1; i < 6; i++) {
        if (numbers[i] > max)
            max = numbers[i];
    }
    printf("Maximum is: %d\n", max);
}