package com.android.a19110313_doanthithanhvan;

import org.junit.After;
import  org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.junit.runners.JUnit4;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import  static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(JUnit4.class)
public class ExampleUnitTest {
    private Calculator mCalculator;
    @Before
    public void setUp()
    {
        mCalculator = new Calculator();

    }
    @After
    public void tearDown()
    {

    }
    /**Test Phep Cong**/
    @Test
    public void addTwoNumbers()
    {
        double result = mCalculator.add(1d,2d);
        assertEquals(result,3.0d,0.6d);
    }
    @Test
    public void addNegative()
    {
        double result = mCalculator.add(-1d,2d);
        assertEquals(result,1d,0d);
    }
    @Test
    public void addTwoNumbersFloats1()
    {
        double result = mCalculator.add(2.33d,3.44d);
        assertEquals(result,5.77d,0d);
    }
    @Test
    public void addTwoNumbersFloats2()
    {
        double result = mCalculator.add(1.1111f,1.1111d);
        assertEquals(result,2.222,0.01d);
    }
    @Test
    public void addBigTwoNumbers()
    {
        double result = mCalculator.add(55362d,12352d);
        assertEquals(result,67714d,1d);
    }
    /**Test Phep Tru**/
    @Test
    public void subTwoNumbers()
    {
        double result = mCalculator.sub(5d,3d);
        assertEquals(result,2.0d,0.5d);
    }
    @Test
    public void subNegative()
    {
        double result = mCalculator.sub(-4d,-2d);
        assertEquals(result,-3.0d,1d);
    }
    @Test
    public void subTwoNumbersFloats1()
    {
        double result = mCalculator.sub(3.44d,2.11d);
        assertEquals(result,1.33d,0d);
    }
    @Test
    public void subTwoNumbersFloats2()
    {
        double result = mCalculator.sub(2.1111f,1.1111d);
        assertEquals(result,0.999,0.01d);
    }

    @Test
    public void subBigTwoNumbers()
    {
        double result = mCalculator.sub(55362d,12352d);
        assertEquals(result,43010,1d);
    }

    /**Test Phep Nhan**/

    @Test
    public void MulTwoNumbers()
    {
        double result = mCalculator.mul(5d,2d);
        assertEquals(result,9.0d,1d);
    }
    @Test
    public void MulNegative()
    {
        double result = mCalculator.mul(-3d,2d);
        assertEquals(result,-6.0d,0d);
    }
    @Test
    public void MulTwoNumbersFloats1()
    {
        double result = mCalculator.mul(2.33d,3.44d);
        assertEquals(result,8.015d,0.1d);
    }
    @Test
    public void MulTwoNumbersFloats2()
    {
        double result = mCalculator.mul(1.1111f,1.1111d);
        assertEquals(result,1.23,0.01d);
    }
    @Test
    public void MulBigTwoNumbers()
    {
        double result = mCalculator.mul(5120d,120d);
        assertEquals(result,614400d,0d);
    }

    /**Test Phep Chia**/

    @Test
    public void DivTwoNumbers()
    {
        double result = mCalculator.div(10d,2d);
        assertEquals(result,5.0d,1d);
    }
    @Test
    public void DivNegative()
    {
        double result = mCalculator.div(-30d,2d);
        assertEquals(result,-15d,0d);
    }
    @Test
    public void DivTwoNumbersFloats1()
    {
        double result = mCalculator.div(6.444d,2d);
        assertEquals(result,3.222d,0.1d);
    }
    @Test
    public void DivTwoNumbersFloats2()
    {
        double result = mCalculator.div(1.1111f,1.1111d);
        assertEquals(result,0.9999,0.01d);
    }
    @Test
    public void DivBigTwoNumbers()
    {
        double result = mCalculator.div(51320d, 120d);
        assertEquals(result,427.666d,1d);
    }
    /**Test Phep Mu**/

    @Test
    public void PowerTwoNumbers()
    {
        double result = mCalculator.power(10d,2d);
        assertEquals(result,100.0d,1d);
    }
    @Test
    public void PowerNegative()
    {
        double result = mCalculator.power(-3d,2d);
        assertEquals(result,9d,0d);
    }
    @Test
    public void PowerTwoNumbersFloat()
    {
        double result = mCalculator.power(5.5d,2.5d);
        assertEquals(result,70d,1d);
    }

    @Test
    public void PowerBigTwoNumbers()
    {
        double result = mCalculator.power(120d, 3d);
        assertEquals(result,1728000d,1d);
    }
    public void PowerTwoNumbers1()
    {
        double result = mCalculator.power(3d,2d);
        assertEquals(result,27.0d,1d);
    }

    @Test
    public void PowerTwoNumbers2()
    {
        double result = mCalculator.power(5d,3d);
        assertEquals(result,125.0d,1d);
    }
    /**Test Phep Giai Thua**/

    @Test
    public void GiaiThuaNumber()
    {
        double result = mCalculator.giaithua(4d);
        assertEquals(result,24.0d,1d);
    }
    @Test
    public void GiaithuaBigNumber()
    {
        double result = mCalculator.giaithua(10d);
        assertEquals(result,3628800d,1d);
    }

}