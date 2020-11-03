package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountActivityPage extends BasePage {


    public AccountActivityPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(linkText = "Show Transactions")
    public WebElement ShowTransactions;
    @FindBy(xpath = "//*[@id=\"all_transactions_for_account\"]/table/thead/tr/th[1]")
    public WebElement DateColumns;
    @FindBy(xpath = "//*[@id=\"all_transactions_for_account\"]/table/thead/tr/th[2]")
    public WebElement DescriptionsColumns;
    @FindBy(xpath = "//*[@id=\"all_transactions_for_account\"]/table/thead/tr/th[3]")
    public WebElement DepositColumns;
    @FindBy(xpath = "//*[@id=\"all_transactions_for_account\"]/table/thead/tr/th[4]")
    public WebElement WithdrawalColumns;
    @FindBy(id = "aa_accountId")
    public WebElement dropdown;

    public WebElement DropDownSavings(String AccountDropDown) {
        WebElement account=null;
        Select stateDropDown = new Select(dropdown);
        List<WebElement> options = stateDropDown.getOptions();
        if(AccountDropDown.equalsIgnoreCase("Savings")){
            account=options.get(0);
        }
        else if(AccountDropDown.equalsIgnoreCase("Brokerage")){
            account=options.get(5);
        }
        else if(AccountDropDown.equalsIgnoreCase("Checking")){
            account=options.get(1);
        }
        else if(AccountDropDown.equalsIgnoreCase("Loan")){
            account=options.get(3);
        }else if(AccountDropDown.equalsIgnoreCase("Credit Card")){
            account=options.get(4);
        }
        return account;
    }


}
