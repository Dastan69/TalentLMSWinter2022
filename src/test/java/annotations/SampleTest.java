package annotations;

import org.testng.Assert;
import org.testng.annotations.*;

public class SampleTest {

    @BeforeMethod
    public void beforeMethod(){

        System.out.println("Before Method");

    }
    @Test(groups = "group1")
    public void demoTest1(){

        System.out.println("Demo Test 1");
    }

    @Test(groups = "group1")
    public void demoTest2(){

        System.out.println("Demo Test 2");
        Assert.assertEquals("100","100");
    }



    @AfterMethod
    public void afterMethod(){

        System.out.println("After Method");

    }

    @BeforeClass
    public void beforeClass(){

        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClass(){

        System.out.println("After Class");
    }

    @BeforeTest
    public void beforeTest(){

        System.out.println("Before Test");
    }


    @AfterTest
    public void afterTest(){

        System.out.println("After Test");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite");
    }

    @BeforeGroups(groups = "group1")
    public void beforeGroups(){

        System.out.println("Before Groups");
    }
    @AfterGroups(groups = "group1")
    public void afterGroups(){

        System.out.println("After Groups");
    }

}
