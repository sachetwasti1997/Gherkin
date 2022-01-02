package awesomecucumber.stepdef;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

import java.util.List;

public class MyStepdefsDataTableSingleRow {
    @Given("my credentials")
    public void myCredentials(DataTable dataTable) {
        List<String> credentials = dataTable.values();
//                                 dataTable.row(0);
        System.out.println("USERNAME= "+credentials.get(0));
        System.out.println("PASSWORD= "+credentials.get(1));
    }
}
