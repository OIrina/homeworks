package com.ira.homework2;


import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Ira on 16.10.2014.
 */
public class AnArrayTest {

    @Test
    public void testleftUnion (){

        System.out.println("Starting testleftUnion");

        int[] inputArrayFirst = {1, 2, 0, 3};
        int[] inputArraySecond = {3, 4, 5, 10, 20};

        int[] expectedValue = {1, 2, 0, 3, 3};

        int[] returnedValue = AnArray.leftUnion2(inputArrayFirst, inputArraySecond);
        System.out.println("Result array " + Arrays.toString(returnedValue));

        // assert return value
        Assert.assertArrayEquals(expectedValue, returnedValue);



    }
}
