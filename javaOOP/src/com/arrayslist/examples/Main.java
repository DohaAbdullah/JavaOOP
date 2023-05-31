package com.arrayslist.examples;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0, 1);
        list.add(5);
        list.add(2, 7);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (int num : list) {
            System.out.println(num);
        }

        for (Integer num : list) {
            System.out.println(num);
        }

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(20, 30, 40));
        System.out.println(list1);
        list1.set(0, 66);
        System.out.println(list1.get(0));
        System.out.println(list1);
        list1.remove(0);
        System.out.println(list1);
        list1.remove(0);
        System.out.println(list1);
        list1.remove((Integer) (20));
        System.out.println(list1);
        list1.remove(Integer.valueOf(40));
        System.out.println(list1);

    }
}
