package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner num = new Scanner(System.in);
        System.out.println("Enter quantity");
        int n = num.nextInt(), i = 0 ;
        int[] a = new int[n];
        System.out.println("Enter the numbers");
        for(i = 0 ; i < n ; i++){
           a[i] = num.nextInt();
           //System.out.println(a[i]);
        }
        System.out.println("Enter the number to be searched");
        int b = num.nextInt();
        boolean found = false;
        for(int j = 0; j< n; j++ ){
            if(a[j]== b){
                System.out.printf("Number found at %d position\n",j+1);
                found = true;
            }
        }
        if(!found){
            System.out.println("Not found");
        }
    }
}
