    package com.company;


    //https://www.geeksforgeeks.org/array-rotation/
    //Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
    //using Reversal Algorithm

    import java.util.Arrays;

    public class Code2 {
        public static void main(String[] args) {
            int arr[] = {1,2,3,4,5,6,7};
            int d = 2;
            rotate(arr,d,arr.length);
            System.out.println(Arrays.toString(arr));

        }
        static void rotate(int arr[],int d,int n){
            reverseArray(arr,0,d-1);
            reverseArray(arr,d,n-1);
            reverseArray(arr,0,n-1);
        }

        static void reverseArray(int arr[],int l,int h){
            while(l<h){
                int temp = arr[h];
                arr[h] = arr[l];
                arr[l]=temp;
                h--;
                l++;
            }
        }
    }
