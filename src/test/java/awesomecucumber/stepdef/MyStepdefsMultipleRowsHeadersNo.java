package awesomecucumber.stepdef;

import awesomecucumber.objects.Customer;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class MyStepdefsMultipleRowsHeadersNo {

    @DataTableType
    public Customer customerEntry(List<String> credentials){
        return new Customer(credentials.get(0), credentials.get(1));
    }

    @Given("my credentials with multiple rows and no headers")
    public void myCreds(List<Customer> customers) {
        AtomicInteger i = new AtomicInteger();
        customers.forEach((c) -> {
            System.out.println("USERNAME"+i+" = "+c.getUsername());
            System.out.println("PASSWORD"+i+" = "+c.getPassword());
            i.getAndIncrement();
        });
    }
}
