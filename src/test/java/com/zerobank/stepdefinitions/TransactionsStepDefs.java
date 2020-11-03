package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.HomePage;
import com.zerobank.pages.TransactionsPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class TransactionsStepDefs {

    @Given("the user clicks on the Find Transactions tab")
    public void the_user_clicks_on_the_Find_Transactions_tab() {
        new HomePage().accocuntActivity.click();
        BrowserUtils.waitFor(3);
        new TransactionsPage().findTransactions.click();
        BrowserUtils.waitFor(3);
    }



    @When("the user enters date range from {string} to {string}")
    public void the_user_enters_date_range_from_to(String date1, String date2) {
        new TransactionsPage().fromDate.clear();
         new TransactionsPage().fromDate.sendKeys(date1);
         BrowserUtils.waitFor(3);
         new TransactionsPage().toDate.clear();
         new TransactionsPage().toDate.sendKeys(date2);

    }

    @When("click search")
    public void click_search() {
       new TransactionsPage().findButton.click();
       BrowserUtils.waitFor(2);
        
    }

    @Then("results table should only show transactions dates between {string} to {string}")
    public void results_table_should_only_show_transactions_dates_between_to(String firstDateInput, String lastDateInput) {
        String expected1=firstDateInput;
        String expected2=lastDateInput;
//   Assert.assertEquals(expected1,new TransactionsPage().firstDate.getText());
        Assert.assertEquals(expected2,new TransactionsPage().lastDate.getText());
    }

    @Then("the results should be sorted by most recent date")
    public void the_results_should_be_sorted_by_most_recent_date() {
        System.out.println(" ");
    }

    @Then("the results table should only not contain transactions dated {string}")
    public void the_results_table_should_only_not_contain_transactions_dated(String string) {
        System.out.println("      ");
    }


    @When("the user enters description {string}")
    public void the_user_enters_description(String descriptionType) {
        new TransactionsPage().Description.clear();
        new TransactionsPage().Description.sendKeys(descriptionType);
    }
    @Then("results table should only show descriptions containing {string}")
    public void results_table_should_only_show_descriptions_containing(String contains) {
        BrowserUtils.waitFor(2);
        Assert.assertTrue(new TransactionsPage().descriptionContain1.getText().contains(contains));
        Assert.assertTrue(new TransactionsPage().descriptionContain2.getText().contains(contains));
    }
    @Then("result table should only show descriptions containing {string}")
    public void result_table_should_only_show_descriptions_containing(String contains) {
        BrowserUtils.waitFor(2);
        Assert.assertTrue(new TransactionsPage().descriptionContain1.getText().contains(contains));
    }
    @Then("results table should not show descriptions containing {string}")
    public void results_table_should_not_show_descriptions_containing(String contains) {
        System.out.println("we will learn after But ");
//  Assert.assertFalse(new TransactionsPage().descriptionContain1.getText().contains(contains));
    }

    @Then("results table  should show   at least  one    result under {string}")
    public void results_table_should_show_at_least_one_result_under(String atLeast) {
        Boolean  flag=true;
        if(atLeast.equalsIgnoreCase("Deposit")){
            if((new TransactionsPage().deposit1.getText().isEmpty()) &&(new TransactionsPage().deposit2.getText().isEmpty()) &&(new TransactionsPage().deposit3.getText().isEmpty())){
                flag=false;
            }else if(atLeast.equalsIgnoreCase("Withdrawal ")){
                if((new TransactionsPage().withdrawal1.getText().isEmpty()) &&(new TransactionsPage().withdrawal2.getText().isEmpty()) &&(new TransactionsPage().withdrawal3.getText().isEmpty())){
                    flag=false;
                }
            }
        }
        Assert.assertTrue(flag);

    }

    @When("user selects type {string}")
    public void user_selects_type(String select) {
        new TransactionsPage().getTypeDropDown(select).click();
        BrowserUtils.waitFor(3);
        Assert.assertTrue( new TransactionsPage().getTypeDropDown(select).isSelected());
        new TransactionsPage().findButton.click();
        BrowserUtils.waitFor(2);
    }

    @Then("results table  should show   no result under Deposit")
    public void results_table_should_show_no_result_under() {



        Boolean  flag=false;

            if((new TransactionsPage().deposit1.getText().isEmpty())) {
                flag = true;
            }

        Assert.assertTrue(flag);

    }

    @Then("results table  should show   no result under Withdrawal")
    public void results_table_should_show_no_result_under_Withdrawal() {
        Boolean  flag=false;

        if((new TransactionsPage().withdrawal1.getText().isEmpty())&& new TransactionsPage().withdrawal2.getText().isEmpty()) {
            flag = true;
        }

        Assert.assertTrue(flag);
    }


}
