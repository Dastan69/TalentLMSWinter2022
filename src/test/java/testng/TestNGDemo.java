package testng;

import com.digital.User;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDemo {

    @Test
    public void createNewUserTest(){
        User firstUser = new User("John",30);
        Assert.assertNotNull(firstUser);
    }

    @Test(dependsOnMethods = "createNewUserTest")
    public void loginTest(){
        Assert.assertTrue(true);
    }

    @DataProvider(name = "inputValues")
    public Object[][] getInputValues(){
        return new Object[][]{
                {"John@gmail.com","ValidPass"},
                {"Johnggmail.com","ValidPass"},
                {"John@gmail.com","InvalidPass"},

        };
    }

    @Test(dataProvider = "inputValues")
    public void testLoginFun(String username,String password){
        System.out.println(username+" "+password);
    }


}
