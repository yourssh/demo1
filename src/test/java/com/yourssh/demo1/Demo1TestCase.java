package com.yourssh.demo1;

import junit.framework.Assert;

import org.junit.Test;

public class Demo1TestCase {

    @Test
    public void testFoo() {
        Assert.assertEquals(5, Demo1.foo(2, 3));
    }

    @Test
    public void testBar() {
        Assert.assertEquals("aa,bb", Demo1.bar(new String[] { "aa", "bb" }));
    }
}
