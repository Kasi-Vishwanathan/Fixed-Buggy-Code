#include <stdio.h>

int main() {
    int a, b, sum;
    printf("Enter two numbers: ");
    scanf("%d %d", &a &b); // Missing comma between &a and &b

    sum = a + b;
    printf("Sum of %d and %d is %d\n", a, b, sum);

    for (int i = 0; i < 10; i++) // Missing braces
        printf("Number: %d\n", i);
    printf("Loop finished.\n");

    return 0;
}