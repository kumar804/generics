package main.java.generics;

import java.util.Arrays;

public class MaxFinder <T extends Comparable<T>>  {
    T x, y, z;
    public  MaxFinder(T x, T y, T z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public T maximum(){
        return MaxFinder.findMax(x, y, z);
    }
    public static <T> void printMax(T x, T y, T z, T max) {
        System.out.printf("Max of %s %s %s is %s \n", x, y, z, max);
    }
    public static <T extends Comparable<T>> T findMax(T x, T y, T z) {
        T max = x;
        if(y.compareTo(max) > 0)
            max = y;
        if(z.compareTo(max) > 0)
            max = z;

        printMax(x, y, z, max);
        return max;
    }


    public static void main(String[] args) {
        Integer integerValue1 = 10, integerValue2 =  34, integerValue3 = 27;
        Float floatValue1 = 16.75f, floatValue2 = 2.3f, floatValue3 =  8.76f;
        String stringValue1 = "apple", stringValue2 = "banana", stringValue3 = "orange";

        new MaxFinder(integerValue1, integerValue2, integerValue3).maximum();
        new MaxFinder(stringValue1, stringValue2, stringValue3).maximum();
        new MaxFinder(floatValue1, floatValue2, floatValue3).maximum();


    }
}
