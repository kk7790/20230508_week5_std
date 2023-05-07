package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMake hashMake = new HashMake();
        HashMake user1 = new HashMake(1L, "Ganyu", "01011111234");
        HashMake user2 = new HashMake(2L, "hudao", "01011112414");
        HashMake user3 = new HashMake(3L, "miko", "01011115678");

        users.put(user1, user1);
        users.put(user2, user2);
        users.put(user3, user3);

        if(users.containsKey(user1)){
            System.out.println("User found in the collection");
        }
    }
}