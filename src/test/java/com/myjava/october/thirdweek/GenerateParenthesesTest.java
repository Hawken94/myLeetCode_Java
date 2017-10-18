package com.myjava.october.thirdweek;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GenerateParenthesesTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void generateParentheses() throws Exception {
        new GenerateParentheses().generateParentheses(3);
        System.out.println(new GenerateParentheses().generateParentheses2(3));
    }

}