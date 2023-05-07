package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakeObjectTest {
    MakeObject makeObject = new MakeObject();
    @Test
    public void addQueueTest() {
        makeObject.addQueue(1);
        Object[] testArray = new Object[100];
        testArray[0] = 1;
        Object[] addResultArray = makeObject.allData();
        assertArrayEquals(testArray, addResultArray);
    }
    @Test
    void delQeueTest(){
        makeObject.addQueue(1);
        makeObject.addQueue(2);
        int arraySizeCheck = makeObject.size();
        assertEquals(arraySizeCheck,2);
        makeObject.delQueue();
        arraySizeCheck = makeObject.size();
        assertEquals(arraySizeCheck,1);
    }

    @Test
    void allDelQueueTest(){
        makeObject.addQueue(1);
        makeObject.addQueue(2);
        int arraySizeCheck = makeObject.size();
        assertEquals(arraySizeCheck,2);
        makeObject.allDelete();
        arraySizeCheck = makeObject.size();
        assertEquals(arraySizeCheck,0);
    }



}