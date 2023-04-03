import com.digital.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import org.testng.asserts.SoftAssert;
public class SoftAsserts {

    @Test
    public void testSum(){

        SoftAssert SA = new SoftAssert();

        System.out.println("\nRunning test -> testSum");
        Calculator obj = new Calculator();

        int result = Calculator.add(3,3);

       SA.assertEquals(result,5);
        System.out.println("\nLine after assert 1");
        SA.assertEquals(result,6);
        System.out.println("\nLine after assert 2");
        SA.assertAll();
    }

}
