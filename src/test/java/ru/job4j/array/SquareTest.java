package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

@DisplayName("test for [#33488]")
public class SquareTest {

    @Test
    public void whenBound4Then0149() {
        int bound = 4;
        int[] expected = {0, 1, 4, 9};
        int[] result = Square.calculate(bound);
        Assert.assertArrayEquals(expected, result);
    }
}