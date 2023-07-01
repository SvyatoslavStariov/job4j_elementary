package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = array.length - 1;
        while (i < array.length) {
            if (target == array[i] + array[j]) {
                return new int[]{i, j};
            } else if (i == j) {
                j = array.length - 1 - i;
                i++;
            } else if (j > 0) {
                j--;
            }
        }
        return new int[]{};
    }
}