<<<<<<< HEAD
package com.company;

public class Main {

    public static void main(String[] args) {
        Vector a = new Vector(1, 2, 3);
        Vector b = new Vector(4, 5, 6);

        double sp = a.scalarProduct(b);
        System.out.println("Scalar product = " + sp);

        Vector c = a.vectorProduct(b);
        System.out.println("Vector product = " + c);

        double cos = a.cosOfAngleBetweenVectors(b);
        System.out.println("Cosine between vectors = " + cos);

        Vector[] vectors = Vector.generateArray(10);
        for (int i = 0; i < vectors.length; i++) {
            System.out.println("Vector[" + i + "] = " + vectors[i]);
        }
    }

}
=======
package com.company;

public class Main {

    public static void main(String[] args) {
        Vector a = new Vector(1, 2, 3);
        Vector b = new Vector(4, 5, 6);

        double sp = a.scalarProduct(b);
        System.out.println("Scalar product = " + sp);

        Vector c = a.vectorProduct(b);
        System.out.println("Vector product = " + c);

        double cos = a.cosOfAngleBetweenVectors(b);
        System.out.println("Cosine between vectors = " + cos);

        Vector[] vectors = Vector.generateArray(10);
        for (int i = 0; i < vectors.length; i++) {
            System.out.println("Vector[" + i + "] = " + vectors[i]);
        }
    }

}
>>>>>>> 86bafe84785c30c602aab861e2122e84437b1ad1
