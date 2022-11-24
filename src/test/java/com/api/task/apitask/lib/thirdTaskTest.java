package com.api.task.apitask.lib;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
public class thirdTaskTest {


    @Test
    public void thirdTask1() {
        thirdTask t3 = new thirdTask();
        int[] X = {3, 4};
        int[] output = t3.getMinCount(2, X);
        int[] expected = {3, 3};
        Assert.assertArrayEquals(expected, output);
    }

    @Test
    public void thirdTask2() {
        thirdTask t3 = new thirdTask();
        int[] X = {3, 5, 5};
        int[] output = t3.getMinCount(3, X);
        int[] expected = {3, 4, 4};
        Assert.assertArrayEquals(expected, output);
    }

    @Test
    public void thirdTask3() {
        thirdTask t3 = new thirdTask();
        int[] X = {1, 2, 0, 6};
        int[] output = t3.getMinCount(4, X);
        int[] expected = {1, 2, 0, 4};
        Assert.assertArrayEquals(expected, output);
    }

}


