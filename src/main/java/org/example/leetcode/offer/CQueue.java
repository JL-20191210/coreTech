package org.example.leetcode.offer;

import java.util.LinkedList;
/**
 * @author felix
 * @date 2023/3/21 16:39
 *
 * 两个栈实现队列
 * 栈1入，栈2出；栈2为空则将栈1中元素压入栈2中，若栈2为空则返回-1
 */
public class CQueue {
        LinkedList<Integer> stack1;
        LinkedList<Integer> stack2;
        public CQueue() {
                stack1 = new LinkedList<>();
                stack2 = new LinkedList<>();
        }

        public void appendTail(int value) {
                stack1.push(value);
        }

        public int deleteHead() {
                while(stack2.isEmpty()){
                        while(!stack1.isEmpty()){
                                stack2.push(stack1.pop());
                        }
                        if(stack2.isEmpty()) return -1;
                }
                return stack2.pop();
        }
    }
