package com.myjava.december.firstweek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author dell
 */
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, target, 0);
        return list;
    }

    // {2, 3, 5, 6, 7};
    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int remain, int start) {
        if (remain < 0) {
            return;
        }else if (remain==0){
            list.add(new ArrayList<>(tempList));
        }else {
            for (int i=start;i<nums.length;i++) {
                tempList.add(nums[i]);
                backtrack(list,tempList,nums,remain-nums[i],i);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}

