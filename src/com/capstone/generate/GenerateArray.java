package com.capstone.generate;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class GenerateArray {
    static Random random = new Random();
    static int arrLength ;

    // generates a Sorted Integer Array
    public static Integer [] getSortIntArray(){
        arrLength = random.nextInt(50)+1;
        Integer arr[] = new Integer[arrLength];
        for(int i=0;i<arrLength;i++){
            arr[i] = GenerateInt.getShort();
        }
        Arrays.sort(arr);
        return arr;
    }

    // generates a Sorted Integer Array
    public static Integer [] getSortIntArray(int a,int b){
        arrLength = random.nextInt(50)+1;
        Integer arr[] = new Integer[arrLength];
        for(int i=0;i<arrLength;i++){
            arr[i] = GenerateInt.getInt(a,b);
        }
        Arrays.sort(arr);
        return arr;
    }

    // generates a Sorted Integer Array in DESC
    public static Integer [] getDescIntArray(int a,int b){
        arrLength = random.nextInt(50)+1;
        Integer arr[] = new Integer[arrLength];
        for(int i=0;i<arrLength;i++){
            arr[i] = GenerateInt.getInt(a,b);
        }
        Arrays.sort(arr, Collections.reverseOrder());
        return arr;
    }

    // generates an Integer Array
    public static Integer [] getIntArray(){
        arrLength = random.nextInt(50)+1;
        Integer arr[] = new Integer[arrLength];
        for(int i=0;i<arrLength;i++){
            arr[i] = GenerateInt.getShort();
        }
        return arr;
    }

    // generates an Integer Array in a range
    public static Integer [] getIntArray(int a,int b){
        arrLength = random.nextInt(50)+1;
        Integer arr[] = new Integer[arrLength];
        for(int i=0;i<arrLength;i++){
            arr[i] = GenerateInt.getInt(a,b);
        }
        return arr;
    }

    // generates a Positive Integer Array
    public static Integer [] getPosArray(){
        arrLength = random.nextInt(50)+1;
        Integer arr[] = new Integer[arrLength];
        for(int i=0;i<arrLength;i++){
            arr[i] = GenerateInt.getPosShort();
        }
        return arr;
    }

    // generates a negative Integer Array
    public static Integer [] getNegArray(){
        arrLength = random.nextInt(50)+1;
        Integer arr[] = new Integer[arrLength];
        for(int i=0;i<arrLength;i++){
            arr[i] = GenerateInt.getNegShort();
        }
        return arr;
    }

    // generates a lower string Array
    public static String [] getLowerStringArray(){
        arrLength = random.nextInt(50)+1;
        String arr[] = new String[arrLength];
        for(int i=0;i<arrLength;i++){
            arr[i] = GenerateString.getLowerWord();
        }
        return  arr;
    }

    // generates a upper string Array
    public static String [] getUpperStringArray(){
        arrLength = random.nextInt(50)+1;
        String arr[] = new String[arrLength];
        for(int i=0;i<arrLength;i++){
            arr[i] = GenerateString.getUpperWord();
        }
        return  arr;
    }

    // generates a string Array
    public static String [] getStringArray(){
        arrLength = random.nextInt(50)+1;
        String arr[] = new String[arrLength];
        for(int i=0;i<arrLength;i++){
            arr[i] = GenerateString.getWord();
        }
        return arr;
    }

    // generates a Positive Square Matrix
    public static Integer [][] getPosSqrMat(){
        int n = random.nextInt(10)+1;
        Integer arr[][] = new Integer[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = GenerateInt.getPosShort();
            }
        }
        return arr;
    }

    // generates a Negative Square Matrix
    public static Integer [][] getNegSqrMat(){
        int n = random.nextInt(10)+1;
        Integer arr[][] = new Integer[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = GenerateInt.getNegShort();
            }
        }
        return arr;
    }

    // generates a Square Matrix
    public static Integer [][] getSqrMat(){
        int n = random.nextInt(10)+1;
        Integer arr[][] = new Integer[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = GenerateInt.getShort();
            }
        }
        return arr;
    }

    // generates a Square Matrix in range
    public static Integer [][] getSqrMat(int a,int b){
        int n = random.nextInt(10)+1;
        Integer arr[][] = new Integer[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = GenerateInt.getInt(a,b);
            }
        }
        return arr;
    }

    // generates a Matrix
    public static Integer [][] getMat(){
        int n = random.nextInt(10)+1;
        int m = random.nextInt(10)+1;
        Integer arr[][] = new Integer[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = GenerateInt.getShort();
            }
        }
        return arr;
    }

    // generates a Matrix in range
    public static Integer [][] getMat(int a,int b){
        int n = random.nextInt(10)+1;
        int m = random.nextInt(10)+1;
        Integer arr[][] = new Integer[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = GenerateInt.getInt(a,b);
            }
        }
        return arr;
    }

    // generates a Positive Matrix
    public static Integer [][] getPosMat(){
        int n = random.nextInt(10)+1;
        int m = random.nextInt(10)+1;
        Integer arr[][] = new Integer[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = GenerateInt.getPosShort();
            }
        }
        return arr;
    }

    // generates a Negative Matrix
    public static Integer [][] getNegMat(){
        int n = random.nextInt(10)+1;
        int m = random.nextInt(10)+1;
        Integer arr[][] = new Integer[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = GenerateInt.getNegShort();
            }
        }
        return arr;
    }
}
