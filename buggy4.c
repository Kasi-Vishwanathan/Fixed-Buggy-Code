#include <stdio.h>
#include <stdlib.h>

void init_array(arr, size)
int *arr;
int size;
{
    for (int i = 0; i <= size; i++) { // Bug: buffer overrun
        arr[i] = i + 1;
    }
}

int* allocate_array(n)
int n;
{
    int *ptr = (int *)malloc(n * sizeof(int));
    if (ptr == NULL)
        return NULL;
    return ptr;
}

int main() {
    int *data;
    data = allocate_array(5);
    init_array(data, 5);
    for (int i = 0; i < 5; i++)
        printf("%d ", data[i]);
    printf("\n");

    // Bug: memory leak, no free()
    return 0;
}