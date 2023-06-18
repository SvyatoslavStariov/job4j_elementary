package ru.job4j.condition;

public class ChessBoard {

    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (isValid(x1) && isValid(x2)
                && isValid(y1) && isValid(y2)) {
            if (isDiagonal(x1, y1, x2, y2) && x1 != x2 && y1 != y2) {
                rsl = rsl == 0 ? Math.abs(x2 - x1) : rsl;
            }
        }
        return rsl;
    }

    private static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }

    private static boolean isDiagonal(int x1, int y1, int x2, int y2) {
        return (x1 + x2) % 2 == (y1 + y2) % 2;
    }
}