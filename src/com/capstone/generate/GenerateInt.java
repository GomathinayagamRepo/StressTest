package com.capstone.generate;

import java.util.Random;

public class GenerateInt {

    static Random random = new Random();
    static int rInt;

    //generates +ve and -ve short
    public static short getShort(){
        rInt = random.nextInt();
        return (short) (rInt%3000);
    }

    //generates +ve short
    public static short getPosShort(){
        rInt = random.nextInt(3000);
        return (short) Math.abs(rInt);
    }

    //generates -ve short
    public static short getNegShort(){
        rInt = random.nextInt(3000);
        rInt = -1* Math.abs(rInt);
        return (short) rInt;
    }

    // generates +ve and -ve integers
    public static int getInt(){
        rInt = random.nextInt();
        return rInt;
    }

    // generates +ve integers
    public static int getPosInt(){
        rInt = random.nextInt();
        return Math.abs(rInt);
    }

    // generates -ve integers
    public static int getNegInt(){
        rInt = Math.abs(random.nextInt(500));
        return -1*rInt;
    }

    // generates Integers in a range (+ve and -ve)
    public static int getInt(int a,int b){
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        rInt = random.nextInt(max - min) + min;
        return rInt;
    }

}
