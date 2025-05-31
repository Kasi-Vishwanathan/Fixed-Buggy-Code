#include <stdio.h>

int main() {
    int arr[5] = {1, 2, 3, 4, 5};
    int sum = 0, i;

    printf("Array elements: ");
    for(i=0; i<=5; i++) { // Bug: Out-of-bounds access
        printf("%d ", arr[i]);
        sum += arr[i];
    }
    printf("\nSum: %d\n", sum);

    char *ptr = NULL;
    printf("Dereferencing NULL pointer: %c\n", *ptr); // Runtime error

    int a = 5, b = 0;
    printf("Division by zero: %d\n", a/b); // Division by zero

    int *p = NULL;
    *p = 10; // Runtime error

    for (i=0; i<10; i++) // Missing braces for loop
        printf("Index: %d\n", i);
        printf("Loop ends.\n"); // Incorrectly outside the loop

    int j = 0;
    while (j < 3)
        printf("While loop: %d\n", j);
        j++; // Infinite loop due to missing braces

    printf("Program finished.\n");
    return 0;
}
