package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int[] arr = new int[s.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=Integer.parseInt(s[i]);
        }
        //Insertion sort
        for (int k = 1; k < arr.length; k++) {
            int i = k-1;
            int value = arr[k];
            while (i>=0 && arr[i]>value){
                arr[i+1] = arr[i];
                i--;
            }
            arr[i+1]=value;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
