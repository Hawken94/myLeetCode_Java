package com.myjava.firstweek;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LC7_21 {
    public List<List<Integer>> threeSum(int[] num) {
        // shpolsky的思路：
        //对输入数组进行排序，然后遍历三元组可能的第一个元素的所有索引。对每个可能的第一个元素，我们对数组剩下的部分进行标准双向2Sum扫描，同时，我们想跳过相等的元素，避免答案重复。

        Arrays.sort(num);  //对数组进行排序
        //  {-1, -1,-1， 0, 2, 1,2，4，4}
        List<List<Integer>> res = new LinkedList<>();
        for (int i = 0; i < num.length - 2; i++) {
            if (i == 0 || (i > 0 && num[i] != num[i - 1])) {
                int j = i + 1, k = num.length - 1, sum = 0 - num[i];
                while (j < k) {
                    if (num[j] + num[k] == sum) {
                        res.add(Arrays.asList(num[i], num[j], num[k]));
                        while (j < k && num[j] == num[j + 1]) j++;  //避免重复
                        while (j < k && num[k] == num[k + 1]) k--;
                        j++;
                        k--;
                    } else if (num[j] + num[k] < sum) {
                        j++;
                    } else k--;
                }
            }
        }
        return res;
    }
}
