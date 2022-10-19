package com.wxm;

import java.util.Scanner;

public class SelectSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        Integer[] arr = new Integer[a];
        for (int i = 0; i < a; i++) {
            arr[i] = scanner.nextInt();
        }
        selectSort(arr);
        for (Integer integer : arr) {
            System.out.print(integer);
            System.out.print(" ");
        }
    }

    public static void selectSort(Integer[] arr) {

        for (int i = 0; i < arr.length; i++) {
            //选择外层循环的一个元素arr[i]和内层的所有元素做比较
            //内层循环结束，找出这次遍历最小的元素
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
