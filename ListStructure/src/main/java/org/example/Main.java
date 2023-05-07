package org.example;

public class Main {
    public static void main(String[] args) {
        ListObject listObject = new ListObject();
        for(int i = 0; i < 10; i++){
            listObject.addObject(i+1);
        }
        listObject.addObjectFirst(99);

        listObject.delObject();
        listObject.delObjectFirst();
        listObject.delObjectChoose(3);
        listObject.AllDelObject();
    }
}