package org.example.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MaxValues {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>() {
            {
                add(2);
                add(5);
                add(1);
                add(3);
                add(10);
                add(8);
            }
        };

Collections.sort(list);
        System.out.println(list);
    }

    public static Integer maximum(List<Integer> list) {
         return list.stream().max(Comparator.comparing(Integer::intValue)).orElse(null);
    }
}
