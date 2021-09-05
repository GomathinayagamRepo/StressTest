package com.capstone.generate;

import java.util.Arrays;
import java.util.Random;

public class GenerateArray {
    static Random random = new Random();
    static int arrLength ;

    // generate a Sorted Integer Array
    public static int [] getSortIntArray(){
        arrLength = random.nextInt(50)+1;
        int arr[] = new int[arrLength];
        for(int i=0;i<arrLength;i++){
            arr[i] = GenerateInt.getShort();
        }
        Arrays.sort(arr);
        return arr;
    }

    // generate an Integer Array
    public static int [] getIntArray(){
        arrLength = random.nextInt(50)+1;
        int arr[] = new int[arrLength];
        for(int i=0;i<arrLength;i++){
            arr[i] = GenerateInt.getShort();
        }
        return arr;
    }

    // generates a Positive Integer Array
    public static int [] getPosArray(){
        arrLength = random.nextInt(50)+1;
        int arr[] = new int[arrLength];
        for(int i=0;i<arrLength;i++){
            arr[i] = GenerateInt.getPosShort();
        }
        return arr;
    }

    // generates a negative Integer Array
    public static int [] getNegArray(){
        arrLength = random.nextInt(50)+1;
        int arr[] = new int[arrLength];
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
    public static int [][] getPosSqrMat(){
        int n = random.nextInt(10)+1;
        int arr[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = GenerateInt.getPosShort();
            }
        }
        return arr;
    }

    // generates a Negative Square Matrix
    public static int [][] getNegSqrMat(){
        int n = random.nextInt(10)+1;
        int arr[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = GenerateInt.getNegShort();
            }
        }
        return arr;
    }

    // generates a Square Matrix
    public static int [][] getSqrMat(){
        int n = random.nextInt(10)+1;
        int arr[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = GenerateInt.getShort();
            }
        }
        return arr;
    }

    // generates a Matrix
    public static int [][] getMat(){
        int n = random.nextInt(10)+1;
        int m = random.nextInt(10)+1;
        int arr[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = GenerateInt.getShort();
            }
        }
        return arr;
    }

    // generates a Positive Matrix
    public static int [][] getPosMat(){
        int n = random.nextInt(10)+1;
        int m = random.nextInt(10)+1;
        int arr[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = GenerateInt.getPosShort();
            }
        }
        return arr;
    }

    // generates a Positive Matrix
    public static int [][] getNegMat(){
        int n = random.nextInt(10)+1;
        int m = random.nextInt(10)+1;
        int arr[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = GenerateInt.getNegShort();
            }
        }
        return arr;
    }
}
