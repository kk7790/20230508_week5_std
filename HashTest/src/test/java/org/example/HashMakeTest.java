package org.example;

import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HashMakeTest {
    private long id = (long)1L;
    private String name = "hutao";
    private String number = "01012345678";

    public boolean HashMake(long id, String name, String number){
        this.id = id;
        this.name = name;
        this.number = number;
        return false;
    }

    public int hashCode(){
        int hash = 7;
        hash = 31 * hash + (int)id;
        hash = 31 * hash + (name == null ? 0 : name.hashCode());
        hash = 31 * hash + (number == null ? 0 : number.hashCode());
        System.out.println("hashCode() called - Computed hash : "+ hash);
        return hash;
    }

//    @Test
//    @Override
//    public boolean equals(Object o){
//        if (this == o) return true;
//        if(o == null || getClass() != o.getClass()) return false;
//        HashMake user = (HashMake) o;
//        return id == user.id && Objects.equals(name, user.name) &&
//                Objects.equals(number, user.number);
//    }


}