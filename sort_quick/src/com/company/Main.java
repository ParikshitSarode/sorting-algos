package com.company;

public class Main {


    static void quickSort(int[] arr, int low ,int high){

        if (low>high) return;
        int mid = arr.length/2;
        int pivot = arr[mid];
        int i = low;
        int j = high;
        while (i<=j){
            while (arr[i]<pivot) i++;
            while (arr[j]>pivot) j--;
            if (i>=j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        if (low<j) quickSort(arr,low,j);
        if (high>i) quickSort(arr,i,high);
    }

    public static void main(String[] args) {
	// write your code here
        int arr[] = {5,4,3,7,8,99,77,55};
        quickSort(arr,0,arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
