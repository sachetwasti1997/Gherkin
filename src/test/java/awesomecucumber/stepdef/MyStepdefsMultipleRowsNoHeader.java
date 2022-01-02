package awesomecucumber.stepdef;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

import java.util.List;

public class MyStepdefsMultipleRowsNoHeader {
    @Given("my credentials with multiple rows")
    public void myCredentialsWithMultipleRows(DataTable dataTable) {
        List<List<String>> lists = dataTable.asLists();
        System.out.println("ROW 0 USERNAME = "+lists.get(0).get(0));
        System.out.println("ROW 0 PASSWORD = "+lists.get(0).get(1));
        System.out.println("ROW 1 USERNAME = "+lists.get(1).get(0));
        System.out.println("ROW 1 PASSWORD = "+lists.get(1).get(1));
    }
}
