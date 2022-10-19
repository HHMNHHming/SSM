package com.wxm;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ShellSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入整数的个数:");
        int a = scanner.nextInt();
        System.out.println("请输入要输入的数:");
        Integer[] arr = new Integer[a];
        for (int i = 0; i < a; i++) {
            arr[i] = scanner.nextInt();
        }
        shellSort(arr);
        for (Integer integer : arr) {
            System.out.print(integer);
            System.out.print(" ");
        }
        //Collections.copy(); 集合实现深拷贝，里面需要是基础的数据类型。引用类型copy的是地址。

    }

    public static void shellSort(Integer[] arr) {
        int n = arr.length;
        int j;
        for (int gap = n / 2; gap > 0; gap = gap / 2) {
            for (int i = gap; i < n; i++) {
                Integer temp = arr[i];
                for (j = i; j - gap >= 0 && temp.compareTo(arr[j - gap]) < 0; j = j - gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }
    }
}
