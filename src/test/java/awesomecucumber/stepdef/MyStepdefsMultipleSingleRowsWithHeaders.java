package awesomecucumber.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.it.Ma;

import java.util.List;
import java.util.Map;

public class MyStepdefsMultipleSingleRowsWithHeaders {

    @Given("my credentials with multiple rows and headers")
    public void def(List<Map<String, String>> mapList){
        mapList.forEach(System.out::println);
    }

}
