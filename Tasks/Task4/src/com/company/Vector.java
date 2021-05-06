package com.company;

public class Vector {

    public final double x;
    public final double y;
    public final double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public double scalarProduct(Vector other) {
        return x * other.x + y * other.y + z * other.z;
    }

    public Vector vectorProduct(Vector other) {
        double resultX = y * other.z - z * other.y;
        double resultY = z * other.x - x * other.z;
        double resultZ = x * other.y - y * other.x;
        return new Vector(resultX, resultY, resultZ);
    }

    public double cosOfAngleBetweenVectors(Vector other) {
        double length1 = this.length();
        double length2 = other.length();
        double scalarProduct = scalarProduct(other);
        return scalarProduct / (length1 * length2);
    }

    public static Vector[] generateArray(int n) {
        Vector[] result = new Vector[n];
        int maxLength = 100;
        for (int i = 0; i < n; i++) {
            result[i] = new Vector(
                    Math.random() * maxLength,
                    Math.random() * maxLength,
                    Math.random() * maxLength
            );
        }
        return result;
    }

    @Override
    public String toString() {
        return "Vector(x: " + x + " y: " + y + " z: " + z + ")";
    }
}
