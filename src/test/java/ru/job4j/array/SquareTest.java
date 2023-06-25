package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("test for [#33488]")
public class SquareTest {

    @Test
    public void whenBound4Then0149() {
        int bound = 4;
        int[] expected = {0, 1, 4, 9};
        int[] result = Square.calculate(bound);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenBound3Then014() {
        int bound = 3;
        int[] result = Square.calculate(bound);
        int[] expected = new int[]{0, 1, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenBound5Then014916() {
        int bound = 5;
        int[] result = Square.calculate(bound);
        int[] expected = new int[]{0, 1, 4, 9, 16};
        assertThat(result).containsExactly(expected);
    }
}