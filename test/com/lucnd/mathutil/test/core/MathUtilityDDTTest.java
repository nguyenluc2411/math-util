/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.lucnd.mathutil.test.core;

import com.lucnd.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author ADMIN
 */
@RunWith(value = Parameterized.class)
public class MathUtilityDDTTest {

    @Parameterized.Parameters
    public static Object[][] initData() {
        return new Integer[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {6, 720},};
    }
    
    @Parameterized.Parameter(value = 0)
    public int n;
    @Parameterized.Parameter(value = 1)
    public long expected;
    
    @Test
     public void testGetFactorialGivenRightArgumentReturnsWell() {
         Assert.assertEquals(expected, MathUtil.getFactorial(n));
     }
}
