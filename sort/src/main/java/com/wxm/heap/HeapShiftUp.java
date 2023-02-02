package com.wxm.heap;

public class HeapShiftUp<T extends Comparable> {
    private T[] data;
    private int count;
    private int capacity;

    public HeapShiftUp(int capacity){
        data = (T[]) new Comparable[capacity+1];
        count=0;
        this.capacity=capacity;
    }

    public int size(){
        return count;
    }
    public boolean isEmpty(){
        return count==0;
    }
    public void insert(T item){
        assert count+1<capacity;
        data[count+1]=item;
        count++;
        shiftUp(count);
    }
    public void swap(int i,int j){
        T temp =data[i];
        data[i] =data[j];
        data[j] = temp;
    }
    public void shiftUp(int k){
        while(k>1&&data[k/2].compareTo(data[k])<0){
        swap(k/2,k);
        k=k/2;
        }
    }

    public static void main(String []args){
        HeapShiftUp<Integer> heapShiftUp = new HeapShiftUp<Integer>(100);
        for(int i=0;i<50;i++) {
            heapShiftUp.insert(new Integer((int)Math.random() * 100));
            System.out.println(heapShiftUp.size());
        }
    }
}
