package com.zerobank.stepdefinitions;

import com.zerobank.pages.PayBills;
import com.zerobank.pages.PurchaseForeignCurrency;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;

import java.util.List;

public class PurchaseForeignCurrencyStepDefs {

    @Given("the user accesses the Purchase  foreign    currency   cash tab")
    public void the_user_accesses_the_Purchase_foreign_currency_cash_tab() {
        new PayBills().PayBills.click();
        new PurchaseForeignCurrency().PurchaseForeignCurrency.click();
    }
    @Then("following currencies should be available")
    public void following_currencies_should_be_available(List<String> menuOptions) {
        BrowserUtils.waitFor(4);

       Assert.assertEquals(menuOptions,new PurchaseForeignCurrency().getCurrencyDropDown());

     /*  String actual="";
        for (String actualoption : new PurchaseForeignCurrency().getCurrencyDropDown()) {
            actual=actual+actualoption;

        }
        Boolean flag=false;
        for (String menuOption : menuOptions) {
            if (actual.contains(menuOption)){
               flag= true;

            }
           Assert.assertTrue(flag)
        }*/

    }
    @When("user tries to calculate cost without selecting a currency")
    public void user_tries_to_calculate_cost_without_selecting_a_currency() {
        BrowserUtils.waitFor(2);
        new PurchaseForeignCurrency().CalculateCost.click();
        BrowserUtils.waitFor(2);
    }

    @Then("error message should be displayed")
    public void error_message_should_be_displayed() {
        Alert simpleAlert = Driver.get().switchTo().alert();
        String expectedalertmessage= "Please, ensure that you have filled all the required fields with valid values.";
        String actualalertmessage= simpleAlert.getText();
        Assert.assertEquals(expectedalertmessage,actualalertmessage);
        simpleAlert.accept();

    }

    @When("user tries to calculate cost without entering a value")
    public void user_tries_to_calculate_cost_without_entering_a_value() {
        BrowserUtils.waitFor(3);
    new PurchaseForeignCurrency().currencydropdown().get(3).click();
        BrowserUtils.waitFor(2);
        new PurchaseForeignCurrency().CalculateCost.click();
        BrowserUtils.waitFor(2);

    }




}
