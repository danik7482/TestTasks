package com.company;

public class Main {

    public static void main(String[] args) {
        int[] list = new int[100];
        boolean voit = false;

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < list.length-1; i++) {
                if(list[i] > list[i+1]){
                    isSorted = false;

                    buf = list[i];
                    list[i] = list[i+1];
                    list[i+1] = buf;
                }
            }
        }

        for (int i = 0; i < list.length; i++) {
            list[i] = ((int)(Math.random() * 10000) - 234);
            //System.out.println(list[i]);
        }

        for (int i = 0; i < list.length; i++) {
            if (list[i] == 777) {
                voit = true;
            }
        }


        System.out.println(voit);
    }
}
