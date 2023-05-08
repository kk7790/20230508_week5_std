package org.example;

import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HashMakeTest {

    @Test
    void hashAddTest() {
        HashMake hashmake = new HashMake();
        hashmake.saveData(1,"lee");
        String result = (String) hashmake.readData(1);
        System.out.println("결과 : " + result);


    }



}