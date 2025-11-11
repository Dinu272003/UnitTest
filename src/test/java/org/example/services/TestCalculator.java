package org.example.services;

import org.example.calculatorService.Calculator;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

public class TestCalculator {
   static  {
       System.out.println("Static block");
   }

    @Test
    public void addTest(){
        System.out.println("addTest Method...");

       int res= Calculator.add(12,12);

       //actual result

        //expected result
        int expected=24;
        int result =24;
        Assert.assertEquals(expected,result);

    }

    @Test
    public void subTest(){
        System.out.println("subTest Method...");
        int res=Calculator.sub(12,10);
        int expected=2;
        int result=2;
        Assert.assertEquals(expected,result);
    }

    @Test
//    @BeforeClass
    public  void  nameTest(){
        System.out.println("nameTest Method...");
        String res=Calculator.PrintName("Dinu");
        String expected="Dinesh";
        String result="Dinesh";

        Assert.assertEquals(expected,result);
    }
    @BeforeClass
    public static void display(){
        System.out.println("Before All test Cases in Display Method...1");
    }

    @BeforeClass
    public static void show(){
        System.out.println("Before All Test Cases in Show Method....");
    }

    //this is excuted after all Mehods..
    @AfterClass
    public static void afterClass(){
        System.out.println("After Class Annotation Method...");
    }


}
