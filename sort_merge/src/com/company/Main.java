package com.company;

public class Main {

    public static int[] mergeSort(int[] array){

        if (array.length<=1) return array;
        int[] result = new int[array.length];
        int mid = array.length/2;
        int[] left = new int[mid];
        int[] right;
        if (array.length%2==0){
            right=new int[mid];
        }else{
            right=new int[mid+1];
        }

        for (int i = 0; i < mid; i++) {
            left[i]=array[i];
        }
        for (int j = 0; j < right.length; j++) {
            right[j]=array[mid+j];
        }

        left=mergeSort(left);
        right=mergeSort(right);

        result = merge(left,right);
        return result;

    }

    private static int[] merge(int[] left, int[] right) {
        int leftpointer = 0,rightpointer = 0,resultpointer=0;
        int[] result = new int[left.length+right.length];

        while (leftpointer<=left.length||rightpointer<=right.length){
            if (leftpointer<=left.length&&rightpointer<=right.length){
                if (left[leftpointer]<right[rightpointer]){
                    result[resultpointer++]=left[leftpointer++];
                }
                else if (left[leftpointer]>right[rightpointer]){
                    result[resultpointer++]=right[rightpointer++];
                }
            }
            else if (leftpointer<left.length){
                result[resultpointer++]=left[leftpointer++];
            }
            else if (rightpointer<right.length){
                result[resultpointer++]=right[rightpointer++];
            }
        }
        return result;
    }

    public static void main(String[] args) {
	// write your code here
        int[] array = {1 ,9,8,7,6,5,666,4,44};
        printarray(array);
        mergeSort(array);
        printarray(array);

    }

    private static void printarray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
