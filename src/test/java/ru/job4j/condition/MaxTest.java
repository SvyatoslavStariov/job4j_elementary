package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax5To2Then5() {
        int left = 5;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax5Equals5Then5() {
        int left = 5;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2Equals3Equals4Then4() {
        int a = 2;
        int b = 3;
        int c = 4;
        int result = Max.max(a, b, c);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2Equals3Equals7Then7() {
        int a = 2;
        int b = 3;
        int c = 7;
        int result = Max.max(a, b, c);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2Equals3Equals4Equals9Then9() {
        int a = 2;
        int b = 3;
        int c = 4;
        int d = 9;
        int result = Max.max(a, b, c, d);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax9Equals3Equals4Equals2Then2() {
        int a = 9;
        int b = 3;
        int c = 4;
        int d = 2;
        int result = Max.max(a, b, c, d);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }
}