package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {4, 2, 3, 1, 5};
        int temp = array[0];
        array[0] = array[3];
        array[3] = temp;

        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}