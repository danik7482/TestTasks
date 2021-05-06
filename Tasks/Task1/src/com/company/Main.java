package com.company;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        int[] random = new int[15];

        for (int i = 0; i < random.length; i++) {
            random[i] = ((int) (Math.random() * 50));
            System.out.print(random[i] + " ");
            System.out.println();
        }

        int max = random[0];
        int min = random[0];
        for(int i = 0; i < random.length; i++) {
            if(random[i] > max)
                max = random[i];

            if(random[i] < min)
                min = random[i];
        }
        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }
}
