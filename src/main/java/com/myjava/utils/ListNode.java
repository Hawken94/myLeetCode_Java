package com.myjava.utils;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public static ListNode generateListNode(ListNode list, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (list != null) {
                list.next = list;
                list.val = arr[i];
            }
        }
        return list.next;
    }
}
