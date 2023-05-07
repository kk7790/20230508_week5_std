package org.example;

public class ObjectMake {
    private int size=0;
    private int capacity=0;
    private Object[] elementData = new Object[0];

    //메모리 할당
//    public boolean arrayDeclear(){
//        elementData = new int[2];
//        size = 0;
//        capacity = 2;
//        return true;
//    }

    //메모리 크기 증가
    public void increaseArraySize(){
        Object[] tempArray = null;
        if(size == capacity){
            tempArray = new Object[capacity+100];
            {
                if(capacity >= 1){
                    System.arraycopy(elementData,0,tempArray,0,capacity);
                }
            }
        }
        elementData = tempArray;
        capacity += 100;
    }

    public void shrinkSize(){
        Object[] temp;
        if (size>0){
            temp = new Object[size];
            System.arraycopy(elementData, 0, temp, 0, size);
            capacity = size;
            elementData = temp;
        }
    }
    //add 구현
    public Object[] addLast(int element) {
        if(size == capacity){
            increaseArraySize();
        }
        elementData[size]=element;
        size++;
        return elementData;
    }
//Stack 과 queue에선 안씀..
    void addFirst(int element) {
        if(size == capacity){
            increaseArraySize();
        }
        for(int i=size; i>=0; i--){
            elementData[i+1] = elementData[i];
        }
        elementData[0] = element;
        size++;
    }

    public Object[] delLast(){
        if(size == 0){
            return elementData;
        }
        else{
            elementData[size -1] = 0;
            size --;
//            shrinkSize();
            return elementData;
        }
    }
    public Object[] delFirst(){
        if(size == 0){
            return elementData;
        }
        else{
            for(int i = 0; i<size ; i++){
                elementData[i]=elementData[i+1];
            }
            elementData[size] = null;
            size --;
//            shrinkSize();
            return elementData;
        }
    }

    public Object[] delObject(int userDelete){
        int remember = 0;
        if(size == 0){
            return elementData;
        }
        else{
            for(int i = 0; i<size ; i++){
                if((int) elementData[i] == userDelete){
                    remember = i;
                }
            }
            for(int j=remember; j<size;j++){
                elementData[j] = elementData[j+1];
            }
            elementData[size] = null;
            size --;
//            shrinkSize();
            return elementData;
        }
    }

    public Object[] allDelete(){
        if(size > 0){
            for(int i=0; i<=size;i++){
                elementData[i] = null;
            }
            size=0;
//            shrinkSize();
            return elementData;
        }
        else{
            return elementData;
        }
    }

    public int size(){
        return size;
    }

    public Object[] allDataPrint(){
//        System.out.print("현재 배열 값 : ");
//        for(int n = 0; n <size; n++){
//            System.out.print(elementData[n]);
//        }
//        System.out.println("");
        return elementData;
    }
    
}
