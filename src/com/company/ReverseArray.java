package com.company;

public class ReverseArray {

    static void ReverseArray(int a[], int n) {
        for(int i=n-1 ; i>=0 ; i--)
        {
            System.out.println(a[i]);
        }

    }

    public static void main(String[] args)
    {
        int [] arr = {10, 20, 30, 40, 50};
        ReverseArray(arr, arr.length);
    }

}
