package Class01;

import org.testng.annotations.Test;

public class dependsOn {
    @Test
    public void logIn(){
        System.out.println("This is login");
    }

    @Test (dependsOnMethods = "login")
    public void verificationOfLogin(){
        System.out.println("This is dashboard");

    }
}

