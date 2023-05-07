package org.example;

import java.util.ArrayList;

public class HashMake {
    ArrayList<Object>[] hashTable = new ArrayList[100];

    //해시 값 만드는 부분..
    public int hashMake(int key){
        int keyCul = key%8;
        return keyCul;
    }

    public void saveData(int key, Object inputData){
        int hashAddress = hashMake(key);
        int nextHash = 0;
        hashTable.add(inputData);
//        if(hashTable[hashAddress+nextHash] == null){
//            hashTable[hashAddress+nextHash] = inputData;
//        }
//        else{
//            for(int success = 0; success<1;){
//                if(hashTable[hashAddress+nextHash] != null){
//                    hashTable[hashAddress+nextHash] = inputData;
//                    nextHash = 0;
//                    success ++;
//                }
//                else{
//                    nextHash += 1;
//                }
//            }
//        }

    }
    public Object readData(int key){
        int hashAddress = hashMake(key);
        return hashTable[hashAddress];
    }

    public void deleteData(int key){
        int hashAddress = hashMake(key);

    }

}
