// #include <stdio.h>
// #define SIZE 100

// int stack[SIZE];
// int top = -1;

// void push(int val) {
//     if (top == SIZE - 1) {
//         printf("Stack Overflow\n");
//     } else {
//         top++;
//         stack[top] = val;
//         printf("%d pushed to stack\n", val);
//     }
// }

#include <stdio.h>
#define SIZE 100

int stack[SIZE];
int top = -1;

void pop() {
    if (top == -1) {
        printf("Stack Underflow\n");
    } else {
        int val = stack[top];
        top--;
        printf("%d popped from stack\n", val);
    }
}