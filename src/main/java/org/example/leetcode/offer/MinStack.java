package org.example.leetcode.offer;

import org.w3c.dom.Node;

/**
 * @author felix
 * @date 2023/3/21 16:45
 */
class MinStack {
    private Node head;
    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int x) {
        if(head==null){
            head = new Node(x,x,null);
        }else{
            head = new Node(x,Math.min(x,head.min),head);
        }
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int min() {
        return head.min;
    }

    public class Node{
        int val;
        int min;
        Node next;
        public Node(int val,int min,Node next){
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */
