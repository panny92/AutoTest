package com.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("suite之前");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("suite之后");
    }

    @BeforeTest
    public void beforeTest()
    {
        System.out.println("berforeTest用例");

    }
    @AfterTest
    public void afterTest()
    {
        System.out.println("afterTest用例");

    }

}
