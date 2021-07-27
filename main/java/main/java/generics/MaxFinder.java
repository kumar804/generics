package main.java.generics;

import java.util.Arrays;

public class MaxFinder<T extends Comparable<T>>  {
    T[] elements;

    public  MaxFinder(T[] elements) {
        this.elements = elements;
    }

    public T maximum() {
        return MaxFinder.findMax(elements);
    }

    public static <T> void printMax(T[] elements, T max) {
        for (T element : elements) {
            System.out.print(element);
        }
        System.out.printf("Max is %s \n", max);
    }

    public static <T extends Comparable<T>> T findMax(T[] elements) {
        Arrays.sort(elements);
        int length = elements.length;
        T max = elements[length - 1];

        return max;
    }





    public static void main(String[] args) {
        Integer[] integerValue = {10, 34, 27};
        Float[] floatValue = {16.75f, 2.3f, 8.76f, 45.76f};
        String[] stringValue = {"apple", "banana", "orange", "peach", "pomegranate"};

        new MaxFinder(integerValue).maximum();
        new MaxFinder(floatValue).maximum();
        new MaxFinder(stringValue).maximum();


    }
}
