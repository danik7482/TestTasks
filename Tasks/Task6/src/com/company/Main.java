<<<<<<< HEAD
package com.company;

public class Main {
    public static void main(String[] args) {
        fullList();
        bubbleSort(list);
        System.out.println(searchLinear(list, 777));
    }

    public static int[] list = new int[1000];

    public static void fullList() {
        for (int i = 0; i < list.length; i++) {
            list[i] = ((int)(Math.random() * 3245) - 134);
        }
    }

    public static int searchLinear(int[] array, int elementToFind) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("searhing at index: " + i + ", value: " + array[i]);
            if (array[i] == elementToFind) {
                System.out.println("found at index: " + i + ", value: " + array[i]);
                return i;
            }
        }
        System.out.println("not found: " + elementToFind);
        return -1;
    }

    public static int searchBinary(int[] array, int elementToFind) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        int middleIndex;
        while (startIndex <= endIndex) {
            middleIndex = startIndex + (endIndex - startIndex) / 2;

            if (array[middleIndex] == elementToFind) {
                return middleIndex;
            }

            if (array[middleIndex] > elementToFind) {
                endIndex = middleIndex - 1;
            } else {
                startIndex = middleIndex + 1;
            }
        }
        return -1;
    }

    public static void bubbleSort(int[] list) {

        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < list.length; i++) {
                if (list[i] < list[i - 1]) {
                    int temp = list[i];
                    list[i] = list[i - 1];
                    list[i - 1] = temp;
                    isSorted = false;
                }
            }
        }
    }

    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}
>>>>>>> 86bafe84785c30c602aab861e2122e84437b1ad1
