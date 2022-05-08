package Class01;

import org.testng.annotations.Test;

public class EnableAndDisable {

    //by default @test is always true and it runs, if we put enable to false, it will not run
    @Test (enabled = false)
    public void first(){
        System.out.println("1st");
    }
    @Test
    public void second(){
        System.out.println("2nd");

    }
    @Test
    public void third(){
        System.out.println("3rd");

    }
}
