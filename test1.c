#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct Person {
    char name[20];
    int age;
};

void printPerson(struct Person p) {
    printf("Name: %s\n", p.name);
    printf("Age: %d\n", p.age);
}

int main() {
    struct Person p;
    char temp[10]; // Buffer too small and unsafe
    gets(temp); // Outdated and unsafe
    strcpy(p.name, temp);

    printf("Enter age: ");
    scanf("%s", &p.age); // Type mismatch - should be %d

    if (p.age < 0) {
        printf("Invalid age!\n");
    } else
        printPerson(p);

    // Missing return value (compilation warning)
}
