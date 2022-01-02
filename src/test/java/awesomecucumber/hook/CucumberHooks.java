package awesomecucumber.hook;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class CucumberHooks {

    @BeforeAll
    public static void beforeAll(){
        System.out.println("\nIN BEFORE ALL\n");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("\nIN AFTER ALL\n");
    }

}
