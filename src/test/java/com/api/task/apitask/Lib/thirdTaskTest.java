package com.api.task.apitask.Lib;
import com.api.task.apitask.Lib.thirdTask;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
public class thirdTaskTest {


    @Test
    public void thirdTask1() throws Exception {
        thirdTask t3 = new thirdTask();
        int[] X = {3, 4};
        int[] output = t3.thirdTask(2, X);
        int[] expected = {3, 3};
        Assert.assertArrayEquals(expected, output);
    }

    @Test
    public void thirdTask2() throws Exception {
        thirdTask t3 = new thirdTask();
        int[] X = {3, 5, 5};
        int[] output = t3.thirdTask(3, X);
        int[] expected = {3, 4, 4};
        Assert.assertArrayEquals(expected, output);
    }

    @Test
    public void thirdTask3() throws Exception {
        thirdTask t3 = new thirdTask();
        int[] X = {1, 2, 0, 6};
        int[] output = t3.thirdTask(4, X);
        int[] expected = {1, 2, 0, 4};
        Assert.assertArrayEquals(expected, output);
    }

}


