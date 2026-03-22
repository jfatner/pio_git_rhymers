package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class FIFORhymerTest {

    @Test
    public void shouldReturnElementsInFifoOrder() {
        FIFORhymer testQueue = new FIFORhymer();

        int firstInput = 17;
        int secondInput = 25;
        int thirdInput = 99;

        testQueue.countIn(firstInput);
        testQueue.countIn(secondInput);
        testQueue.countIn(thirdInput);

        Assert.assertEquals("Zgodnie z FIFO, pierwszy wrzucony element ma wyjsc najpierw", firstInput, testQueue.countOut());
        Assert.assertEquals("Zgodnie z FIFO, drugi element powinien wyjsc jako drugi", secondInput, testQueue.countOut());
        Assert.assertEquals(thirdInput, testQueue.countOut());
    }
}