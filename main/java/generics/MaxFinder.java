package main.java.generics;

public class MaxFinder {
    /*creating function findMax

    *Given 3 Strings find the maximum
 * Ensure to test code with the Test Case
     */
    public static String findMax(String string1, String string2, String string3) {
        String max = string1;
        if(string2.compareToIgnoreCase(max) > 0)
            max = string2;
        if(string3.compareToIgnoreCase(max) > 0)
            max = string3;
        System.out.printf("Max value of %s %s %s is %s. \n", string1, string2, string3, max);

        return max;
    }
    public static void main(String[] args) {
        String string1 = "apple", string2 = "banana", string3 = "orange";
        findMax(string1, string2, string3);

    }
}
