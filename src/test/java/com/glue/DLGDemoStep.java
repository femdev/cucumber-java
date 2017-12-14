package com.glue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
//
//Given i first run this test
//When i execute the test
//Then it will fail but soon it will pass
public class DLGDemoStep {

    @Given("^i first run this test$")
    public void ythat_i_am_a_logged_in_parent() throws Throwable {
        Assert.assertEquals(true, false);
    }

    @When("^i execute the test$")
    public void yi_view_the_kid_list_page() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @Then("^it will fail but soon it will pass$")
    public void yi_should_see_a_link_to_add_kids() throws Throwable {
        Assert.assertEquals(true, true);
    }
}
