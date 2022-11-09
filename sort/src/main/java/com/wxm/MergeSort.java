package com.wxm;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 一个数组排序，同时也是输出的数组
 * 分成的两个数组，我把它分为是左边数组  和  右边数组
 */
public class MergeSort {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入整数的个数:");
        int a = sc.nextInt();
        System.out.println("请输入整数;");
        Integer[]  arr = new Integer[a];
        for(int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        sort(arr);

        for(Integer integer: arr){
            System.out.print(integer);
            System.out.print(" ");
        }
    }

    public static void merge(Integer[] arr, int l, int mid, int r) {
        //定义一个复制的数组   用Arrays接口的copyOfRange()来定义这个数组
        Integer[] aux = Arrays.copyOfRange(arr, l, r + 1);
        int i = l;
        int j = mid + 1;
        for(int k=l;k<=r;k++){ //左边元素合并完了以后，直接把右边的元素 弄到排序后的数组arr
            if(i>mid){
                arr[k] = aux[j-l];
                j++;
            }
            else if(j>r){
                arr[k] = aux[i-l];
                i++;
            }
            else if(aux[i-l].compareTo(aux[j-l])<0){ //保证左 右元素有序地放进arr中去
                arr[k] = aux[i-l];                   //左边的元素小就放左边的
                i++;
            }
            else{
                arr[k] = aux[j-l];
                j++;
            }
        }
    }
    public static void sort(Integer[] arr,int l,int r){
        if(r<=l){
            return;
        }
        int mid = (l + r) / 2;
        //使用递归调用自己  排序左右数组
        sort(arr,l,mid);
        sort(arr,mid+1,r);
        if(arr[mid].compareTo(arr[mid+1])>0){
            merge(arr,l,mid,r);
        }
        }
    public static void sort(Integer[] arr){
        int n = arr.length;
        sort(arr,0,n-1);
    }

}
