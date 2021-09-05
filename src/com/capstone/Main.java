package com.capstone;

import com.capstone.app.StressTest;
import com.capstone.generate.GenerateArray;
import com.capstone.generate.GenerateChar;
import com.capstone.generate.GenerateString;
import com.capstone.generate.GenerateInt;

public class Main {
    public static void main(String[] args) {

        String arr = GenerateString.getPhrase();
        System.out.println(arr);
    }
}
