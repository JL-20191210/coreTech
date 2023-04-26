package org.example.coreTech.algorithm;

import java.util.List;

/**
 * @author felix
 * @date 2023/4/26 15:37
 */
public  class binarySearch {
    public static int binarySearch(int[] ints,int key){
        int low = 0;
        int high = ints.length-1;
        int mid = -1;
        int guess = -1;
        while (low<=high){
            mid = (low+high)/2;
            guess = ints[mid];
            if(guess == key) return mid;
            if(guess<key) low = mid+1;
            if(guess>key) high = mid-1;
        }
        return mid;
    }

    public static void main(String[] args) {
        int[] ints = {1,3,6,8,9,10};
        System.out.println(binarySearch(ints,10));
        System.out.println(ints[binarySearch(ints,10)]);
    }
}
