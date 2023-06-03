package com.wxm;

import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("请输入要排序的整数的个数:");
        int n = scn.nextInt();
        Integer[] in = new Integer[n];
        System.out.println("请输入排序的数组:");
        for (int i = 0; i < n; i++) {
            in[i] = scn.nextInt();
        }
        //对输入的数组进行快排
        quickSort(in,0,in.length-1);
        for(Integer a :in){
            System.out.print(a+" ");
        }
    }

    static void quickSort(Integer[] in,int l,int r){
        if(l>=r){
            return;
        }
        int p = partition(in,l,r);
        quickSort(in,p+1,r);
        quickSort(in,l,p-1);
    }

    static int partition(Integer[] in, int l, int r) {
        int j = l;
        //暂存第一个元素
        Integer v = in[l];
        for (int i = l + 1; i <= r; i++) {
            //这里要注意交换条件和交换的个体
            if (in[i].compareTo(v) < 0) {
                j++;
                //小元素放在j左侧,大元素自然就在j右侧了
                swap(in, j, i);
            }
        }
        //这是把拿出的元素放进该放进j位置
        swap(in, l, j);
        return j;
    }
    static void swap(Integer[] in,int a,int b){
        int temp = in[a];
        in[a] = in[b];
        in[b] = temp;
    }
}
