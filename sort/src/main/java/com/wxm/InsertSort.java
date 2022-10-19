package com.wxm;

import java.util.Scanner;

public class InsertSort {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入整数的个数:");
        int a = scanner.nextInt();
        Integer[] array = new Integer[a];
        for(int i=0;i<a;i++){
            array[i] = scanner.nextInt();
        }
        InsertSort.sort(array);
        for(Integer integer: array){
            System.out.print(integer);
            System.out.print(" ");
        }
    }
    public static void sort(Integer[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            //插入排序，只需要拿无序区的一个元素，然后交换到有序区行了。
            //冒泡排序，第二层循环是两两作比较
            for(int j=i;j>0;j--){
                if(arr[j].compareTo(arr[j-1])<0){
                    swap(arr,j,j-1);
                }
                else break;
            }
        }
    }
    public static void swap(Integer[] arr,int a ,int b){
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] = temp;
    }
}
