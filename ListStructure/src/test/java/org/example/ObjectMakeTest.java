package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ObjectMakeTest {
    @Test //값 1개 넣어서 잘 들어갔나 확인
    public void arrayAddTest(){
        ListObject listObject = new ListObject();
        listObject.addObject(1);
        int[] checkArray = new int[1];
        checkArray[0] = 1;
        int realDataCheck = listObject.size();
        assertEquals(realDataCheck,checkArray.length);
    }

    @Test //잎뒤로 데이터가 제대로 들어갔나 확인
    public void arrayFirstAddTest(){
        ListObject listObject = new ListObject();
        listObject.addObject(1);

        Object[] realDataCheck = listObject.allData();
        listObject.addObjectFirst(99);
        int afterAdd = listObject.size();
        assertEquals(afterAdd,2);
    }

    @Test
    public void arrayDeleteTest(){
        ListObject listObject = new ListObject();
        listObject.addObject(1);
        listObject.addObject(2);
        listObject.addObject(3);
        listObject.delObject();
        int sizeResult = listObject.size();
        assertEquals(sizeResult,2);
    }

    @Test
    public void arrayChooseDeleteTest(){
        ListObject listObject = new ListObject();
        listObject.addObject(1);
        listObject.addObject(2);
        listObject.addObject(3);
        listObject.delObjectChoose(2);
        int sizeResult = listObject.size();
        Object[] checkArray = listObject.allData();
        assertEquals(checkArray[0],1);
        assertEquals(checkArray[1],3);
    }

    @Test
    public void arrayFirstDeleteTest(){
        ListObject listObject = new ListObject();
        listObject.addObject(1);
        listObject.addObject(2);
        listObject.addObject(3);
        listObject.delObjectFirst();
        Object[] checkArray = listObject.allData();
        assertEquals(checkArray[0],2);
        assertEquals(checkArray[1],3);
    }


    @Test
    public void arrayAllDeleteTest(){
        ListObject listObject = new ListObject();
        listObject.addObject(1);
        listObject.addObject(2);
        listObject.addObject(3);
        listObject.AllDelObject();
        Object[] checkArray = listObject.allData();
        assertEquals(checkArray[0],null);
    }
//    @Test
//    void mainTest22(){
//        ListObject listObject = new ListObject();
//        listObject.addLast(1);
////        listObject.allData();
//        for(int i = 0; i < 10; i++){
//            listObject.addObject(i+1);
//        }

//        System.out.println("1번째 값 삭제");
//        listObject.delObjectFirst();
//        listObject.allData();
//        listObject.size();
//        System.out.println("마지막 값 삭제");
//        listObject.delObject();
//        listObject.allData();
//        listObject.size();
//        System.out.println("임의의 값 맨 앞에 삽입");
//        listObject.addObjectFirst(99);
//        System.out.println("임의의 값 삭제");
//        listObject.delObjectChoose(3);
//        listObject.allData();
//        listObject.size();
//        System.out.println("전부 삭제합니다");
//        listObject.AllDelObject();
//    }

}