import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTest {


    @BeforeMethod
    public void beforeTestRuns() {
        System.out.println("before test");
    }



    @Test
    public void firstTest() {
        System.out.println("inside test");
    }

}
