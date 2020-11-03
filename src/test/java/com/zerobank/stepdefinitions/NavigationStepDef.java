package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.AccountSummaryPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class NavigationStepDef {
    @When("the   user   clicks on {string}  link   on the    Account    Summary    page")
    public void the_user_clicks_on_link_on_the_Account_Summary_page(String TypeAccount) {
        new AccountSummaryPage().AccountTypes(TypeAccount).click();


    }

    @Then("the   Account    Activity page  should be displayed")
    public void the_Account_Activity_page_should_be_displayed() {
      Assert.assertTrue(new AccountActivityPage().ShowTransactions.isDisplayed());
    }

    @Then("Account    drop   down   should have   {string} selected")
    public void account_drop_down_should_have_selected(String select) {
        Assert.assertTrue(new AccountActivityPage().DropDownSavings(select).isSelected());

    }



}


