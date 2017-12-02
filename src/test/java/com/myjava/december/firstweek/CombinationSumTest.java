package com.myjava.december.firstweek;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class CombinationSumTest {
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void combinationSum() {
        int[] nums = {2, 3, 5, 6, 7};
        int target=7;
        List<List<Integer>> list = new ArrayList<>();
        list = new CombinationSum().combinationSum(nums, target);
        System.out.println(list.toString());
    }

}