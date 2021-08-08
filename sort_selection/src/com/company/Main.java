package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int[] arr = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            //System.out.println(s[i]);
            arr[i]=Integer.parseInt(s[i]);
            //System.out.println(arr[i]);
        }

        int min;
        for (int i = 0; i < arr.length-1; i++) {
            min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[min]>arr[j])
                    min = j;
            }
            int temp = arr[min];
            arr[min] =arr[i];
            arr[i]= temp;
        }
        

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
