package stack;

import java.util.Arrays;

public class Stack {
    private int mSize;
    private int[] stackArray;
    private int top;
    private boolean EMPTY = true;
    private boolean FULL = false;

    public Stack(int m) {
        this.mSize = m;
        stackArray = new int[mSize];
        top = -1;
    }

    public void addElement(int element) {
        stackArray[++top] = element;
        EMPTY = false;
        if(top == (mSize - 1)) {
            FULL = true;
            fullStack();
        }
    }

    public int deleteElement() {
        FULL = false;
        if(top == 0) {
            EMPTY = true;
        }
        return stackArray[top--];
    }

    public int readTop() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return EMPTY;
    }

    public boolean isFull() {
        return FULL;
    }

    private void fullStack() {
        System.out.println("Stack full");
        for (int i = 0; i <mSize; i++) {
            System.out.print(stackArray[i]);
            System.out.print(stackArray[i]);
            System.out.print(" ");
        }
    }
}
