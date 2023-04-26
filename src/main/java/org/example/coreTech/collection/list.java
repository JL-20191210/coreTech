package org.example.coreTech.collection;

import java.util.*;

/**
 * @author felix
 * @date 2023/3/28 17:01
 */
public class list {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        ArrayList<String> strs = new ArrayList<>();
        LinkedList<String> strings = new LinkedList<>();
        strs.add("hh");
        strs.add("hh");
        strs.add("hh");
        ArrayList<String> links = new ArrayList<>(strs);
        System.out.println(links);
        strings.addFirst("lin");
        strings.addFirst("kk");
        strings.addLast("wiki");
        System.out.println(strings);
    }
}
