package com.zerobank.stepdefinitions;

import com.zerobank.pages.PayBills;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.Map;

public class NewPayeeStepDefs {


    @Given("Add New Payee tab")
    public void add_New_Payee_tab() {
        new PayBills().PayBills.click();
        BrowserUtils.waitFor(1);
        new PayBills().AddNewPayee.click();
        BrowserUtils.waitFor(2);
    }

    @Given("creates    new    payee  using following    information")
    public void creates_new_payee_using_following_information(Map<String, String> userInfo) {
        new PayBills().PayeName.sendKeys(userInfo.get("Payee Name"));
        new PayBills().PayeAddress.sendKeys(userInfo.get("Payee Address"));
        new PayBills().PayeAccount.sendKeys(userInfo.get("Account"));
        new PayBills().PayeDetails.sendKeys(userInfo.get("Payee details"));
        new PayBills().AddButton.click();
    }

    @Then("message The    new    payee  The    Law    Offices    of Hyde,  Price  &  Scharks    was successfully   created. should    be displayed")
    public void message_The_new_payee_The_Law_Offices_of_Hyde_Price_Scharks_was_successfully_created_should_be_displayed() {
        Assert.assertTrue(new PayBills().message.isDisplayed());

    }
}