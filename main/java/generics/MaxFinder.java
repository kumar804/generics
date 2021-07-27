package main.java.generics;

public class MaxFinder {
    public static Float findMax(Float float1, Float float2, Float float3) {
        Float max = float1;
        if(float2.compareTo(max) > 0)
            max = float2;
        if(float3.compareTo(max) > 0)
            max = float3;
        System.out.printf("Max value of %s %s %s is %s. \n", float1, float2, float3, max);


        return max;
    }
    public static void main(String[] args) {
        Float float1 = 1.34f, float2 = 4.56f, float3 = 7.98f;
        findMax(float1, float2, float3);

    }
}
