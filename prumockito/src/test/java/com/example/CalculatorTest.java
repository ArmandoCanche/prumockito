package com.example;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testMockAdd() {
        Calculator mockCalculator = mock(Calculator.class);
        when(mockCalculator.add(2, 3)).thenReturn(10);
        assertEquals(10, mockCalculator.add(2, 3));
    }
}
