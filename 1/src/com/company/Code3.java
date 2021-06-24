package com.company;
import java.util.Arrays;

//Program to cyclically rotate an array by one
//https://www.geeksforgeeks.org/c-program-cyclically-rotate-array-one/
public class Code3 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        rotateByOne(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void rotateByOne(int arr[], int n){
        int  start = 0; int end = n-1;
        while(start<end){
            int temp = arr[start];
            arr[start] =  arr[end];
            arr[end] = temp;
            start++;
        }
    }
}
