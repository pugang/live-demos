package org.gradle.tests2;

import org.junit.Test;

public class Test17 {
    @Test
    public void myTest() throws Exception {
        Thread.sleep(5);
        if (false) {
           org.junit.Assert.assertTrue(false);
        }
    }
}