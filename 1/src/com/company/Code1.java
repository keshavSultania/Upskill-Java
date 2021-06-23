package com.company;
import java.util.Arrays;

//https://www.geeksforgeeks.org/array-rotation/
//Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.

public class Code1 {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int d = 2;
        rotate(arr,d,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void rotate(int a[],int d,int n){
        for(int i=0;i<d;i++){
            leftRotateByOne(a,n);
        }
    }

    static void leftRotateByOne(int arr[], int n){
        int temp = arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[n-1] = temp;
    }

}
