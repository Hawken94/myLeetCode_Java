package com.myjava.october.secondweek;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet4SumTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void fourSum() throws Exception {
        ArrayList<List<Integer>> res = new ArrayList<>();
        res.add(Arrays.asList(-4, 0, 1, 2));
        int[] num = {-1, 0, 1, 2, -1, -4};
        System.out.println(new FourSum().fourSum(num,-1));
        Assert.assertEquals(new FourSum().fourSum(num,-1),res);
    }

}