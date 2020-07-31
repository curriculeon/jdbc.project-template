package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class ApplicationRunnerTest {
    @Test
    public void testRun() { // TODO
        // Given
        ApplicationRunner myObject = new ApplicationRunner();

        // when
        myObject.run();

        //then
        Assert.assertNotNull(myObject.toString());
    }
}
