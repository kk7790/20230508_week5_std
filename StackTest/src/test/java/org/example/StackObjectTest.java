package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackObjectTest {
    @Test
    void stackAddTest() {
        StackObject stackObject = new StackObject();
        assertEquals(stackObject.size(), 0);
        stackObject.addStack(1);
        stackObject.addStack(2);
        assertEquals(stackObject.size(), 2);
    }
    @Test
    void stackDelTest(){
        StackObject stackObject = new StackObject();
        stackObject.addStack(1);
        stackObject.addStack(2);

        stackObject.delStack();
        assertEquals(stackObject.size(),1);
    }
    @Test
    void StackAllDelTest(){
        StackObject stackObject = new StackObject();
        stackObject.addStack(1);
        stackObject.addStack(1);
        stackObject.addStack(1);
        assertEquals(stackObject.size(),3);
        stackObject.allDelete();
        assertEquals(stackObject.size(),0);
    }

}