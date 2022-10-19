package com.wxm;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        Integer[] arr = new Integer[a];
        for (int i = 0; i < a; i++) {
            arr[i] = scanner.nextInt();
        }
        bubbleSort(arr);
        for (Integer integer : arr) {
            System.out.print(integer);
            System.out.print(" ");
        }
    }

    public static void bubbleSort(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1])
                    swap(arr, j,j - 1);
            }
        }
    }

    public static void swap(Integer[] arr, int a, int b) {
        Integer temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
