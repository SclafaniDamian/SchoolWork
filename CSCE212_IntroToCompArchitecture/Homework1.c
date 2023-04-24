// Made By Damian Sclafani
#include <stdio.h>

int main() {
    printf("Hello World");

    int a, b, c;

    scanf("%d", &a);
    scanf("%d", &b);

    c = a & b;

    printf("%d & %d = %d", a, b, c);

    c = a | b;

    printf("%d | %d = %d", a, b, c);

    c = a ^ b;

    printf("%d ^ %d = %d", a, b, c);

    return 0;
}