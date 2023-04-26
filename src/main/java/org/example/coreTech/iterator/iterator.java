package org.example.coreTech.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author felix
 * @date 2023/3/23 11:10
 */
public class iterator {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("a");
        str.add("b");
        str.add("c");
        str.add("d");
        Iterator<String> it = str.iterator();
        System.out.println(it.next());
        while(it.hasNext()){
            System.out.println(it.next());
        }

        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(10);
        ints.add(12);
        ints.add(9);
        ints.add(27);

        Iterator<Integer> its = ints.iterator();
        while(its.hasNext()){
            if(its.next()<10) its.remove();
        }
        System.out.println(ints);
    }
}
