package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class PurchaseForeignCurrency extends BasePage{
    public PurchaseForeignCurrency() {
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(id="pc_calculate_costs")
    public WebElement CalculateCost;
    @FindBy(xpath="//div[@id='alert_container']")
    public WebElement ErrorMessage;
    @FindBy(linkText = "Purchase Foreign Currency")
    public WebElement PurchaseForeignCurrency;
    @FindBy (css="#pc_currency.span4")
    public WebElement CurrencyDropDown;


    public List<String> getCurrencyDropDown(){
        Select stateDropDown=new Select(CurrencyDropDown);
        List<WebElement> options=stateDropDown.getOptions();
        List<String>actualOptions=new ArrayList<>();
        for (int i = 0; i < options.size(); i++) {
            actualOptions.add(options.get(i).getText());
        }
        return actualOptions;
    }
    public List<WebElement> currencydropdown(){
        Select statedropDown=new Select (CurrencyDropDown);
        List<WebElement> options=statedropDown.getOptions();
        return options;
    }
}
