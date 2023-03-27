package com.driver;

public class Main {

    public static class Product {
        public Product() {

        }

        public int product(int x, int y) {
            return x * y;
        }

        public int product(int x, int y, int z) {
            return x * y * z;
        }

        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        Product p = new Product();

        int a = p.product(24, 9);

        int b = p.product(24, 9, 23);

        double c = p.product(24.0, 9.0);

        System.out.print(a + " " + b + " " + c);
    }

}