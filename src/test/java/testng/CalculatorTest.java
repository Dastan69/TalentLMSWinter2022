package testng;

import com.digital.Calculator;
import com.digital.SomeClass;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.IDataProviderAnnotation;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.lang.reflect.Array;

import static org.testng.Assert.*;

public class CalculatorTest {

    SoftAssert soft = new SoftAssert();
    @Test(dataProvider = "numbers")
    public void addTwoNumbersTest(int a, int b, int result){

        assertEquals(Calculator.add(a,b),result);


    }
    @DataProvider
    public static Object[][] numbers(){
        return new Object[][]{
                {2,2,4},
                {2,2,4},
                {2,2,4}
        };
    }

    @Test
    public void testSoftAssert(){

        soft.assertEquals(Calculator.add(2,3),5);
        soft.assertEquals(Calculator.add(2,3),6);
        soft.assertEquals(Calculator.add(2,3),5);
        soft.assertEquals(Calculator.add(2,3),7);
        soft.assertEquals(Calculator.add(2,3),5);
        soft.assertAll();
    }


    @Test
    public void testAssertTrue(){

        assertTrue(SomeClass.isFunny(true));

    }

    @Test
    public void test123(){

        assertNotNull(null);
    }

    @Test
    public void testString(){
        System.out.println("Running test -> testStrings");

        String expectedString = "Hello World";
        SomeClass obj = new SomeClass();

        String resultString = obj.addStrings("Hello","World");

        assertEquals(resultString,expectedString);
    }

    @Test
    public void testArrays(){
        System.out.println("Running test->  testArrays");

        int[] expectedArray = {1,2,3};
        SomeClass obj = new SomeClass();

        int[] resultArray = obj.getArray();

        assertEquals(resultArray,expectedArray);

        System.out.println("End of TestArray");

    }
    @Test(enabled = true)
    public void test234(){

        System.out.println("false");
    }
    @Test(dependsOnMethods = "addTwoNumbersTest")
    public void test23234(){

        System.out.println("depends");
    }

    @Test(timeOut = 1000)
    public void test2323234(){

        System.out.println("depends on time");
    }
    @Test
    public void testSleep(){

        assertTrue(Calculator.sleepIn(false,true));
    }

}
