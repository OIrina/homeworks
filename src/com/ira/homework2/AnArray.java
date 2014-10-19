package com.ira.homework2;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Ira on 12.10.2014.
 */
public class AnArray {
    public static void main(String[] args) {
        int[] leftArray = {1, 5, 4, 23, 65, 32, 78};
        int[] rightArray = {3, 5, 24, 4, 1, 2, 34, 45, 32, 5};
        int[] result;

        result = leftUnion(leftArray, rightArray);

        System.out.println("LeftUnion Array is: ");
        printResult(result);

        result = innerUnion(leftArray, rightArray);

        System.out.println("InnerUnion Array is: ");
        printResult(result);

        result = outerUnion(leftArray, rightArray);

        System.out.println("OuterUnion Array is: ");
        printResult(result);
    }

    public static void printResult(int[] array) {
        for (int c : array) {
            System.out.println(c);
        }
    }

    public static int[] trimArray(int[] inputArray){
        int counter = 0;
        for (int i : inputArray) {
            if (i != 0) {
                counter++;
            }
        }

        int[] resultArray = new int[counter];
        counter = 0;
        for (int i : inputArray) {
            if (i != 0) {
                resultArray[counter] = i;
                counter++;
            }
        }
        return resultArray;

    }

    public static int[] leftUnion(int[] leftArray, int[] rightArray) {
        int[] result = new int[leftArray.length + rightArray.length];

        System.arraycopy(leftArray, 0, result, 0, leftArray.length);


        int a = leftArray.length;
        for (int i = 0; i < rightArray.length; i++) {
            for (int j = 0; j < leftArray.length; j++) {
                if (leftArray[j] == rightArray[i]) {
                    result[a] = rightArray[i];
                    a++;
                    break;
                }
            }

        }

        return trimArray(result);
    }

    public static int[] innerUnion(int[] leftArray, int[] rightArray) {
        int[] result = new int[leftArray.length];

        int a = 0;
        for (int i = 0; i < leftArray.length; i++) {
            for (int j = 0; j < rightArray.length; j++) {
                if (leftArray[i] == rightArray[j]) {
                    result[a] = leftArray[i];
                    a++;
                    break;
                }
            }
        }
        return trimArray(result);

    }

    public static int[] outerUnion(int[] leftArray, int[] rightArray) {
        int[] result = new int[leftArray.length + rightArray.length];

        int a = 0;
        try {
            for (int i = 0; i < leftArray.length; i++) {
                for (int j = 0; j < rightArray.length; j++) {
                    if (leftArray[i] != rightArray[j]) {
                        result[a] = leftArray[i];
                        a++;
                    }
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException e) {
            int b = 0;
        }
        return trimArray(result);

    }

    public static int[] leftUnion2(int[] leftArray, int[] rightArray) {
        if(leftArray == null || rightArray == null) {
            return new int[]{};
        }

        Arrays.sort(leftArray);
        Arrays.sort(rightArray);
        int[] leftUnion2 = null;
        int[] innerUnion = innerUnion(leftArray, rightArray);
        int numberInnerElements = innerUnion.length;
        int numberOfElements = (firstArr.length + secondArr.length) - numberInnerElements * 2;
        int elementsIndex = 0;
    }
}

