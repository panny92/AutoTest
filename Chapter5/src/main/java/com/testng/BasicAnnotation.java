package com.testng;


import org.testng.annotations.*;

public class BasicAnnotation{
    @Test

    public void testCase1(){
        System.out.println("这是测试用例1");

    }
    @Test
    public void testCase2(){
        System.out.println("这是测试用例2");

    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("这是测试方法之前运行");

    }

    @AfterMethod
    public void AfterMethod(){
        System.out.println("这是测试方法之之后运行");

    }


    @BeforeClass
    public void beforeClass(){
        System.out.println("这是类运行之前运行");

    }

    @AfterClass
    public void afterClass(){
        System.out.println("这是类运行之后运行");

    }


    @BeforeSuite
    public void beforeSuite(){
        System.out.println("测试套件类运行之前运行");

    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("测试套件类运行之后运行");

    }

    public static class DependTest {
    }
}
