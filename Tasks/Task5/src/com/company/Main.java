<<<<<<< HEAD
package com.company;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3};
        int[] weights = new int[]{1, 2, 10};
        System.out.println("Result = " + getNumber(numbers, weights));
    }

    private static int getNumber(int[] numbers, int[] weights) {

        int len = 0;
        for (int w : weights) {
            len = len + w;
        }

        int[] tmp = new int[len];
        int tmpIndex = 0;

        for(int i = 0; i < numbers.length; i++) {
            int n = numbers[i];
            int w = weights[i];
            for(int j = 1; j <= w; j++) {
                tmp[tmpIndex] = n;
                tmpIndex++;
            }
        }

        int resultIndex = (int)(Math.random() * len);
        return tmp[resultIndex];
    }
}
=======
package com.company;

public class Main {

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3};
        int[] weights = new int[]{1, 2, 10};
        System.out.println("Result = " + getNumber(numbers, weights));
    }

    private static int getNumber(int[] numbers, int[] weights) {

        int len = 0;
        for (int w : weights) {
            len = len + w;
        }

        int[] tmp = new int[len];
        int tmpIndex = 0;

        for(int i = 0; i < numbers.length; i++) {
            int n = numbers[i];
            int w = weights[i];
            for(int j = 1; j <= w; j++) {
                tmp[tmpIndex] = n;
                tmpIndex++;
            }
        }

        int resultIndex = (int)(Math.random() * len);
        return tmp[resultIndex];
    }
}
>>>>>>> 86bafe84785c30c602aab861e2122e84437b1ad1
