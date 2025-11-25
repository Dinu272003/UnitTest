package org.example.services;

import org.example.calculatorService.MathProgram;
import org.junit.Assert;
import org.junit.Test;

public class MathProgramTest {

    MathProgram ob=new MathProgram();

    @Test
    public void positiveNumberTest(){
        Assert.assertEquals(24,ob.addNumber(12,12));
    }

    @Test
    public void negativeNumberTest(){
        Assert.assertEquals(10,ob.addNumber(-2,12));

    }
    @Test
    public void zeroNumberTest(){
        Assert.assertEquals(11,ob.addNumber(12,0));

    }
    @Test
    public void bothNumbersNegative(){
        Assert.assertEquals(-24,ob.addNumber(-12,-12));
    }


}

