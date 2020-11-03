package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class TransactionsPage extends  BasePage{
    public TransactionsPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath= "//a[@href='#ui-tabs-2']/..")
    public WebElement findTransactions;

    @FindBy(xpath = "//input[@name='fromDate']")
    public WebElement fromDate;


    @FindBy(css= "#aa_toDate")
    public WebElement toDate;


    @FindBy(css = ".btn.btn-primary")
    public WebElement findButton;

    @FindBy(xpath = "//div[@id='filtered_transactions_for_account']/table/tbody/tr/td[1]")
    public WebElement lastDate;

    @FindBy(xpath = "//div[@id='filtered_transactions_for_account']/table/tbody/tr[3]/td[1]")
    public WebElement firstDate;

    @FindBy(xpath = "//div[@id='filtered_transactions_for_account']/table/tbody/tr[2]/td[1]")
    public WebElement middleDate;

    @FindBy(id="aa_description")
    public WebElement Description;


    @FindBy(xpath = "//div[@id='filtered_transactions_for_account']/table/tbody/tr[1]/td[2]")
    public WebElement descriptionContain1;


    @FindBy(xpath = "//div[@id='filtered_transactions_for_account']/table/tbody/tr[2]/td[2]")
    public WebElement descriptionContain2;

    @FindBy(xpath = "//div[@id='filtered_transactions_for_account']/table/tbody/tr[1]/td[3]")
    public WebElement deposit1;


    @FindBy(xpath = "//div[@id='filtered_transactions_for_account']/table/tbody/tr[2]/td[3]")
    public WebElement deposit2;


    @FindBy(xpath = "//div[@id='filtered_transactions_for_account']/table/tbody/tr[3]/td[3]")
    public WebElement deposit3;


    @FindBy(xpath = "//div[@id='filtered_transactions_for_account']/table/tbody/tr[1]/td[4]")
    public WebElement withdrawal1;


    @FindBy(xpath = "//div[@id='filtered_transactions_for_account']/table/tbody/tr[2]/td[4]")
    public WebElement withdrawal2;


    @FindBy(xpath = "//div[@id='filtered_transactions_for_account']/table/tbody/tr[3]/td[4]")
    public WebElement withdrawal3;


    @FindBy (id="aa_type")
    public WebElement TypeDropDown;

    public WebElement getTypeDropDown(String str){
        WebElement option=null;
        Select stateDropDown=new Select(TypeDropDown);
        List<WebElement> options=stateDropDown.getOptions();
        if(options.get(0).getText().equalsIgnoreCase(str)){
            option=options.get(0);
        }else if(options.get(1).getText().equalsIgnoreCase(str)){
            option=options.get(1);
        }else if(options.get(2).getText().equalsIgnoreCase(str)){
            option=options.get(2);
        }
        return option;
    }





















}
