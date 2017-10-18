package com.myjava.october;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.ArrayList;
import java.util.List;

/**
 * Leet4Sum Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>ʮ�� 13, 2017</pre>
 */
public class Leet4SumTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: fourSum(int[] num, int target)
     */
    @Test
    public void testFourSum() throws Exception {
        //TODO: Test goes here...
        int[] test = {1, 0, -1, 2, 1, 0, 3};
        List<Integer> res = new ArrayList<>();
        res.add(-1);
        res.add(0);
        res.add(0);
        res.add(1);
        Assert.assertEquals(1,new Leet4Sum().fourSum(test,1));
    }

} 
