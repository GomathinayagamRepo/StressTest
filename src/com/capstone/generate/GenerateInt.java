package com.capstone.generate;

import java.util.Random;

public class GenerateInt {

    static Random random = new Random();
    static int rInt;

    //generates +ve and -ve short
    public static Integer getShort(){
        rInt = random.nextInt();
        return (rInt%3000);
    }

    //generates +ve short
    public static Integer getPosShort(){
        rInt = random.nextInt(3000);
        return Math.abs(rInt);
    }

    //generates -ve short
    public static Integer getNegShort(){
        rInt = random.nextInt(3000);
        rInt = -1* Math.abs(rInt);
        return rInt;
    }

    // generates +ve and -ve integers
    public static Integer getInt(){
        rInt = random.nextInt();
        return rInt;
    }

    // generates +ve integers
    public static Integer getPosInt(){
        rInt = random.nextInt();
        return Math.abs(rInt);
    }

    // generates -ve integers
    public static Integer getNegInt(){
        rInt = Math.abs(random.nextInt(500));
        return -1*rInt;
    }

    // generates Integers in a range (+ve and -ve)
    public static Integer getInt(int a,int b){
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        rInt = random.nextInt(max - min) + min;
        return rInt;
    }

}
