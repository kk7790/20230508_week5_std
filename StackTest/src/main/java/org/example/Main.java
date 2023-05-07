package org.example;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        StackObject stackObject = new StackObject();
        stackObject.addStack(1);
        stackObject.addStack(2);
        stackObject.addStack(3);
        stackObject.addStack(4);
        stackObject.addStack(5);

        stackObject.delStack();

        stackObject.allDelStack();
    }
}