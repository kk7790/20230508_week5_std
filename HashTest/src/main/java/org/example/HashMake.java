package org.example;

import java.util.ArrayList;

public class HashMake {
    ArrayList<String> hashTable = new ArrayList<String>(10);

    //해시 값 만드는 부분..
    public int hashMake(int key){
        return key%10;
    }

    public void saveData(int key, String inputData){
        int hashAddress = hashMake(key);
        int nextHash = 0;
        int inputPoint = hashAddress+nextHash;
        System.out.println("출력" + hashTable.get(0)); // get 에서 에러발생..
        String aaa = (hashTable.get(hashAddress + nextHash));
        //해시값 중복을 피하기 위한
        System.out.println("출력" + aaa);
        if(hashTable.get(hashAddress + nextHash) == null){
            hashTable.add(inputPoint,inputData);
        }
        else{
            for(int success = 0; success<1;){
                if(hashTable.get(hashAddress + nextHash) != null){
                    hashTable.add(inputPoint,inputData);
                    nextHash = 0;
                    success ++;
                }
                else{
                    nextHash += 1;
                    inputPoint = hashAddress+nextHash;
                }
            }
        }

    }
    public Object readData(int key){
        int hashAddress = hashMake(key);
        return hashTable.get(hashAddress);
    }

    public void deleteData(int key){
        int hashAddress = hashMake(key);
        hashTable.set(hashAddress, null);
    }

}
