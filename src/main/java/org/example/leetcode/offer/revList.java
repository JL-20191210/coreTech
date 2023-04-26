package org.example.leetcode.offer;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author felix
 * @date 2023/3/23 17:23
 */

public class revList {
    public int[] reversePrint(ListNode head) {
        ListNode node = head;
        int count = 0;
        while(node!=null){
            count++;
            node = node.next;
        }
        node = head;
        int[] ints = new int[count];
        for (int i = count-1; i >= 0; i++) {
            ints[i] = node.val;
            node = node.next;
        }
        return ints;
    }
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while(cur!=null){
            ListNode node = cur.next;
            cur.next = pre;
            pre = cur;
            cur = node;
        }
        return pre;
    }
}
