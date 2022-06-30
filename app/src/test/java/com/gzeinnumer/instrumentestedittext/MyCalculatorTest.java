package com.gzeinnumer.instrumentestedittext;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MyCalculatorTest {

    @Mock
    private ServiceCalculator serviceCalculator;

    // object to test
    private MyCalculator myCalculator;

    private int num1 = 10;
    private int num2 = 5;

    @Before
    public void setUp() {
        myCalculator = new MyCalculator();
        myCalculator.setServiceCalculator(serviceCalculator);
        myCalculator.setNum1(num1);
        myCalculator.setNum2(num2);
    }

    @Test
    public void addTest_shouldCorrect() {
        // mock the behaviour of service calculator
        when(serviceCalculator.add(num1, num2)).thenReturn(15);
        assertEquals("Result should be 15", 15, myCalculator.add());
    }

    @Test
    public void substractTest_shouldCorrect() {
        // mock the behaviour of service calculator
        when(serviceCalculator.substract(num1, num2)).thenReturn(5);
        assertEquals("Result should be 5", 5, myCalculator.substract());
    }

    @Test
    public void multiplyTest_shouldCorrect() {
        // mock the behaviour of service calculator
        when(serviceCalculator.multiply(num1, num2)).thenReturn(50);
        assertEquals("Result should be 50", 50, myCalculator.multiply());
    }

    @Test
    public void divideTest_shouldCorrect() {
        // mock the behaviour of service calculator
        when(serviceCalculator.divide(num1, num2)).thenReturn(2);
        assertEquals("Result should be 2", 2, myCalculator.divide());
    }
}
