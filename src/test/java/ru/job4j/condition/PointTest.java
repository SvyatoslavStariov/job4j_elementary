package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        Point one = new Point(0, 0);
        Point second = new Point(2, 0);
        double expected = 2;
        Assert.assertEquals(expected, one.distance(second), 0.01);
    }

    @Test
    public void when02to04then2() {
        Point one = new Point(0, 2);
        Point second = new Point(0, 4);
        double expected = 2;
        Assert.assertEquals(expected, one.distance(second), 0.01);
    }

    @Test
    public void when62to66then4() {
        Point one = new Point(6, 2);
        Point second = new Point(6, 6);
        double expected = 4;
        Assert.assertEquals(expected, one.distance(second), 0.01);
    }

    @Test
    public void when33to31then2() {
        Point one = new Point(3, 3);
        Point second = new Point(3, 1);
        double expected = 2;
        Assert.assertEquals(expected, one.distance(second), 0.01);
    }
}