package org.example;

public class ListObject extends ObjectMake{
    //상속받았으면 부모의 기능 그대로 함수 걍 쓰면됨 ㅇㅇ 근데? 자식 함수에서 쓰는게 아니라, 자식함수를 호출할때 부모 기능까지 사용가능한거임ㄷㄷ
    //여기서 부모꺼 쓰면 에러남..

    //    List<Integer> listA = new ArrayList<Integer>();
    public void addObject(int userInput){
//        super.arrayDeclear();
        addLast(userInput);
    }

    public void addObjectFirst(int userInput){
//        super.arrayDeclear();
        addFirst(userInput);
    }

    public boolean delObject(){
        delLast();
        return true;
    }

    public boolean delObjectChoose(int userDelete){
        delObject(userDelete);
        return true;
    }
    public boolean delObjectFirst(){
        delFirst();
        allDataPrint();
        size();
        return true;
    }

    public boolean AllDelObject(){
        allDelete();
        return true;
    }


    public Object[] allData(){
        return allDataPrint();
    }

}
