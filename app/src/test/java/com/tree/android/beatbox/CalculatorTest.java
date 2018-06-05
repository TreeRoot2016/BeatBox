package com.tree.android.beatbox;

import junit.framework.Assert;

import org.junit.Test;

/**
 * <pre>
 *     author : tree_root
 *     e-mail : xxx@xx
 *     time   : 2018/06/05
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public class CalculatorTest {


    public void testAdd() throws Exception {
        Calculator calculator = new Calculator();
        int sum = calculator.add(1, 2);
        Assert.assertEquals(3, sum);
    }
}
