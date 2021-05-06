package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2 ,3, 4, 5, 3, 5, 3, 5));
        System.out.println("Before deleting 3: " + list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 3) {
                list.remove(i);
            }
        }
        System.out.println("After deleting 3: " + list + " ");
    }
}
