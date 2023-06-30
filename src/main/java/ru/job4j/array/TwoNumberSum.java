package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = 1;
        while (i < array.length) {
            if (target == array[i] + array[j]) {
                return new int[]{i, j};
            }
            if (j < array.length - 1) {
                j++;
            } else {
                j = i++;
            }
        }
        return new int[]{};
    }
}