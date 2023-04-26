package org.example.coreTech.algorithm;

import java.util.LinkedList;

/**
 * @author felix
 * @date 2023/4/26 16:58
 */
public class simpleSort {
    public static LinkedList simpleSort(LinkedList<Integer> ints){
        LinkedList<Integer> integers = new LinkedList<>();
        int length = ints.size();
        while(ints.size()>0) {
            int flag = smallest(ints);
            integers.add(ints.get(flag));
            ints.remove(flag);
        }
        return integers;
    }

    public static int smallest(LinkedList<Integer> ints){
        int samllest = ints.getFirst();
        int flag = -1;
        for (int i = 0; i < ints.size(); i++) {
            if(ints.size()==1) flag = 0;
            if(ints.get(i)<samllest) {
                samllest = ints.get(i);
                flag = i;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        LinkedList<Integer> ints = new LinkedList<Integer>();
        ints.add(10);
        ints.add(9);
        ints.add(8);
        ints.add(7);
        ints.add(6);
        ints.add(5);
        ints.add(4);
        ints.add(3);
        ints.add(2);
        LinkedList linkedList = simpleSort(ints);
        linkedList.forEach(System.out::println);
    }
}
