package com.company;

import java.util.*;
import java.util.Comparator;


public class Main {
    static List<Integer> result = new ArrayList<>();

    static void sortList(List<Integer> intList) {
        for (int x : intList) {
            // найдем положительные числа
            if (x <= 0) continue;
            // найдем четные числа
            if (x % 2 == 1) continue;
            result.add(x);
        }
        Collections.sort(result, Comparator.naturalOrder());
        System.out.println(result);
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        sortList(intList);

        StreamMain a = new StreamMain(intList);
        a.sortListStream();

    }
}
