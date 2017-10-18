package com.myjava.october.secondweek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * author hawken
 * date 2017.10.12
 *
 * based on 3Sum
 */
public class FourSum {
    // FourSum based on 3Sum
    // 思路:基于3Sum的想法,排序后先判断前四个,再判断第一个和最后三个;接着是在循环里面判断前三个和最后一个的和与target的比较
    public List<List<Integer>> fourSum(int[] num, int target) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        int len = num.length;
        if (len < 4) return ans;
        Arrays.sort(num);
        for (int i = 0; i < len - 3; i++) {
            if (num[i] + num[i + 1] + num[i + 2] + num[i + 3] > target) break;
            if (num[i] + num[len - 1] + num[len - 2] + num[len - 3] < target)
                continue;
            if (i > 0 && num[i] == num[i - 1]) continue; // 去掉重复的
            for (int j = i + 1; j < len - 2; j++) {
                if (num[i] + num[j] + num[j + 1] + num[j + 2] > target) break;
                if (num[i] + num[j] + num[len - 1] + num[len - 2] < target) continue;
                if (j > i + 1 && num[j] == num[j - 1]) continue;
                int low = j + 1, high = len - 1;
                while (low < high) {
                    int sum = num[i] + num[j] + num[low] + num[high];
                    if (sum == target) {
                        ans.add(Arrays.asList(num[i], num[j], num[low], num[high]));
                        while (low < high && num[low] == num[low + 1]) low++;
                        while (low < high && num[high] == num[high - 1]) high--;
                        low++;
                        high--;
                    } else if (sum < target) low++;
                    else high--;
                }
            }
        }
        return ans;
    }
}

