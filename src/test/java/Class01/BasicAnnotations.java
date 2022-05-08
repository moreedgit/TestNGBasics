package Class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.security.PublicKey;

public class BasicAnnotations {
    // test cases are run alphabetically
    @Test
    public void firstTest(){
        System.out.println("This is my first testcase");
    }

    @Test
    public void secondTest(){
        System.out.println("My second test");
    }

    @Test
    public void thirdTest(){
        System.out.println("My third test");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println(" **** I am @Before method*****" );
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("***** Post Condition @AfterMethod *******");
    }
}
