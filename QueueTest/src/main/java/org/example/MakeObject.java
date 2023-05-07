package org.example;

public class MakeObject extends ObjectMake{
//    ObjectMake ListTest = new ObjectMake();
//    Queue<Integer> queue = new LinkedList<>();

//    ObjectMake objectmake = new ObjectMake();

    void addQueue(int userInput){
        addLast(userInput);
    }

     void delQueue(){
         delFirst();
    }

    void allDelQueue(){
        allDelete();
    }

    public int sizeCheck(){
        int returnSize = size();
        return returnSize;
    }

    Object[] allData(){
        return allDataPrint();
    }


}
