package org.example.services;

import org.example.calculatorService.Calculator;
import org.junit.*;
import org.w3c.dom.ls.LSOutput;

public class TestCalculator {


    @Test(timeout = 2000)
    public void addTest(){
//        System.out.println("addTest Method...");
//        try{
//            Thread.sleep(3000);
//
//        }catch (Exception e){
//
//        }
       int res= Calculator.add(12,12);

       //actual result

        //expected result
        int expected=22;

        Assert.assertEquals(expected,res);

    }

    @Test
    public void subTest(){
//        System.out.println("subTest Method...");
        int res=Calculator.sub(12,10);
        int expected=2;

        Assert.assertEquals(expected,res);
    }

    @Test
//    @BeforeClass
    public  void  nameTest(){
//        System.out.println("nameTest Method...");
        String res=Calculator.PrintName("Dinesh");
        String expected="Dinu";
//        String result ="Dinesh";
        Assert.assertEquals(expected,res);
    }
    @BeforeClass
    public static void display(){
//        System.out.println("Before All test Cases in Display Method...1");
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

    @After
    public  void afterClassAnnoOnly(){

        System.out.println("After Annotation Only...");
    }

    @Before
    public void beforeEachCase(){
        System.out.println("Before Each cases...");
    }

}
