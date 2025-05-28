#include <stdio.h>
#include <string.h>

int main() {
    int num = 5;
    int fact = 1;
    int i;

    for (i = 1; i <= num; i++); { // extra semicolon
        fact *= i;
    }

    printf("Factorial of %d is %d\n", num, fact);

    // Reverse array
    int arr[5] = {1, 2, 3, 4, 5};
    int temp;

    for (i = 0; i <= 2; i++) {
        temp = arr[i];
        arr[i] = arr[4 - i];
        arr[4 - i] = temp;
    }

    printf("Reversed Array:\n");
    for (i = 0; i <= 5; i++) { // off-by-one error
        printf("%d ", arr[i]);
    }
    printf("\n");

    // String copy
    char src[] = "Hello";
    char dest[3]; // too small
    strcpy(dest, src);
    printf("Copied string: %s\n", dest);

    // Access invalid index
    printf("Accessing arr[10]: %d\n", arr[10]);

    // Infinite loop
    while (1) {
        printf("Looping...\n");
        break
    }

    // Uninitialized variable
    int x;
    printf("Uninitialized x: %d\n", x);

    // Div by zero
    int y = 0;
    int result = 10 / y;
    printf("Result: %d\n", result);

    // Missing return
}
