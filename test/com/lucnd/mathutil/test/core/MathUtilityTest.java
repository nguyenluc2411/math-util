/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.lucnd.mathutil.test.core;

import com.lucnd.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author ADMIN
 */
public class MathUtilityTest {
   // Đây là class sẽ xử dụng các hàm của thư viện/ framework JUnit
   // để test code getFactorial(x)
  
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        int n = 0;
        long expected = 1;
        long actual = MathUtil.getFactorial(n);
        // So sanh expected vs actual framwork
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(1, MathUtil.getFactorial(1)); // case 1! == 1
        Assert.assertEquals(2, MathUtil.getFactorial(2)); // case 2! == 2
        Assert.assertEquals(6, MathUtil.getFactorial(3)); // case 3! == 6
        Assert.assertEquals(24, MathUtil.getFactorial(4)); // case 4! == 24
        Assert.assertEquals(120, MathUtil.getFactorial(5)); // case 5! == 120
        Assert.assertEquals(120, MathUtil.getFactorial(6)); // case 6! == 720
        
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowsException() {
        MathUtil.getFactorial(-5);
    }
    
    // throw exception case input 21
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_LambdaVersion() {
        IllegalArgumentException assertThrows = Assert.assertThrows(IllegalArgumentException.class,
                () -> MathUtil.getFactorial(21));
    }
    
    //throw exception trycatch
     @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_TryCatch() {
        
         try {
              MathUtil.getFactorial(-5);
         } catch (Exception e) {
             Assert.assertEquals("Invalid argument. N must be between 0..20", e.getMessage());
         }
        
    }
    
}
