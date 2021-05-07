<<<<<<< HEAD
package com.company;

public class Main {

    private static final double PRECISION = 0.001;

    private static int iterations = 0;

    public static void main(String[] args) {
        double x1 = 0;
        double x2 = 10;

        MyFunction f = new MyFunction();

        int serialIterations = (int) ((x2 - x1) / PRECISION);
        System.out.println("При последовательном поиске, " + "максимальное число попыток поиска: " + serialIterations);

        Double result = find(f, x1, x2, 0);

        System.out.println();
        System.out.println("Попыток поиска при делении отрезков " + "и случайном выборе: " + iterations);

        if (result == null) {
            System.out.println("Функция не пересекает ось X");
        } else {
            System.out.println("X = " + result);
        }
    }

    private static Double find(MyFunction f, double x1, double x2, int depth) {
        depth++;

        double m = x1 + (x2 - x1) / 2;

        Double result;

        double rand = Math.random();
        if (rand < 0.5) {
            result = analyze(f, x1, m, depth);
            if (result == null) {
                result = analyze(f, m, x2, depth);
            }
        }
        else {
            result = analyze(f, m, x2, depth);
            if (result == null) {
                result = analyze(f, x1, m, depth);
            }
        }

        return result;
    }

    private static Double analyze(MyFunction f, double x1, double x2, int depth) {
        iterations++;

        double y1 = f.getY(x1);
        double y2 = f.getY(x2);

       double dx = x2 - x1;

        if (y1 == 0) {

            return x1;
        }
        else if (y2 == 0) {

            return x2;
        }
        else if (y1 < 0 && y2 >0) {

            if (dx > PRECISION) {

                return find(f, x1, x2, depth);
            }
            else {

                return x1;
            }
        }
        else if (y2 < 0 && y1 > 0) {

            if (dx > PRECISION) {

                return find(f, x1, x2, depth);
            }
            else {

                return x1;
            }
        }

        else if (dx > PRECISION) {

            return find(f, x1, x2, depth);
        }
        else {

            return null;
        }

    }

    static class MyFunction {

        public double getY(double x) {
            
            return (x - 4) * (x - 4) - 4;
        }

    }
}
=======
package com.company;

public class Main {

    private static final double PRECISION = 0.001;

    private static int iterations = 0;

    public static void main(String[] args) {
        double x1 = 0;
        double x2 = 10;

        MyFunction f = new MyFunction();

        int serialIterations = (int) ((x2 - x1) / PRECISION);
        System.out.println("При последовательном поиске, " + "максимальное число попыток поиска: " + serialIterations);

        Double result = find(f, x1, x2, 0);

        System.out.println();
        System.out.println("Попыток поиска при делении отрезков " + "и случайном выборе: " + iterations);

        if (result == null) {
            System.out.println("Функция не пересекает ось X");
        } else {
            System.out.println("X = " + result);
        }
    }

    private static Double find(MyFunction f, double x1, double x2, int depth) {
        depth++;

        double m = x1 + (x2 - x1) / 2;

        Double result;

        double rand = Math.random();
        if (rand < 0.5) {
            result = analyze(f, x1, m, depth);
            if (result == null) {
                result = analyze(f, m, x2, depth);
            }
        }
        else {
            result = analyze(f, m, x2, depth);
            if (result == null) {
                result = analyze(f, x1, m, depth);
            }
        }

        return result;
    }

    private static Double analyze(MyFunction f, double x1, double x2, int depth) {
        iterations++;

        double y1 = f.getY(x1);
        double y2 = f.getY(x2);

       double dx = x2 - x1;

        if (y1 == 0) {

            return x1;
        }
        else if (y2 == 0) {

            return x2;
        }
        else if (y1 < 0 && y2 >0) {

            if (dx > PRECISION) {

                return find(f, x1, x2, depth);
            }
            else {

                return x1;
            }
        }
        else if (y2 < 0 && y1 > 0) {

            if (dx > PRECISION) {

                return find(f, x1, x2, depth);
            }
            else {

                return x1;
            }
        }

        else if (dx > PRECISION) {

            return find(f, x1, x2, depth);
        }
        else {

            return null;
        }

    }

    static class MyFunction {

        public double getY(double x) {
            
            return (x - 4) * (x - 4) - 4;
        }

    }
}
>>>>>>> 86bafe84785c30c602aab861e2122e84437b1ad1
