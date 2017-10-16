package com.myjava.october.secondweek;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LeetValidParenthesesTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isValide() throws Exception {
        String s = "(){}[]";
        Assert.assertEquals(new ValidParentheses().isValide(s),true);
    }

}