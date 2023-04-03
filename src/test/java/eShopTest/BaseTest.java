package eShopTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {


    @BeforeSuite
    public void openBrowser(){
        System.out.println("OPen browser");
    }
    @BeforeTest
    public void openSite(){
        System.out.println("OPen site");
    }
    @AfterTest(alwaysRun = true)
    public void closeBrowser(){
        System.out.println("Close browser");
    }
}
