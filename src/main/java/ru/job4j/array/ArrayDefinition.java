package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Slava";
        names[1] = "Michael";
        names[2] = "Maria";
        names[3] = "Daria";
        System.out.println("name in index 0: " + names[0]);
        System.out.println("name in index 1: " + names[1]);
        System.out.println("name in index 2: " + names[2]);
        System.out.println("name in index 3: " + names[3]);
        System.out.println("length variable ages : " + ages.length);
        System.out.println("length variable surnames : " + surnames.length);
        System.out.println("length variable prices : " + prices.length);
    }
}
