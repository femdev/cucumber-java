package com.glue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
//
//Given I am running a test
//When I go to execute
//Then the test should fail each time
public class FeatureNameStep {

    @Given("^I am running a test$")
    public void xthat_i_am_a_logged_in_parent() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @When("^I go to execute$")
    public void xi_view_the_kid_list_page() throws Throwable {
        Assert.assertEquals(true, true);
    }

    @Then("^the test should fail each time$")
    public void xi_should_see_a_link_to_add_kids() throws Throwable {
        Assert.assertEquals(true, true);
    }
}
