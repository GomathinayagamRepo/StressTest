package com.capstone;

import com.capstone.app.StressTest;
import com.capstone.generate.GenerateArray;
import com.capstone.generate.GenerateChar;
import com.capstone.generate.GenerateString;
import com.capstone.generate.GenerateInt;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        int arr[] = { 13, 7, 6, 45, 21, 9, 2, 100 };
        Arrays.sort(arr);
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
