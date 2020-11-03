package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSummaryPage extends  BasePage {
    public AccountSummaryPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "(//table)[1]/tbody/tr[1]/td[1]/a")
    public WebElement saving;

    @FindBy(linkText = "Cash Accounts")
    public WebElement CashAccounts;



    @FindBy(linkText = "Investment Accounts")
    public WebElement InvestmentAccounts;




    @FindBy(linkText = "Credit Accounts")
    public WebElement CreditAccounts;


    @FindBy(linkText = "Loan Accounts")
    public WebElement LoanAccounts;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/div/table/tbody/tr/td[1]/a")
    public WebElement Brokerage;


    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div/div[3]/div/table/tbody/tr[1]/td[1]/a")
    public WebElement Checking;


    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div/div[3]/div/table/tbody/tr[2]/td[1]/a")
    public WebElement CreditCard;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div/div[3]/div/table/thead/tr/th[1]")
    public WebElement AccountColumn;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div/div[3]/div/table/thead/tr/th[2]")
    public WebElement creditCardColumn;


    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div/div[3]/div/table/thead/tr/th[3]")
    public WebElement BalanceColumn;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div/div[4]/div/table/tbody/tr/td[1]/a")
    public WebElement loan;


    public WebElement AccountTypes(String Type){
        WebElement option=null;
        if(Type.equalsIgnoreCase("Savings")){
            option= saving;
        }
        else if(Type.equalsIgnoreCase("Brokerage")){
            option=Brokerage;
        }
        else   if(Type.equalsIgnoreCase("Checking")){
            option= Checking;
        }
        else   if(Type.equalsIgnoreCase("Credit Card")){
            option= CreditCard;
        }   else   if(Type.equalsIgnoreCase("Loan")){
            option= loan;
        }
        return option;
    }









}
