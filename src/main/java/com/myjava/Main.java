package com.myjava;

import com.myjava.eighthweek.LC9_6;
import com.myjava.eighthweek.LC9_6_2;
import com.myjava.forthWeek.LC8_12;
import com.myjava.forthWeek.LC8_13;
import com.myjava.forthWeek.LC8_13_1;
import com.myjava.ninethweek.LC9_12;
import com.myjava.secondweek.LC7_30;
import com.myjava.thirdweek.LC7_31;

public class Main {
    public static void main(String[] args) {
        /*int[] nums = {2, 3, 6, 7, 11, 12, 15};
        int target = 14;
        int[] result;*/

        //3Sum
        /*int[] S = {-1, -1, -1, 0, 2, 1, -2, 2, 4, 4};
        List<List<Integer>> res;*/

        /*result = new LC7_20().twoSum(nums, target);
        for (int i = 0; i < result.length; i++) {

            System.out.println(result[i]);
        }*/


        /*res = new LC7_21().threeSum(S);

        for (List<Integer> s : res) {
            for (int i : s) {
                System.out.println(i);
                *//*-2 0 2
                -1 -1 2
                -1 0 1*//*
            }
        }*/

    /*    //Add Two Numbers
        ListNode head1 = new ListNode(5);
        ListNode l1 = new ListNode(3);
        ListNode l2 = new ListNode(2);
        head1.next = l1;
        l1.next = l2;

//        ListNode head1=new ListNode();

        ListNode head2 = new ListNode(6);
        ListNode l3 = new ListNode(8);
        ListNode l4 = new ListNode(4);
        head2.next = l3;
        l3.next = l4;

        ListNode temp1, temp2;
        temp1 = head1;
        temp2 = head2;
        ListNode result = new LC7_22().addTwoNumbers(temp1, temp2);
// ListNode result = head2;
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }*/

        //Longest Substring Without Repeating Characters
        String str = "xxabcx";
        int res = new LC7_30().lengthOfLongestSubstring(str);
        System.out.println(res);


        //Longest Palindromic Substring
        System.out.println(new LC7_31().longestPalindrome("xxabcx"));

        // Reverse Integer
        System.out.println(new LC8_12().reverse(-2147));

        // MyAtoi String to Integer (atoi)
        System.out.println(new LC8_13().myAtoi("   -123"));

        // Palindrome Number
        System.out.println(new LC8_13_1().isPalindrome(1211111121));

        // ZigZag Conversion
//        System.out.println(new LC8_23().convert("PAYPALISHIRING", 3));

        // Integer to Roman
        System.out.println(new LC9_6().intToRoman2(1996));

        // Roman to Integer
        System.out.println(new LC9_6_2().romanToInt("MCMXCVI"));

        // Letter Combinations of a Phone Number
        System.out.println(new LC9_12().letterCombinations("23"));
    }
}
