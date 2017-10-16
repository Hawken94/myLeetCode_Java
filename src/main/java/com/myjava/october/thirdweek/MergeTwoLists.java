package com.myjava.october.thirdweek;

/**
 * @author hawken
 */
@SuppressWarnings("ALL")
public class MergeTwoLists {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    /**
     * mergeTwoLists class Function
     *
     * @param l1
     * @param l2
     * @return 思路：以一条链表l2为基准，当其他的链表元素比它大，直接移动了l1，否则移动l2
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode fakehead = new ListNode(0);
        ListNode l3 = fakehead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                l3.next = l1;
                l1 = l1.next;
            } else {
                l3.next = l2;
                l2 = l2.next;
            }
            l3 = l3.next;
        }
        if (l1 != null) {
            l3.next = l1;
        }
        if (l2 != null) {
            l3.next = l2;
        }
        return fakehead.next;
    }

    /**
     * mergeTwoListsByRecursive
     *
     * @param l1
     * @param l2
     * @return 思路：使用递归;如果l1.Val > l2.Val,则l1继续与l2.Next比较,以此类推;反之,类似.
     */
    public ListNode mergeTwoListsByRecursive(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val > l2.val) {
            ListNode tmp = l2;
            tmp.next = mergeTwoListsByRecursive(l1, l2.next);
            return tmp;
        } else {
            ListNode tmp = l1;
            tmp.next = mergeTwoListsByRecursive(l1.next, l2);
            return tmp;
        }
    }

}


