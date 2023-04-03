package eShopTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Function2 extends BaseTest {

    @BeforeMethod
    public void aaa(){
        System.out.println("Open catalog");
    }
    @Test(description = "hi",priority = 0)

    public void test2(){

        System.out.println("Testing prices of products");
    }
    @Test(priority = 1)

    public void test22(){

        System.out.println("Testing checking names of products");
    }
}

